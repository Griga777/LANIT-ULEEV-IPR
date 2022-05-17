package example.DataBase;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.exception.GenericJDBCException;
import org.hibernate.query.Query;

import javax.persistence.NoResultException;

import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

import static example.DataBase.PostgreSqlDataBase.*;

public class DataBaseUser {
    private static SessionFactory sessionFactory = null;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null || sessionFactory.isClosed()) {
            sessionFactory = createSession();
        }
        return sessionFactory;
    }

    public static SessionFactory createSession() {
        try {
            File file = new File("src/main/resources/config/hibernate.cfg.xml");
            Configuration cfg = new Configuration().configure(file);
            String url = cfg.getProperty("hibernate.connection.url").replace("{host}", CONNECTION_URL);
            cfg.setProperty("hibernate.connection.url", url);
            cfg.setProperty("hibernate.connection.username", USERNAME);
            cfg.setProperty("hibernate.connection.password", PASSWORD);
            cfg.setProperty("hibernate.connection.charset", "UTF-8");
            cfg.setProperty("hibernate.connection.characterEncoding", "UTF-8");
            cfg.setProperty("hibernate.show_sql", "true");
            cfg.setProperty("hibernate.jdbc.time_zone", "UTC");
            cfg.setProperty("current_session_context_class", "thread");
            return cfg.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static String getOneStringFromSql(String queryString) {
        Transaction tx = null;
        String queryResult = null;
        ArrayList list = new ArrayList<>();
        Session session = getSessionFactory().openSession();
        try {
            tx = session.beginTransaction();
            Query q = session.createSQLQuery(queryString);
            Object singleResult = q.getSingleResult();
            if (singleResult != null) {
                int length;
                try {
                    length = ((Object[]) singleResult).length;
                } catch (ClassCastException e) {
                    length = 1;
                }
                switch (length) {
                    case 1:
                        queryResult = singleResult.toString();
                        break;
                    case 0:
                        throw new AssertionError("Нет результатов");
                    default:
                        list.addAll(Arrays.asList(((Object[]) singleResult)));
                        break;
                }
            }
            tx.commit();
        } catch (GenericJDBCException e) {
            e.printStackTrace();
            throw new GenericJDBCException(String.format("%s: %s", "Невозможно подключиться к БД", CONNECTION_URL), new SQLException());
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        } catch (NoResultException e) {
            throw new NoResultException(String.format("Запрос к БД вернул 0 элементов.\nЗапрос: '%s'", queryString));
        } catch (javax.persistence.NonUniqueResultException e) {
            throw new javax.persistence.NonUniqueResultException(String.format("Запрос к БД был не уникален.\nОшибка: '%s'.\nЗапрос: '%s'", e.getMessage(), queryString));
        } finally {
            session.close();
        }
        if (queryResult != null) {
            return queryResult;
        } else {
            StringBuilder builder = new StringBuilder();
            list.forEach(p -> builder.append(p + "; "));
            return builder.toString();
        }
    }
}

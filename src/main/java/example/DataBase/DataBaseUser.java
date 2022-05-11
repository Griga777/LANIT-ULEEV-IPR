package example.DataBase;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.exception.GenericJDBCException;

import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;
import java.io.File;
import java.sql.SQLException;

import static example.DataBase.PostgreSqlDataBase.*;

public class DataBaseUser {
    private static SessionFactory sessionFactory = null;
    private static final String UNABLE_TO_CONNECT = "Невозможно подключиться к БД";
    private static final String NO_RESULTS = "Запрос к БД вернул 0 элементов.\nЗапрос: '%s'";
    private static final String NON_UNIQUE_RESULT = "Запрос к БД был не уникален.\nОшибка: '%s'.\nЗапрос: '%s'";

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

    public static void executeVoidSqlWithDeadlockRetry(String queryString) {
        Transaction tx = null;
        Session session = getSessionFactory().openSession();
        try {
            tx = session.beginTransaction();
            int updatedRows = session
                    .createSQLQuery(queryString)
                    .executeUpdate();
            tx.commit();
            System.out.printf("Обновлено %d строк\n", updatedRows);
        } catch (GenericJDBCException e) {
            e.printStackTrace();
            throw new GenericJDBCException(String.format("%s: %s", UNABLE_TO_CONNECT, CONNECTION_URL), new SQLException());
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        } catch (NoResultException e) {
            throw new NoResultException(String.format(NO_RESULTS, queryString));
        } catch (javax.persistence.NonUniqueResultException e) {
            throw new javax.persistence.NonUniqueResultException(String.format(NON_UNIQUE_RESULT, e.getMessage(), queryString));
        } catch (PersistenceException e) {
            if (e.getCause().getCause().getMessage().contains("was deadlocked on lock")) {
                if (tx != null) {
                    tx.rollback();
                }
            }
        }
        session.close();
    }
}

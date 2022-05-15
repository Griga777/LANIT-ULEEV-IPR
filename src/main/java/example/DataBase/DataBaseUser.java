package example.DataBase;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;

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
}

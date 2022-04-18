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
//            cfg.setProperty("hibernate.connection.useUnicode", "true");
//            cfg.setProperty("hibernate.show_sql", "true");
//            cfg.setProperty("hibernate.jdbc.time_zone", "UTC");
//            cfg.setProperty("hibernate.archive.autodetection", "class, hbm");
//            cfg.setProperty("hibernate.useSSL", "false");
//            cfg.setProperty("hibernate.use_sql_comments", "true");
//            cfg.setProperty("connection.provider_class", "org.hibernate.connection.C3P0ConnectionProvider");
//            cfg.setProperty("hibernate.c3p0.min_size", "1");
//            cfg.setProperty("hibernate.c3p0.max_size", "1");
//            cfg.setProperty("hibernate.c3p0.max_statements", "500");
//            cfg.setProperty("hibernate.c3p0.acquire_increment", "1");
//            cfg.setProperty("current_session_context_class", "thread");
//            cfg.setProperty("hibernate.c3p0.timeout", "1800");
//            cfg.setProperty("hibernate.c3p0.acquireRetryDelay", "15000");
//            cfg.setProperty("hibernate.c3p0.acquireRetryAttempts", "0");
//            cfg.setProperty("hibernate.c3p0.breakAfterAcquireFailure", "true");
//            cfg.setProperty("connection.autoReconnect", "true");
//            cfg.setProperty("connection.autoReconnectForPools", "true");
            return cfg.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }
}

package example.DataBase;

public class PostgreSqlDataBase {
    public static final String CONNECTION_URL;
    public static final String DATABASE_NAME;
    public static final String USERNAME;
    public static final String PASSWORD;

    static {
        CONNECTION_URL = System.getProperty("PostgreSqlDataBaseIP", "localhost");
        DATABASE_NAME = System.getProperty("DataBaseName", "testdb");
        USERNAME = System.getProperty("DataBaseLogin", "postgres");
        PASSWORD = System.getProperty("DataBasePassword", "iloveMasha*159");
    }
}

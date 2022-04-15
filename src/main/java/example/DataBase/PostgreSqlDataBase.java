package example.DataBase;

public class PostgreSqlDataBase {
    public static final String CONNECTION_URL;
    public static final String DATABASE_NAME;
    public static final String USERNAME;
    public static final String PASSWORD;

    static {
        CONNECTION_URL = System.getProperty("MsSqlDatabaseIP", "172.16.54.72");
        DATABASE_NAME = System.getProperty("DataBaseName", "users");
        USERNAME = System.getProperty("DataBaseLogin", "jenkins_user");
        PASSWORD =  Base64Util.decodeBase64(System.getProperty("DataBasePassword", "MXFhelhTV0A="));
    }
}

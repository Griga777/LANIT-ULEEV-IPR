package example.DataBase;

import org.hibernate.Session;

public class TestData {
    public static User getCurrentUser(Integer userId) {
        Session session = DataBaseUser.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        User user = session.get(User.class, userId);
        session.getTransaction().commit();
        return user;
    }

    public static String getResultSQLRequestCurrentUser(String sqlRequest) {
        String sqlResult = null;
        if (sqlRequest.contains("password")) {
            // если пароль захэширован Base64:
//            sqlResult = DataBaseUser.getOneStringFromSql(sqlRequest);
//            String decodedPassword = Base64Util.decodeBase64(sqlResult);
            // если пароль захэширован bf:
            sqlResult = DataBaseUser.getOneStringFromSql(sqlRequest);
            String decodedPassword = DataBaseUser.getOneStringFromSql("SELECT convert_from(decrypt('" + sqlResult + "', 'my_key', 'bf'), 'sql_ascii')");
            return decodedPassword;
        } else {
            sqlResult = DataBaseUser.getOneStringFromSql(sqlRequest);
        }
        return sqlResult;
    }
}

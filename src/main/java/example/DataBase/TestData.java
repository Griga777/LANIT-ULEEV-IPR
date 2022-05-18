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
            sqlResult = DataBaseUser.getOneStringFromSql(sqlRequest);
            String decodedPassword = Base64Util.decodeBase64(sqlResult);
            return decodedPassword;
        } else {
            sqlResult = DataBaseUser.getOneStringFromSql(sqlRequest);
        }
        return sqlResult;
    }
}

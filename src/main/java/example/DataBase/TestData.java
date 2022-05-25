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
        if (sqlRequest.contains("password")) {
            String sqlResult = DataBaseUser.getOneStringFromSql(sqlRequest);
            return DataBaseUser.getOneStringFromSql("SELECT convert_from(decrypt('" + sqlResult + "', 'my_key', 'bf'), 'sql_ascii')");
        } else {
            return DataBaseUser.getOneStringFromSql(sqlRequest);
        }
    }
}

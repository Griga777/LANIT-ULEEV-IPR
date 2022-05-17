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

    private static String getRequestCurrentUser(String sqlRequest, Integer userId) {
        String sqlResult = DataBaseUser.getOneStringFromSql(sqlRequest);
        return sqlResult;
    }
}

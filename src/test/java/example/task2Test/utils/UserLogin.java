package example.task2Test.utils;

public class UserLogin {
    private String key;
    private String token;

    public UserLogin(String key, String token) {
        this.key = key;
        this.token = token;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "UserLogin{" +
                "key='" + key + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}

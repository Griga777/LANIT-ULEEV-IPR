package example.DataBase;

import java.util.Base64;

public class Base64Util {
    public static String encodeBase64(String password) {
        String encodedString = Base64.getEncoder().encodeToString(password.getBytes());
        return encodedString;
    }

    public static String decodeBase64(String encodedString) {
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        return decodedString;
    }
}

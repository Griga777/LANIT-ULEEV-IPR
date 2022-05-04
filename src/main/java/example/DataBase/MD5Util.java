package example.DataBase;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class MD5Util {
    public static String cryptWithMD5(String password) throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        byte[] passBytes = password.getBytes();
        md5.reset();
        byte[] decodedBytes = md5.digest(passBytes);
        String decodedPassword = new String(decodedBytes);
        return decodedPassword;
    }

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

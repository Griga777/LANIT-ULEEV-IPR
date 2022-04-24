package example.DataBase;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {
    public static String cryptWithMD5 (String password) throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        byte[] passBytes = password.getBytes();
        md5.reset();
        byte[] decodedBytes = md5.digest(passBytes);
        String decodedPassword = new String(decodedBytes);
        return decodedPassword;
    }
}

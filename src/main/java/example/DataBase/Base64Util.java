package example.DataBase;

import java.util.Base64;

public class Base64Util {
    public static void main(String[] args) {
        String originalInput = "test input";
        String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
        System.out.println(encodedString);
    }

    public static String decodeBase64(String encodedString) {
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        return decodedString;
    }
}

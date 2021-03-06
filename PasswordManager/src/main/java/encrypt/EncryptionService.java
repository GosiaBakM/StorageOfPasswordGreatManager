package encrypt;

import org.apache.commons.codec.binary.Hex;
import org.jasypt.contrib.org.apache.commons.codec_1_3.DecoderException;
import org.jasypt.util.text.BasicTextEncryptor;

import java.util.Arrays;
import java.util.stream.Collectors;

public class EncryptionService {

    public static String encrypt(String encryptionKey, String toEncode) {
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        encryptor.setPasswordCharArray(encryptionKey.toCharArray());
        String encrypted = encryptor.encrypt(toEncode);
        return new String(Hex.encodeHex(encrypted.getBytes()));
    }

    public static String decrypt(String encryptionKey, String toDecode) {
//        try {
//            toDecode = new String(Hex.decodeHex(toDecode));
//        } catch (DecoderException e) {
//            e.printStackTrace();
//        }
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        encryptor.setPasswordCharArray(encryptionKey.toCharArray());
        return encryptor.decrypt(toDecode);
    }

    public static String[] encrypt(String encryptionKey, String[] toEncode) {

        return Arrays.stream(toEncode).map(s -> EncryptionService.encrypt(encryptionKey, s))
                .collect(Collectors.toList())
                .toArray(new String[toEncode.length]);

    }

//    public static String[] decrypt(String encryptionKey, String[] toDecode) {
//        return Arrays.stream(toDecode).map(s -> EncryptionService.decrypt(encryptionKey, s))
//                .collect(Collectors.toList())
//                .toArray(new String[toDecode.length]);
//
//    }
//
//    public static String encrypt(String encryptionKey, String toEncode) {
//        BasicTextEncryptor encryptor = new BasicTextEncryptor();
//        encryptor.setPasswordCharArray(encryptionKey.toCharArray());
//        return encryptor.encrypt(toEncode);
//    }
//
//    public static String decrypt(String encryptionKey, String toDecode) {
//        BasicTextEncryptor encryptor = new BasicTextEncryptor();
//        encryptor.setPasswordCharArray(encryptionKey.toCharArray());
//        return encryptor.decrypt(toDecode);
//    }
//
//    public static String[] encrypt(String encryptionKey, String[] toEncode) {
//
//        return Arrays.stream(toEncode).map(s -> EncryptionService.encrypt(encryptionKey, s))
//                .collect(Collectors.toList())
//                .toArray(new String[toEncode.length]);
//
//    }
//
//    public static String[] decrypt(String encryptionKey, String[] toDecode) {
//        return Arrays.stream(toDecode).map(s -> EncryptionService.decrypt(encryptionKey, s))
//                .collect(Collectors.toList())
//                .toArray(new String[toDecode.length]);
//
//    }
//}
}
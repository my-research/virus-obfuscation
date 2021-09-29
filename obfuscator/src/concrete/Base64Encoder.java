package concrete;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64Encoder implements Obfuscator {
    @Override
    public String obfuscate(String code) {
        byte[] bytes = code.getBytes();
        return Base64.getEncoder().encodeToString(bytes);
    }

    @Override
    public String revert(String obfuscatedCode) {
        byte[] revertedBytes = Base64.getDecoder().decode(obfuscatedCode);
        return new String(revertedBytes);
    }
}

package concrete;

public interface Obfuscator {
    String obfuscate(String code);
    String revert(String obfuscatedCode);
}

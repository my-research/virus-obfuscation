package concrete;

import java.util.Arrays;

public class Whitespace implements Obfuscator{
    @Override
    public String obfuscate(String code) {
        int size = code.length();
        String[] s = code.split("");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < size; i++) {
            sb.append(s[i]);
            if(i % 2 == 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    @Override
    public String revert(String obfuscatedCode) {
        String[] s = obfuscatedCode.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s1 : s) {
            sb.append(s1);
        }
        return sb.toString();
    }
}

package concrete;

import java.util.Arrays;

public class Reorder implements Obfuscator {
    @Override
    public String obfuscate(String code) {
        return reordering(code);
    }

    @Override
    public String revert(String obfuscatedCode) {
        return reordering(obfuscatedCode);
    }

    private static String reordering(String code) {
        String[] s = code.split("");
        StringBuilder sb = new StringBuilder();

        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            swap(s, start, end);

            start++;
            end--;
        }
        for (String s1 : s) {
            sb.append(s1);
        }

        return sb.toString();
    }

    private static void swap(String[] s, int index1, int index2) {
        String temp = s[index1];
        s[index1] = s[index2];
        s[index2] = temp;
    }
}

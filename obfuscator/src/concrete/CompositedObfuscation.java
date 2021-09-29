package concrete;

import creator.ObfuscationType;
import creator.ObfuscatorFactory;

import java.util.ArrayList;
import java.util.List;

public class CompositedObfuscation {

    private Obfuscator reorder = new ObfuscatorFactory(ObfuscationType.REORDER)
            .getObfuscator();

    private Obfuscator base64encoding = new ObfuscatorFactory(ObfuscationType.BASE64_ENCODING)
            .getObfuscator();

    private Obfuscator whitespace = new ObfuscatorFactory(ObfuscationType.WHITESPACE)
            .getObfuscator();

    public List<String> complexObfuscate(String code) {
        List<String> list = new ArrayList<>();
        int loop = code.length() / 10;
        int index = 0;
        while(loop-- > 0) {
            list.add(code.substring(index, index + 10));
            index += 10;
        }

        list.add(code.substring(index));
        List<String> obfuscateString = new ArrayList<>();

        obfuscateString.add(reorder.obfuscate(list.get(0)));
        obfuscateString.add(base64encoding.obfuscate(list.get(1)));
        obfuscateString.add(whitespace.obfuscate(list.get(2)));
        obfuscateString.add(reorder.obfuscate(list.get(3)));
        obfuscateString.add(base64encoding.obfuscate(list.get(4)));
        obfuscateString.add(whitespace.obfuscate(list.get(5)));
        obfuscateString.add(reorder.obfuscate(list.get(6)));

        return obfuscateString;
    }

    public String revertObfuscatedCode(List<String> list) {
        List<String> revertString = new ArrayList<>();

        revertString.add(reorder.revert(list.get(0)));
        revertString.add(base64encoding.revert(list.get(1)));
        revertString.add(whitespace.revert(list.get(2)));
        revertString.add(reorder.revert(list.get(3)));
        revertString.add(base64encoding.revert(list.get(4)));
        revertString.add(whitespace.revert(list.get(5)));
        revertString.add(reorder.revert(list.get(6)));

        return listToString(revertString);
    }

    public static String listToString(List<String> list) {
        StringBuilder sb = new StringBuilder();

        for (String s : list) {
            sb.append(s);
        }
        return sb.toString();
    }
}

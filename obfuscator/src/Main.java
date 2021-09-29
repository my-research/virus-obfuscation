import concrete.CompositedObfuscation;
import creator.ObfuscationType;
import concrete.Obfuscator;
import creator.ObfuscatorFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String malware = "X5O!P%@AP[4\\PZX54(P^)7CC)7}$EICAR-STANDARD-ANTIVIRUS-TEST-FILE!$H+H*";

        ObfuscatorFactory factory;
        Obfuscator obfuscator;
        System.out.println("\n");
        System.out.println("난독화를 수행할 Eicar Test 악성코드 command : " + malware + "\n");

        // 문자열 재배치
//        factory = new ObfuscatorFactory(ObfuscationType.REORDER);
//        obfuscator = factory.getObfuscator();
//        String reorder = obfuscator.obfuscate(malware);
//        System.out.println("[문자열 재배치가 적용된 난독화] = " + reorder);
//        System.out.println("[문자열 재배치 복구] = " + obfuscator.revert(reorder) + "\n\n");

        // Base 64 인코딩
//        factory = new ObfuscatorFactory(ObfuscationType.BASE64_ENCODING);
//        obfuscator = factory.getObfuscator();
//        String base64encoding = obfuscator.obfuscate(malware);
//        System.out.println("[base64encoding 이 적용된 난독화] = " + base64encoding);
//        System.out.println("[base64encoding 복구] = " + obfuscator.revert(base64encoding) + "\n\n");

        // whitespace
//        factory = new ObfuscatorFactory(ObfuscationType.WHITESPACE);
//        obfuscator = factory.getObfuscator();
//        String whitespace = obfuscator.obfuscate(malware);
//        System.out.println("[whitespace 가 적용된 난독화] = " + whitespace);
//        System.out.println("[whitespace 복구] = " + obfuscator.revert(whitespace) + "\n\n");


        CompositedObfuscation obfuscation = new CompositedObfuscation();

        List<String> obfuscatedList = obfuscation.complexObfuscate(malware);

        System.out.println("[복합 난독화가 적용된 eicar 명령어] = " + CompositedObfuscation.listToString(obfuscatedList));

        String reverted = obfuscation.revertObfuscatedCode(obfuscatedList);
        System.out.println("[복합 난독화가 적용된 eicar 복구] = " + reverted);
    }
}

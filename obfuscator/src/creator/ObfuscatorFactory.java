package creator;

import concrete.Base64Encoder;
import concrete.Obfuscator;
import concrete.Reorder;
import concrete.Whitespace;

public class ObfuscatorFactory {

    private Obfuscator obfuscator;

    public ObfuscatorFactory(ObfuscationType type) {
        if(type.equals(ObfuscationType.REORDER)) {
            obfuscator = new Reorder();
        } else if(type.equals(ObfuscationType.BASE64_ENCODING)) {
            obfuscator = new Base64Encoder();
        } else if(type.equals(ObfuscationType.WHITESPACE)) {
            obfuscator = new Whitespace();
        }
    }

    public Obfuscator getObfuscator() {
        return obfuscator;
    }
}

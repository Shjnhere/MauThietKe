package Strategy.Exercise;

public class CaesarEncryption implements EncryptionStrategy {

    @Override
    public String encrypt(String data) {
        return "Caesar: " + data;
    }
}

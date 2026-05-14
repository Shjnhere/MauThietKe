package Strategy.Exercise;

public class DESEncryption implements EncryptionStrategy {

    @Override
    public String encrypt(String data) {
        return "DES: " + data;
    }
}

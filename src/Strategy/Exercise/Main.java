package Strategy.Exercise;

public class Main {
    public static void main(String[] args) {

        FileEncryptor encryptor = new FileEncryptor();

        encryptor.setStrategy(new AESEncryption());
        encryptor.encryptFile("Hello");

        encryptor.setStrategy(new DESEncryption());
        encryptor.encryptFile("Hello");

        encryptor.setStrategy(new CaesarEncryption());
        encryptor.encryptFile("Hello");
    }
}

package Strategy.Exercise;

public class FileEncryptor {
    private EncryptionStrategy strategy;

    public void setStrategy(EncryptionStrategy strategy) {
        this.strategy = strategy;
    }

    public void encryptFile(String text) {

        if(strategy == null) {
            System.out.println("Chưa chọn thuật toán!");
            return;
        }

        String result = strategy.encrypt(text);

        System.out.println(result);
    }
}

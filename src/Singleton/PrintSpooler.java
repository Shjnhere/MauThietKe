package Singleton;

public class PrintSpooler {

	    // Biến static giữ instance duy nhất
	    private static PrintSpooler instance;

	    // Constructor private để không cho tạo đối tượng từ bên ngoài
	    private PrintSpooler() {
	        init();
	    }

	    // Phương thức khởi tạo phức tạp
	    private void init() {
	        System.out.println("Initializing Print Spooler...");
	        // Giả lập quá trình khởi tạo (kết nối máy in, cấu hình, v.v.)
	    }

	    // Phương thức public static để lấy instance duy nhất
	    public static PrintSpooler getInstance() {
	        if (instance == null) {
	            instance = new PrintSpooler();
	        }
	        return instance;
	    }

	    // Ví dụ một phương thức xử lý in
	    public void printDocument(String documentName) {
	        System.out.println("Printing document: " + documentName);
	    }
}

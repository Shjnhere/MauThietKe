package Singleton;

public class TestSingleton {

	    public static void main(String[] args) {

	        PrintSpooler spooler1 = PrintSpooler.getInstance();
	        spooler1.printDocument("Document1.pdf");

	        PrintSpooler spooler2 = PrintSpooler.getInstance();
	        spooler2.printDocument("Document2.pdf");

	        // Kiểm tra 2 biến có cùng một đối tượng không
	        if (spooler1 == spooler2) {
	            System.out.println("Only ONE instance exists!");
	        } else {
	            System.out.println("Different instances exist!");
	        }
	    }
}


package Prototype;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Đen");
        Rabbit r1 = new Rabbit("Bunny", 2, p1);

        System.out.println("=== ORIGINAL ===");
        System.out.println(r1);

        // ===== SHALLOW COPY =====
        Rabbit r2 = r1.cloneShallow();
        r2.getOwner().setName("Changed Owner");

        System.out.println("\n=== SHALLOW COPY ===");
        System.out.println("Original: " + r1);
        System.out.println("Clone   : " + r2);

        // ===== DEEP COPY =====
        Person p2 = new Person("Đen");
        Rabbit r3 = new Rabbit("Bunny", 2, p2);

        Rabbit r4 = r3.cloneDeep();
        r4.getOwner().setName("New Owner");

        System.out.println("\n=== DEEP COPY ===");
        System.out.println("Original: " + r3);
        System.out.println("Clone   : " + r4);
    }
}
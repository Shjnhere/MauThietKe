package Bridge;

public class Main {
    public static void main(String[] args) {
        Button b1 = new RadioButton(new Small());
        Button b2 = new DropdownButton(new Large());
        Button b3 = new CheckboxButton(new Medium());

        b1.draw();
        b2.draw();
        b3.draw();
    }
}
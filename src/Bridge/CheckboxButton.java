package Bridge;

public class CheckboxButton extends Button {

    public CheckboxButton(ButtonSize size) {
        super(size);
    }

    public void draw() {
        size.setSize();
        System.out.println("Checkbox Button");
    }
}
package Bridge;

public class RadioButton extends Button {

    public RadioButton(ButtonSize size) {
        super(size);
    }

    public void draw() {
        size.setSize();
        System.out.println("Radio Button");
    }
}
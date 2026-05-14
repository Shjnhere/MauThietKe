package State.Challenge;

public class Main {

    public static void main(String[] args) {

        Fan fan = new Fan();

        fan.increase(); // OFF -> LOW
        fan.increase(); // LOW -> MEDIUM
        fan.increase(); // MEDIUM -> HIGH
        fan.increase(); // HIGH

        System.out.println();

        fan.decrease(); // HIGH -> MEDIUM
        fan.decrease(); // MEDIUM -> LOW
        fan.decrease(); // LOW -> OFF
        fan.decrease(); // OFF
    }
}

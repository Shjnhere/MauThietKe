package Facade;

public class CarFacade {
    private Ignition ignition;
    private Handbrake handbrake;
    private Clutch clutch;
    private GearStick gearStick;
    private Accelerator accelerator;

    public CarFacade() {
        ignition = new Ignition();
        handbrake = new Handbrake();
        clutch = new Clutch();
        gearStick = new GearStick();
        accelerator = new Accelerator();
    }

    public void drive() {
        ignition.start();
        handbrake.release();
        clutch.press();
        gearStick.changeGear(1);
        clutch.release();
        accelerator.press();
    }
}

package smartHome.model;

public class Light {
    private boolean isOn;

    public void turnOn() {
        isOn = true;
        System.out.println("The light is on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("The light is off");
    }
}

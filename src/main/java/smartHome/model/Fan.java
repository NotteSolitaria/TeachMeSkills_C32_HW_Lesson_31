package smartHome.model;

public class Fan {
    public int speed;

    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("Fan speed: " + getSpeedName(speed));
    }

    private String getSpeedName(int speed) {
        switch (speed) {
            case 0:
                return "turned off";
            case 1:
                return "low";
            case 2:
                return "mid";
            case 3:
                return "high";
            default:
                return "unknown";
        }
    }
}

package smartHome.command;

import smartHome.model.Fan;

public class FanCommand implements Command {
    private Fan fan;
    private int speed;
    private int prevSpeed;

    public FanCommand(Fan fan, int speed) {
        this.fan = fan;
        this.speed = speed;
    }

    @Override
    public void execute() {
        prevSpeed = fan.speed;
        fan.setSpeed(speed);
    }

    @Override
    public void undo() {
        fan.setSpeed(prevSpeed);
    }
}

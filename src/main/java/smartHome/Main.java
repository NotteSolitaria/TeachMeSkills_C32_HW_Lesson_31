package smartHome;

import smartHome.command.FanCommand;
import smartHome.command.LightCommand;
import smartHome.command.RemoteControl;
import smartHome.model.Fan;
import smartHome.model.Light;

public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Fan bedroomFan = new Fan();

        LightCommand lightOn = new LightCommand(livingRoomLight);
        FanCommand fanHigh = new FanCommand(bedroomFan, 3);

        RemoteControl remote = new RemoteControl();
        remote.setCommand(lightOn);
        remote.setCommand(fanHigh);

        remote.executeCommands();

        remote.undoLast();
    }
}

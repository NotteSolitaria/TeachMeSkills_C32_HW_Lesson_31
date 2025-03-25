package smartHome.command;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {

    private List<Command> commands;
    private List<Command> history;

    public RemoteControl() {
        this.commands = new ArrayList<>();
        this.history = new ArrayList<>();
    }

    public void setCommand(Command command) {
        commands.add(command);
    }

    public void executeCommands() {
        for (Command cmd : commands) {
            cmd.execute();
            history.add(cmd);
        }
        commands.clear();
    }

    public void undoLast() {
        if (!history.isEmpty()) {
            history.get(history.size() - 1).undo();
            history.remove(history.size() - 1);
        }
    }

}

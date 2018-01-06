package command.example.command;

import command.basic.Command;
import command.example.device.Fan;

public class FanOnCommand implements Command {

    Fan f;

    public FanOnCommand(Fan f) {
        this.f = f;
    }

    public void execute() {
        f.on();
    }

    public void undo() {
        f.off();
    }
}

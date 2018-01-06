package command.example.command;

import command.basic.Command;
import command.example.device.Fan;

public class FanOffCommand implements Command {

    Fan f;

    public FanOffCommand(Fan f) {
        this.f = f;
    }

    public void execute() {
        f.off();
    }

    public void undo() {
        f.on();
    }
}

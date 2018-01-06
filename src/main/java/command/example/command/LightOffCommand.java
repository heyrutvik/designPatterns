package command.example.command;

import command.basic.Command;
import command.example.device.Fan;
import command.example.device.Light;

public class LightOffCommand implements Command {

    Light f;

    public LightOffCommand(Light f) {
        this.f = f;
    }

    public void execute() {
        f.off();
    }

    public void undo() {
        f.on();
    }
}

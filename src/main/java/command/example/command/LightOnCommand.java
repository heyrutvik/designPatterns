package command.example.command;

import command.basic.Command;
import command.example.device.Light;

public class LightOnCommand implements Command {

    Light f;

    public LightOnCommand(Light f) {
        this.f = f;
    }

    public void execute() {
        f.on();
    }

    public void undo() {
        f.off();
    }
}

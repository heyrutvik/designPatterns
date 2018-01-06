package command.example.command;

import command.basic.Command;
import command.example.device.Radio;

public class RadioOnCommand implements Command {

    Radio f;

    public RadioOnCommand(Radio f) {
        this.f = f;
    }

    public void execute() {
        f.tune();
        f.on();
    }

    public void undo() {
        f.off();
    }
}

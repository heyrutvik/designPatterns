package command.example.command;

import command.basic.Command;
import command.example.device.Light;
import command.example.device.Radio;

public class RadioOffCommand implements Command {

    Radio f;

    public RadioOffCommand(Radio f) {
        this.f = f;
    }

    public void execute() {
        f.off();
    }

    public void undo() {
        f.on();
    }
}

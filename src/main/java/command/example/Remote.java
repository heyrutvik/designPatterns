package command.example;

import command.basic.Command;
import command.basic.NoCommand;

public class Remote {

    Command noCommand = new NoCommand();
    Command[] onCommands;
    Command[] offCommands;
    Command lastCommand = noCommand;

    public Remote() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];
        for (int i = 0; i < 7; i++) {
            this.onCommands[i] = noCommand;
            this.offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButton(int slot) {
        lastCommand = onCommands[slot];
        onCommands[slot].execute();
    }

    public void offButton(int slot) {
        lastCommand = offCommands[slot];
        offCommands[slot].execute();
    }

    public void undoButton() {
        lastCommand.undo();
    }
}

package command.example.command;

import command.basic.Command;

public class PartyCommand implements Command {

    Command[] commands;

    public PartyCommand(Command[] commands) {
        this.commands = commands;
    }

    public void execute() {
        for (Command c: commands) {
            c.execute();
        }
    }

    public void undo() {
        for (Command c: commands) {
            c.undo();
        }
    }
}

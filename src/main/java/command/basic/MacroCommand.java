package command.basic;

public class MacroCommand implements Command {

    Command[] cs;

    public MacroCommand(Command[] cs) {
        this.cs = cs;
    }

    public void execute() {
        System.out.println("\nexecuting macro command object");
        for (Command c: cs) {
            c.execute();
        }
    }

    public void undo() {
        System.out.println("\nundoing macro command object");
        for (Command c: cs) {
            c.undo();
        }
    }
}

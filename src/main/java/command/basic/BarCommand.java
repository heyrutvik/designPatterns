package command.basic;

public class BarCommand implements Command {

    Receiver r;

    public BarCommand(Receiver r) {
        this.r = r;
    }

    public void execute() {
        System.out.println("\nexecuting bar command object");
        r.action2();
    }

    public void undo() {
        System.out.println("\nundoing bar command object");
        r.action1();
    }
}

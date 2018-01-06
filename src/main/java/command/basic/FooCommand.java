package command.basic;

public class FooCommand implements Command {

    Receiver r;

    public FooCommand(Receiver r) {
        this.r = r;
    }

    public void execute() {
        System.out.println("\nexecuting foo command object");
        r.action1();
    }

    public void undo() {
        System.out.println("\nundoing foo command object");
        r.action2();
    }
}
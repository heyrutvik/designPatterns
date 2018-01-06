package command.basic;

public class Invoker {
    Command c;
    Command lc;

    public void setCommand(Command c) {
        this.c = c;
        this.lc = new NoCommand();
    }

    public void run() {
        lc = c;
        c.execute();
    }

    public void unrun() {
        lc.undo();
    }
}
package command.basic;

public class Invoker {
    Command c;
    Command lc;

    public Invoker() {
        Command nc = new NoCommand();
        this.c = nc;
        this.lc = nc;
    }

    public void setCommand(Command c) {
        this.c = c;
    }

    public void run() {
        lc = c;
        c.execute();
    }

    public void unRun() {
        lc.undo();
    }
}
package command.basic;

public class Client {
    public static void main(String[] args) {
        Receiver r = new Receiver();
        Command foo = new FooCommand(r);
        Command bar = new BarCommand(r);
        Invoker i = new Invoker();

        i.setCommand(foo);
        i.run();
        i.setCommand(bar);
        i.run();

        i.unrun();

        Command[] cs = {foo, bar};
        Command mc = new MacroCommand(cs);
        i.setCommand(mc);
        i.run();
        i.unrun();
    }
}

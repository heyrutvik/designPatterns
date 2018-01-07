package adapter;

public class AdapterTest {

    public static void main(String[] args) {
        AdapterTest test = new AdapterTest();
        Duck d = new MallardDuck();
        test.duckBehaviour(d);
        Turkey t = new WildTurkey();
        // test.duckBehaviour(t); cant use turkey for duckBehaviour
        // turkey adapts duck behaviour
        TurkeyAdapter a = new TurkeyAdapter(t);
        test.duckBehaviour(a);
    }

    public void duckBehaviour(Duck d) {
        System.out.println("\ncalling duck behaviours");
        d.quack();
        d.fly();
    }
}

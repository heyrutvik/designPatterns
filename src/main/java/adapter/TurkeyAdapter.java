package adapter;

public class TurkeyAdapter implements Duck {

    Turkey t;

    public TurkeyAdapter(Turkey t) {
        this.t = t;
    }

    public void quack() {
        t.gobble();
    }

    public void fly() {
        for(int i = 0; i < 4; i++) {
            t.fly();
        }
    }
}

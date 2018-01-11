package proxy.remote;

public class UnlockState implements State {

    Machine m;

    public UnlockState(Machine m) {
        this.m = m;
    }

    public void coin() {
        System.out.println("machine already unlocked");
    }

    public void turn() {
        m.candy -= 1;
        System.out.println("candy disposed");
        m.setState(m.getLockState());
    }
}

package state;

public class LockState implements State {

    Machine m;

    public LockState(Machine m) {
        this.m = m;
    }

    public void coin() {
        m.coin += 1;
        System.out.println("coin inserted");
        m.setState(m.getUnlockState());
    }

    public void turn() {
        System.out.println("please insert coin first!");
    }
}

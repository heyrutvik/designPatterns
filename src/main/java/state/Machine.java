package state;

public class Machine {

    State lock;
    State unlock;
    State state;
    int coin = 0;
    int candy = 0;

    public Machine(int coin, int candy) {
        this.lock = new LockState(this);
        this.unlock = new UnlockState(this);
        this.coin = coin;
        this.candy = candy;
        this.state = this.lock;
    }

    public void coin() {
        state.coin();
    }

    public void turn() {
        state.turn();
    }

    public void print() {
        System.out.println("coin: " + coin + ", candy: " + candy);
    }

    public void setState(State s) {
        this.state = s;
    }

    public State getUnlockState() {
        return unlock;
    }

    public State getLockState() {
        return lock;
    }
}

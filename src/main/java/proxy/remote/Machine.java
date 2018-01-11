package proxy.remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/*
UnicastRemoteObject gives ability to be a remote service,
MachineRemote for consistent api for real service and proxy object
 */
public class Machine implements MachineRemote {

    State lock;
    State unlock;
    State state;
    int coin = 0;
    int candy = 0;
    String location;

    /*
    constructor need to throw exception,
    because superclass does.
     */
    public Machine(String location, int coin, int candy) {
        this.lock = new LockState(this);
        this.unlock = new UnlockState(this);
        this.coin = coin;
        this.candy = candy;
        this.location = location;
        this.state = this.lock;
    }

    public void coinOperation() {
        state.coin();
    }

    public void turnOperation() {
        state.turn();
    }

    public void print() {
        System.out.println("coin: " + coin + ", candy: " + candy);
    }

    public int getCoin() {
        return coin;
    }

    public int getCandy() {
        return candy;
    }

    public String getLocation() {
        return location;
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

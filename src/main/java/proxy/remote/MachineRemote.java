package proxy.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MachineRemote extends Remote {
    public int getCoin() throws RemoteException;
    public int getCandy() throws RemoteException;
    public String getLocation() throws RemoteException;
}

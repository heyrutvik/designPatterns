package proxy.remote;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class MachineTest {

    public static void main(String[] args) {
        try {
            Machine m = new Machine("machine", 10, 10);
            m.coinOperation();
            m.turnOperation();
            m.turnOperation();
            m.coinOperation();
            m.turnOperation();
            MachineRemote remote = (MachineRemote) UnicastRemoteObject.exportObject(m, 0);
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("machine", remote);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

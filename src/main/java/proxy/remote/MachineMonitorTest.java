package proxy.remote;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MachineMonitorTest {

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry();
            MachineRemote remote = (MachineRemote) registry.lookup("machine");
            MachineMonitor monitor = new MachineMonitor(remote);
            monitor.report();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

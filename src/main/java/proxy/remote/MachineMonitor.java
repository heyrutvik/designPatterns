package proxy.remote;

import proxy.remote.MachineRemote;

public class MachineMonitor {

    MachineRemote machine;

    public MachineMonitor(MachineRemote machine) {
        this.machine = machine;
    }

    public void report() {
        try {
            System.out.println("Machine: " + machine.getLocation());
            System.out.println("Coin: " + machine.getCoin());
            System.out.println("Candy: " + machine.getCandy());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package factory.abstractpattern;

public class WorkspaceCabinet extends Cabinet{

    CabinetFactory cf;

    public WorkspaceCabinet(CabinetFactory cf, int memory) {
        this.cf = cf;
        this.memory = memory;
    }

    public void assemble() {
        System.out.println("assembling workspace cabinet");
        this.cpu = cf.getCpu();
        this.hdd = cf.getHdd();
    }
}
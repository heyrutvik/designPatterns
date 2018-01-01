package factory.abstractpattern;

public class AlienwareCabinet extends Cabinet {

    CabinetFactory cf;

    public AlienwareCabinet(CabinetFactory cf, int memory) {
        this.cf = cf;
        this.memory = memory;
    }

    public void assemble() {
        System.out.println("assembling alienware cabinet");
        this.cpu = cf.getCpu();
        this.hdd = cf.getHdd();
    }
}
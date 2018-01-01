package factory.abstractpattern;

public class AlienwareCabinetFactory implements CabinetFactory {
    @Override
    public Cpu getCpu() {
        return new IntelCpu();
    }

    @Override
    public Hdd getHdd() {
        return new SsdHdd();
    }
}

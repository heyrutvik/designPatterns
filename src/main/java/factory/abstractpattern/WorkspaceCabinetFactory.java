package factory.abstractpattern;

public class WorkspaceCabinetFactory implements CabinetFactory {
    @Override
    public Cpu getCpu() {
        return new AmdCpu();
    }

    @Override
    public Hdd getHdd() {
        return new FlashHdd();
    }
}

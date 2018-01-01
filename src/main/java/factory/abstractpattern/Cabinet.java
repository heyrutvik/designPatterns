package factory.abstractpattern;

abstract public class Cabinet {
    Cpu cpu;
    Hdd hdd;
    int memory;

    abstract public void assemble();

    public String toString() {
        return "Assembled: " + cpu.toString() + ", " + hdd.toString() + " with " + memory + "G memory!";
    }
}
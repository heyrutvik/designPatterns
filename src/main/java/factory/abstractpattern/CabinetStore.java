package factory.abstractpattern;

abstract public class CabinetStore {

    public void make(String type) {
        Cabinet c = create(type);
        c.assemble();
        System.out.println(c);
    }

    abstract Cabinet create(String type);
}

package decorator;

public class Espresso extends Beverage {
    public Espresso() {
        desc = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}

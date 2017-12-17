package decorator;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        desc = "HouseBlend";
    }

    public double cost() {
        return 0.98;
    }
}

package decorator;

public class CafeCoffeeDay {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDesc() + " $" + beverage.cost());

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDesc() + " $" + beverage1.cost());
    }
}

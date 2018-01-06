package template;

public class Coffee extends CaffeinBeverage {
    public void brew() {
        System.out.println("dripping Coffee through filter");
    }

    public void addCondiments() {
        System.out.println("adding sugar and milk");
    }

    public boolean askCustomer() {
        return false;
    }
}

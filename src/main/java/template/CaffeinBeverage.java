package template;

public abstract class CaffeinBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (askCustomer()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    final void boilWater() {
        System.out.println("Boiling water");
    }

    final void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public static void main(String[] args) {
        CaffeinBeverage coffee = new Coffee();
        coffee.prepareRecipe();

        CaffeinBeverage tea = new Tea();
        tea.prepareRecipe();
    }

    // hook
    boolean askCustomer() {return true;}
}

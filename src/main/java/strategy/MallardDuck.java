package strategy;

import strategy.behavior.*;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new Fly();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("MallardDuck");
    }

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();

        mallardDuck.display();

        mallardDuck.performFly();
        mallardDuck.performQuack();

        mallardDuck.setFlyBehavior(new NoFly());
        mallardDuck.setQuackBehavior(new SilentQuack());

        mallardDuck.performFly();
        mallardDuck.performQuack();
    }
}
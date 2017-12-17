package strategy;

import strategy.behavior.FlyBehavior;
import strategy.behavior.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;    // program to supertype so we doesn't rely on concrete code
    QuackBehavior quackBehavior;

    public void performFly() {
        flyBehavior.fly();
    }

    // delegate operation
    public void performQuack() {
        quackBehavior.quack();
    }

    // change behavior on fly
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    // only method subclass need to implement
    public abstract void display();
}

/*
design principle
1) separate what changes and encapsulate Ex. Behavior classes
2) program to interface
3) composition rather than inheritance
 */
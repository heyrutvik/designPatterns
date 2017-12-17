package strategy.behavior;

public class NoFly implements FlyBehavior {
    public void fly() {
        System.out.println("no fly");
    }
}
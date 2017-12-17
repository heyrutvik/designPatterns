package strategy.behavior;

public class SilentQuack implements QuackBehavior {
    public void quack() {
        System.out.println("silent quack");
    }
}
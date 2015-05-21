package StrategyPattern;

public class NoFly implements FlyBehavior{

    public void fly() {
        System.out.println("Me no fly!");
    }
}

package StrategyPattern;

public abstract class Duck {
    
    FlyBehavior flybehavior;
    QuackBehavior quackbehavior;
    
    public Duck () {
        
    }
    
    public abstract void display();
    
    public void performQuack() {
        quackbehavior.quack();
    }
    
    public void performFly() {
        flybehavior.fly();
    }
    
    public void setQuackBehavior(QuackBehavior qb) {
        quackbehavior = qb;
    }
}

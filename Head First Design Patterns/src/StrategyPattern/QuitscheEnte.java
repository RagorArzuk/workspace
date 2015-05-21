package StrategyPattern;

public class QuitscheEnte extends Duck{

    public QuitscheEnte() {
        quackbehavior = new Squeak();
        flybehavior = new NoFly();
    }
    
    public void display() {
        System.out.println("Ich bin ne Quitsche Ente!");
    }
}

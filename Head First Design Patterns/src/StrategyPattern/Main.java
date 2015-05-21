package StrategyPattern;

public class Main {
    
    public static void main(String[] args) {
        Duck ente = new QuitscheEnte();
        
        ente.display();
        ente.performQuack();
        ente.performFly();
    }
}

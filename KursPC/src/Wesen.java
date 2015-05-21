
abstract class Wesen extends Thread{
    
    protected Welt dieWelt;
    protected int lpos;
    protected int bpos;
    
    Wesen(Welt w, int l, int b){
        dieWelt = w;
        lpos = l;
        bpos = b;
    }
    
    public void run() {
        boolean unterbrochen = false;
        do {
            try {
                sleep(schlafdauer());
            } catch (InterruptedException e) {
                unterbrochen=true;
            }
            if (interrupted()) {
                unterbrochen = true;
            }
        } while(!istHandelnNoetig() && !unterbrochen);
        handeln();
    }
    
    protected abstract boolean istHandelnNoetig();
    protected abstract void handeln();
    
    private static int schlafdauer() {
        return (int) (Math.round(Math.random()*5000));
    }
}

class Lebewesen extends Wesen{
    Lebewesen(Welt w, int l, int b){
        super(w, l, b);
    }
    
    protected boolean istHandelnNoetig() {
        int i = dieWelt.anzahlNachbarn(lpos, bpos);
        return (i<2)||(3<i);
    }
    
    protected void handeln() {
        Wesen w = new Leerwesen(dieWelt, lpos, bpos);
        dieWelt.setWesen(lpos, bpos, w);
        w.start();
    }
}

class Leerwesen extends Wesen {
    Leerwesen(Welt w, int l, int b){
        super(w, l, b);
    }
    
    protected boolean istHandelnNoetig() {
        return dieWelt.anzahlNachbarn(lpos, bpos) == 3;
    }
    
    protected void handeln() {
        Wesen w = new Lebewesen(dieWelt, lpos, bpos);
        dieWelt.setWesen(lpos, bpos, w);
        w.start();
    }
}


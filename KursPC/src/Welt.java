class Welt{
    final static int MXG = 20;
    private Wesen[][] weltFeld;
    private Oberflaeche oberfl;
    
    Welt(){
        weltFeld = new Wesen[MXG][MXG];
        for(int l=0;l<MXG;l++) {
            for (int b = 0;b<MXG;b++) {
                if(Math.random()<0.25) {
                    weltFeld[l][b] = new Lebewesen(this, l, b);
                } else {
                    weltFeld[l][b] = new Leerwesen(this, l, b);
                }
            }
        }
        
        oberfl = new Oberflaeche(this);
        
        for(int l=0; l<MXG;l++) {
            for(int b=0;b<MXG;b++) {
                weltFeld[l][b].start();
            }
        }
        System.out.println("Und er sah, dass es gut war.");
    }
    
    private int lebt(int l, int b) {
        if(weltFeld[l%MXG][b%MXG] instanceof Lebewesen)
            return 1;
        else 
            return 0;
    }
    
    int anzahlNachbarn(int lp, int bp){
        int l = lp + MXG;
        int b = bp + MXG;
        
        return lebt(l-1, b-1) + lebt(l-1, b) + lebt (l-1, b + 1)
                + lebt (l, b-1) + lebt(l, b) + lebt(l, b+1)
                + lebt(l+1, b-1) + lebt(l+1, b) + lebt(l+1, b+1);
    }
    
    void setWesen(int lp, int bp, Wesen w) {
        weltFeld[lp][bp] = w;
        oberfl.aktualisieren(lp, bp);
    }
    
    Wesen getWesen(int lp, int bp) {
        return weltFeld[lp][bp];
    }
}
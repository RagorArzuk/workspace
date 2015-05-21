import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Color;


public class Oberflaeche extends BaseFrame{
    
    Welt dieWelt;
    Panel p;
    
    Oberflaeche (Welt w){
        dieWelt = w;
        p = new Panel();
        p.setLayout(new GridLayout(w.MXG, w.MXG));
        
        for(int l=0; l<w.MXG; l++) {
            for (int b=0;b<w.MXG;b++) {
                p.add(new WButton(w, l, b));
            }
        }
        add(p);
        setVisible(true);
    }
    
    void aktualisieren(int lp, int bp) {
        ((WButton) p.getComponent(lp*dieWelt.MXG + bp)).aktualisieren();
        repaint();
        
    }

}

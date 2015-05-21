import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class WButton extends Button implements ActionListener{

    private Welt dieWelt;
    private int lpos;
    private int bpos;
    
    WButton(Welt w, int l, int b){
        dieWelt = w;
        lpos = l;
        bpos = b;
        this.setBackground(Color.blue);
        addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        dieWelt.getWesen(lpos, bpos).interrupt();
        System.out.println("Interrupt!");
    }
    
    public void aktualisieren() {
        Wesen w = dieWelt.getWesen(lpos, bpos);
        if(w instanceof Lebewesen) {
            this.setBackground(Color.yellow);
            repaint();
            System.out.println("Yellow!");
            System.out.println("Jetzt ist die Farbe: " + this.getBackground());
        } else {
            setBackground(Color.blue);
            repaint();
            System.out.println("Blue!");
            System.out.println("Jetzt ist die Farbe: " + this.getBackground());
        }
    }
}

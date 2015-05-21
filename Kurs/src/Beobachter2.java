import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Beobachter2 implements ActionListener{

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        
        if(s.equals("OK"))
            System.out.println("OK bestaetigt.");
        if(s.equals("Abbruch"))
            System.out.println("Abbruch gedrueckt.");
            
    }
}

import java.awt.*;
import java.awt.event.*;

public class AddiererBeobachter extends Addierer implements ActionListener{
    
    AddiererBeobachter(){
        b1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        try {
        int i = Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText());
        t3.setText(String.valueOf(i));
        } catch(NumberFormatException f) {
            System.out.println("Falscher Eingabewert! " + f.getMessage());
        }
    }
   
    
}

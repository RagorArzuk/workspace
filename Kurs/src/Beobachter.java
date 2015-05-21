import java.awt.*;
import java.awt.event.*;

public class Beobachter implements ActionListener{
    
    private TextField s1, s2, s3;
    
    Beobachter (TextField s1, TextField s2, TextField s3){
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
    
    public void actionPerformed(ActionEvent e) {
        int i = new Integer(s1.getText()) + new Integer(s2.getText());
        s3.setText(String.valueOf(i));
    }
}

import java.awt.*;
import java.awt.event.*;

public class MiniRechner extends AddiererBeobachter implements ActionListener{
    protected Button b2;
    
    MiniRechner(){
        b2 = new Button("multipliziere");
        b2.addActionListener(this);
        add(b2);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("addiere")) {
            super.actionPerformed(e);
        } else
            try {
                Integer prod = new Integer(t1.getText()) * new Integer(t2.getText());
                t3.setText(String.valueOf(prod));

        } catch (NumberFormatException f) {
            System.out.println("Falscher Eingabewert! " +f.getMessage() );
        }
    }
}
import java.awt.*;
import java.awt.event.*;

public class DoButton extends Button implements ActionListener{

    public DoButton(String s) {
        super(s);
        addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {}
}

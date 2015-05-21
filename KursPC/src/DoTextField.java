import java.awt.*;
import java.awt.event.*;

public class DoTextField extends TextField implements ActionListener{

    public DoTextField(String s, int n) {
        super(s, n);
        addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {}
    
}

import java.awt.*;
import java.awt.event.*;

class BaseFrame extends Frame {

    
    BaseFrame() {
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setSize(400, 300);
        this.setLocation(100, 100);
    }
}

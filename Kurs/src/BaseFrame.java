import java.awt.*;
import java.awt.event.*;

public class BaseFrame extends Frame{

    public BaseFrame() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setSize(400,300);
        setLocation(100,100);
    }
}

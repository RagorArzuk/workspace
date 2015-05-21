import java.awt.*;
import java.awt.event.*;

public class AddiererTest {

    public static void main(String[] args) {
        Addierer f = new MiniRechner();
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        f.setVisible(true);
    }
}

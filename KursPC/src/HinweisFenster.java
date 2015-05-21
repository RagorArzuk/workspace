import java.awt.*;
import java.awt.event.*;

public class HinweisFenster extends Dialog{

    Label hinweisLabel;
    
    public HinweisFenster(Frame f, String hinw) {
        super(f, true);
        hinweisLabel = new Label(hinw, Label.CENTER);
        this.add(hinweisLabel, BorderLayout.CENTER);
        
        Button ok = new DoButton("ok") {
            public void actionPerformed(ActionEvent e) {
                HinweisFenster.this.setVisible(false);
            }
        };
        this.add(ok, BorderLayout.SOUTH);
        
        setSize(200, 100);
        setLocation(400, 200);
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                HinweisFenster.this.setVisible(false);
            }
        });
     }
    
    public void setText(String s) {
        hinweisLabel.setText(s);
    }
}

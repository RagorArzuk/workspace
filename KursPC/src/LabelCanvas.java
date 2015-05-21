import java.awt.*;
import java.awt.event.*;

public class LabelCanvas extends Canvas{

    private String word;
    
    public LabelCanvas(String s) {
        word = s;
    }
    
    public void paint (Graphics g) {
        g.drawString(word, 3, 200);
    }
    
    public void setText(String s) {
        word = s;
        repaint();
    }
}

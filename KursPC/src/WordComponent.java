import java.awt.*;
import java.awt.event.*;

public class WordComponent extends Canvas {

    private String word;
    private int hoffset;
    private Dimension size;
    
    public WordComponent(String s) {
        word = s;
        setFont(new Font("Serif", Font.PLAIN, 14));
        FontMetrics fm = getFontMetrics(getFont());
        int descent = fm.getMaxDescent();
        int height = fm.getHeight();
        size = new Dimension(fm.stringWidth(s), height);
        hoffset = height-descent;
    }
    
    public Dimension getMinimumSize() {
        return size;
    }
    
    public Dimennsion getPreferredSize() {
        return size;
    }
    
    public void paint(Graphics g) {
        g.drawString(word, 0, hoffset);
    }
}

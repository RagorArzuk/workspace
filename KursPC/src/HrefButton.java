import java.awt.*;
import java.awt.event.*;

public class HrefButton extends Button{

    String href;
    Dimension size;
    
    HrefButton(String l, String hr){
        super(l);
        href = hr;
    }
    
    public String getHref() {
        return href;
    }
    
    public Dimension getMinimumSize() {
        Graphics g = getGraphics();
        if(size!=null) {
            return size;
        } else if (g == null) {
            return super.getPreferredSize();
        } else {
            Dimension d = super.getPreferredSize();
            FontMetrics fm = g.getFontMetrics();
            int textb = fm.stringWidth(getLabel());
            int texth = fm.getHeight();
            size = new Dimension(textb+2*(d.width-textb)/3,
                    texth+(d.height - texth)/2);
            
            return size;
        }
    }
}

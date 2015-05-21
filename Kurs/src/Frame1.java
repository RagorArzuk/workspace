import java.awt.*;
import java.awt.event.*;


public class Frame1 extends Frame implements ContainerListener, WindowListener {
    int countButton = 0;
    
    Frame1(String s){
        this.setTitle(s);
        this.addContainerListener(this);
        this.addWindowListener(this);
    }
    
    public void componentAdded(ContainerEvent e) {
        Component o = e.getChild();
        if(o instanceof Button)
            countButton++;
        System.out.println("Buttonzaehler: " + countButton);
        this.invalidate();
        this.validate();
    }
    
    public void componentRemoved(ContainerEvent e) {
        Component o = e.getChild();
        if(o instanceof Button)
            countButton--;
        System.out.println("Buttonzaehler: " + countButton);
        this.invalidate();
        this.validate();
    }
    
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
    
    public void windowClosed(WindowEvent e) {}
    public void windowOpened(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
}

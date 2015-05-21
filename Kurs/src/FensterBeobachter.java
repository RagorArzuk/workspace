import java.awt.event.*;
import java.awt.*;


public class FensterBeobachter implements WindowListener{
    
    public void windowClosing(WindowEvent e) {
        System.out.println("WindowClosing!");
        ((Window) e.getSource()).dispose();
    }
    public void windowClosed(WindowEvent e) {
        System.out.println("WindowClosed!");
        System.exit(0);
    }
    public void windowOpened(WindowEvent e) {System.out.println("WindowOpened!");}
    public void windowIconified(WindowEvent e) {System.out.println("WindowIconified!");}
    public void windowDeiconified(WindowEvent e) {System.out.println("WindowDeiconified!");}
    public void windowActivated(WindowEvent e) {System.out.println("WindowActivated!");}
    public void windowDeactivated(WindowEvent e) {System.out.println("WindowDeactivated!");}
    
}

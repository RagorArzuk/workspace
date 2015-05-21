import java.awt.*;
import java.awt.event.*;

public class Addierer extends Frame{

    protected Button b1;
    protected TextField t1, t2, t3;
    
    public Addierer(){
        setLayout(new FlowLayout());
        setSize(300, 100);

        b1 = new Button("addiere");
        
        t1 = new TextField("4", 4);
        t2 = new TextField("2", 4);
        t3 = new TextField(4);
        t3.setEditable(false);
       
        add(t1);
        add(t2);
        add(t3);
        add(b1);
    }
}

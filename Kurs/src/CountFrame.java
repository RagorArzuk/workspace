import java.awt.*;
import java.awt.event.*;

public class CountFrame extends Frame implements ActionListener{

    protected Counter count;
    protected Frame f;
    protected Panel p;
    protected TextField tf;
    protected Button i, d, q;
    private int tfValue;
    
    public CountFrame(int tv) {
        tfValue = tv;
        f = new Frame();
        p = new Panel(new FlowLayout());
        setLocation(100, 100);
        count = new Counter(tfValue);
        
        
        tf = new TextField(3);
        tf.setEditable(false);
        tf.setText(count.toString());
        i = new Button(">");
        d = new Button("<");
        q = new Button("quit");
        
        i.addActionListener(this);
        d.addActionListener(this);
        q.addActionListener(this);
        tf.addActionListener(this);
        
        p.add(d);
        p.add(tf);
        p.add(i);
        
        add(p, BorderLayout.CENTER);
        add(q, BorderLayout.SOUTH);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setSize(120, 100);
    }
    
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getActionCommand().equals("<"))
                count.dec();
            if(e.getActionCommand().equals(">"))
                count.inc();
            if(e.getActionCommand().equals("quit"))
                count.reset();
            tf.setText(count.toString());
        } catch(NumberFormatException f) {
            System.out.println("Falsche Eingabe!");
        }
    }
}

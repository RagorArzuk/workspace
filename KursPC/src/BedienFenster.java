import java.awt.*;
import java.awt.event.*;

import java.util.StringTokenizer;

public class BedienFenster extends BaseFrame{
    
    String text;
    NetzSurfer surferAppl;
    Panel mhtmlDisplay;
    
    public BedienFenster(NetzSurfer sa) {
        surferAppl = sa;
        
        Panel schaltp = new Panel();
        
        Button zursf = new DoButton("zurueck") {
            public void actionPerformed(ActionEvent e) {
                surferAppl.zurueckgehen();
            }
        };
        schaltp.add(zursf);
        
        Button vorsf = new DoButton("vor") {
            public void actionPerformed(ActionEvent e) {
                surferAppl.vorgehen();
            }
        };
        schaltp.add(vorsf);
        
        Button neusf = new DoButton("neu") {
            public void actionPerformed(ActionEvent e) {
                new NetzSurfer();
            }
        };
        schaltp.add(neusf);
        
        Button endsf = new DoButton("ende") {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };
        schaltp.add(endsf);
        
        TextField urlzeile = new TextField("", 25);
        urlzeile.setEditable(true);
        urlzeile.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                surferAppl.laden(e.getActionCommand());
            }
        });
        
        Panel bedienp = new Panel(new GridLayout(2,1));
        
        bedienp.add(schaltp);
        bedienp.add(urlzeile);
        
        mhtmlDisplay = new Panel(new TextLayout());
        mhtmlDisplay.setBackground(Color.white);
        
        add(bedienp, BorderLayout.NORTH);
        add(mhtmlDisplay, BorderLayout.CENTER);
    }
    
    void aktualisieren() {
        setTitle(surferAppl.aktSeite.getTitel());
        text = surferAppl.aktSeite.getInhalt();
        
        mhtmlDisplay.removeAll();
        addMhtmlComponents(mhtmlDisplay, text);
        setVisible(true);
    }
    
    void addMhtmlComponents(Container p, String s) {
        StringTokenizer st = new StringTokenizer(s, " \n\r\t");
        
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            
            if(token.equals("<BR>")) {
                p.add(new BrMark());
            } else if (token.equals("<A") && st.hasMoreTokens()) {
                token = st.nextToken();
                if(token.indexOf("HREF=\"") == 0 && token.endsWith("\">")) {
                    String href = token.substring(6, token.length()-2);
                    
                    String aufKnopf = "";
                    while (st.hasMoreTokens()) {
                        token = st.nextToken();
                        if (token.equals("</A")) break;
                        aufKnopf += (" " + token);
                    }
                    
                    aufKnopf.substring(1);
                    
                    HrefButton hb = new HrefButton(aufKnopf, href);
                    hb.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            surferAppl.laden(((HrefButton) e.getSource()).getHref());
                        }
                    });
                    p.add(hb);
                }
            } else {
                p.add(new WordComponent(token));
            }
        }
    }
}

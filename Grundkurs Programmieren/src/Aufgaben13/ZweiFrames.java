package Aufgaben13;

import java.awt.FlowLayout;
import java.io.*;
import java.util.Scanner;

import GUI.*;

public class ZweiFrames {

    public static void main(String[] args) {
        FrameSwing fenster = FrameSwing.erzeugeFrameSwing("Das erste Fenster", 400, 250);
        
        fenster.setVisible(true);
        
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Scanner in = new Scanner(System.in);
            
            System.out.println("Neuer Fenstertitel: ");
//            fenster.setTitle(br.readLine());
            fenster.setTitle(in.nextLine());
            
            System.out.println("Neue Fenster-Breite: ");
            int width = in.nextInt();
            System.out.println("Neue Fenster-Höhe: ");
            int height = in.nextInt();
            fenster.setSize(width, height);
            
            System.out.println("Fenster unsichtbar machen mit Eingabetaste: ");
            System.in.read();
            fenster.setVisible(false);
            
            System.out.println("Fenster sichtbar machen mit Eingabetaste: ");
            System.in.read();
            fenster.setVisible(true);
            
            System.out.println("Fenster auf die Koords(300, 10) versetzen.");
            System.in.read();
            fenster.setLocation(300, 10);
            
            System.out.println("Noch ein Fenster erzeugen: ");
            System.in.read();
            FrameSwing fenster2 = FrameSwing.erzeugeFrameSwing("Zweites Fenster", 300, 150, new FlowLayout());
            fenster2.setVisible(true);
            
            
            in.close();
            br.close();
        } catch(IOException e) {
            System.out.println("Something's worng.");
        }
        
        
    }
}

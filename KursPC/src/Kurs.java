import java.util.*;
import java.util.LinkedList;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

class Kurs{

    public static void main(String[] args) throws IOException{

        

        
        
        
//        String test = "hello";
//        CharEingabeStrom cs; 
//        cs = new StringLeser(test);
//        cs = new GrossBuchstabenFilter(cs); 
//        
//        int[] c = new int[test.length()];
//        char[] ch = test.toCharArray();
//        
//        for (int i=0; i<test.length();i++) {
//            ch[i] = (char)cs.read();
           
            
//            
//            System.out.print(ch[i]);
//        }
//        String check = ch.toString();
//        System.out.println(check);
//        
        
        
        
        
        
////      
//        int[] feld = {7,5,6,4,1,8};
//       
////        for(int i=0;i<feld.length;i++) {
////           
////           feld[i] = n;
////           n--;
////        }
//        
//        for (int i=0;i<feld.length;i++ )
//            System.out.println(feld[i]);
//        
//        System.out.println();
//        
//        int x, i=0, j=5;
//     
//        
//        while (SortAlgs.findPair(feld, i, j)) {
//            x = feld[i];
//            feld[i] = feld[j];
//            feld[j] = x;
//        }
//        
//        
//        
//        for (int y=0;y<feld.length;y++ )
//            System.out.println(feld[y]);
//    
    
        
//        LinkedList<Integer> liste1 = new LinkedList<Integer>();
//        LinkedList<Integer> liste2 = new LinkedList<Integer>();
//        LinkedList<Integer> liste3 = new LinkedList<Integer>();
//        LinkedList<Integer> liste4 = new LinkedList<Integer>();
//        LinkedList<Integer> liste5= new LinkedList<Integer>();
//        
//        
//        LinkedList<Integer>[] listeA = new LinkedList[5]; 
//        
//        liste1.addLast(1);
//        liste1.addLast(2);
//        liste1.addLast(4);
//        listeA[0] = liste1;
//        
//        liste2.addLast(2);
//        liste2.addLast(1);
//        liste2.addLast(4);
//        listeA[1] = liste2;
//        
//    
//        liste3.addLast(3);
//        liste3.addLast(5);
//        listeA[2] = liste3;
//        
//        liste4.addLast(4);
//        liste4.addLast(5);
//        listeA[3] = liste4;
//        
//        liste5.addLast(5);
//        liste5.addLast(3);
//        listeA[4]=liste5;   
//        
//        
//        
//        
//        
//       
//        
//        
//        for (int i=0;i<listeA.length;i++) {
//            dfs(listeA[i], visited);
//        }
//        
        
        
        
        
        
        
        
        
//        int[] unsortiert = {3, 3, 3,2,1, 1, 1 };
//        int[] sortiert;
//        
//        SortAlgs.aufgabeSort(unsortiert);
//        
//        for(int i=0;i<unsortiert.length;i++)
//            System.out.println(unsortiert[i]);
//        
        
        
        
        
        
        
        
        
        
//        Object obj = new Object();
//        
//        Tree t1 = new Tree();
//        
//        
//        t1.value = obj;
//        Tree t11 = new Tree();
//        t1.children[0] = t11;
//        t11.children[0] = null;
//        t11.children[1] = null;
//        
//        Tree t2 = new Tree();
//        t2.value = obj;
//        
//        Tree t21 = new Tree();
//        t2.children[0] = t21;
//        
//        Tree t3 = new Tree();
//        
//        t21.children[0] = t3;        
//        
//        Tree t31 = new Tree();
//        
//        t3.value = t31;
//        t3.children[0] = t31;
//        t31.children[0] = null;
//        t31.children[1] = null;
//        
//        t21.children[1] = t3;
//        
//        Tree t4 = new Tree();
//        t21.children[1] = t4;
//        t4.value = t4;
//        
//        Tree t41 = new Tree();
//        
//        t4.children[0] = t41;
//        t41.children[0] = null;
        
//        ALTERNATIVE
//        
//        Tree t2 = new Tree();
//        Tree t3 = new Tree();
//        Tree t4 = new Tree();
//        t1.value = obj;        
//        t2.value = obj;        
//        t3.value = t3.children;
//        t4.value = t4;
//      
//        t1.children = new Tree[2];
//
//        t2.children = new Tree[2];
//        t2.children[0] = t3;        
//        t2.children[1] = t4;
//        
//        t3.children = new Tree[2];
//        
//        t4.children = new Tree[1];
        
        
        
        
     
        
        
        
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
//        Tag t = new Tag();
//        
//        t.setTag(Tag.Wochentag.Di);
//       
//        System.out.println(t.getTag());
        
        
        
        
        
        
        
        
        
        
//        
//        FigurenListe f = new FigurenListe();
//        
//        kreis k1 = new kreis();
//        kreis k2 = new kreis();
//        
//        rechteck r1 = new rechteck();
//        rechteck r2 = new rechteck();
//        
//        f.figurAnfuegen(k1);
//        f.figurAnfuegen(r1);
//        f.figurAnfuegen(r2);
//        f.figurAnfuegen(k2);
//        
//        f.alleAnzeigen();
        
        
        
        
//       Aktie VW = new Aktie("VW", 270);
//       Aktie BMW = new Aktie("BMW", 548);
//       
//       Beobachter peter = new Boaersianer1();
//       VW.anmeldenBeobachter(peter);
//       
//       Beobachter georg = new Boersianer2();
//       VW.anmeldenBeobachter(georg);
//       BMW.anmeldenBeobachter(georg);
//       
//       
//       
//       while (true) {
//           System.out.print("VW: " + VW.getKursWert());
//           System.out.println("\t\tBMW: " + BMW.getKursWert());
//           VW.setKursWert(VW.getKursWert() + (int)Math.round(Math.random()*10) - 5);
//           BMW.setKursWert(BMW.getKursWert() + (int)Math.round(Math.random()*10) - 5);
//           try {Thread.sleep(4000);} catch (Exception e) {}
//       }
//        
//        
//        
//     RGBFarben.Farben f1  = RGBFarben.Farben.rot;
//     RGBFarben.Farben f2 = RGBFarben.Farben.blau;
//     
//     System.out.println(f1.toRGB());
     
        
        
        
        
//        LinkedList<Object> liste = new LinkedList<Object>();
//        
//        liste.addLast("Hello");
//        liste.addLast(1);
//        liste.addLast("World!");
//        liste.addLast(2014);
//        liste.addLast(2);
//        liste.addLast(3);
//        liste.addLast(4);
//        
//        for (Object current : liste)
//            System.out.println(current); 
        
        
//        ListIterator<Object> lit = liste.listIterator();
//        
//        liste.addLast(5);
//        liste.addLast(6);
//        
//        ListIterator<Object> lit2 = liste.listIterator();
//
//        while(lit2.hasNext()) {
//            Object ovar = lit2.next();
//            if (IstInt(ovar))
//                System.out.println(getInt(ovar));
//                
//        }
        
        
        
        
        
        
//        ArrayList<Student> test2 = new ArrayList<Student>();
//               
//        test2.add(new Student("1", 1, 2, 3));
//        test2.add(new Student("2", 1, 2, 3));
//        test2.add(new Student("3", 1, 2, 3));
//        
//        test2.remove(1);
//        for(int i=0; i<test2.size();i++)
//            test2.get(i).drucken();
//        
//        System.out.println(test2.size());
//        
//        System.out.println(test2.contains(1));
        
        
        
        
        
        
//        StudentExt[] studentExtFeld = new StudentExt[3];
//        
//        Student[] studentFeld = studentExtFeld;
//        
//        studentFeld[0] = new StudentExt("Waldemar", 1, 2, 3, 5);
//        studentFeld[1] = new StudentExt("Waldemar", 1, 2, 3, 5);
//        studentFeld[2] = new StudentExt("Waldemar", 1, 2, 3, 5);
//        
//        sort(studentExtFeld);
//        
//        
//        for(int i=0; i<studentFeld.length;i++) {
//            studentFeld[i].drucken();
//        }
       
      
      
        
//        LinkedList1<Druckbar> li = new LinkedList1<Druckbar>();
//        Student test = new Student("Waldemar", 1, 2 ,3 );
//        
//      
//        
//        li.addLast(test);
//        
////        li.addLast(new StudentExt("2", 132, 2, 1, 5));        
////        li.addLast(new StudentExt2("3", 132, 2, 1, 6, 7));
////        li.addLast(new DruckbarKlasse(100));
//        
//        LinkedList1<Druckbar>.ListIterator lit = li.listIterator();
//        
//        while (lit.hasNext())
//            lit.next().drucken();
//        
//       li.printAll();
    
        

        
        
        
        
//        LinkedList<Object> liste = new LinkedList<Object>();
//        
//        liste.addLast(new Student("Waldemar", 1828821, 21212,1));
//        liste.addLast(new String("Noch ein Listenelement"));
//
//        liste.addLast(7);
//        int i = ((Integer) liste.getLast()).intValue();
//        System.out.println(i);
//        
//        liste.getFirst();
//        
//        
//        ListIterator<Object> lit = liste.listIterator();
//       
//        
//        while (lit.hasNext()) {
//            Object ovar = lit.next();
//            System.out.println(ovar);
//        }
//        

       
        
        
//    Druckbar studi = new StudentExt("Waldemar", 19881229, 7971613, 2, 10);        
//    DruckMitLaufNr.nrDrucken(studi);
//    
//    StudentExt2 studi1 = new StudentExt2("Waldemar", 19881229, 7971613, 2, 10, 50);    
//    DruckMitLaufNr.nrDrucken(studi1);
//        
        
//        LinkedList1<Druckbar> liste = new LinkedList1<Druckbar>();
//        Student[] stud = new Student[10];
//        CC[] cc = new CC[10];
//        
//        for (int i=0;i<stud.length;i++) {
//            stud[i] = new Student("Test NR: ", i+1, i+1, i+1);
//           
//            liste.addLast(stud[i]);         
//            
//            } 
//        
//        for (int i=0;i<stud.length;i++) {
//            
//            cc[i] = new CC();
//           
//            liste.addLast(cc[i]);
//            
//            } 
//        
//        
//        
//        
//        Behaelter cont = new Behaelter(liste);
//        cont.alle_drucken();
      
        
        
    }
}


//class Kurs{        
// 
//   
//    public static void main(String[] args) {
//        
//        MemoFrame f = new MemoFrame();
//        
//        f.setSize(300, 200);
//        f.setVisible(true);
//        
//        f.setBackground (Color.red);
//        f.update(f.getGraphics());
//        try {Thread.sleep(4000);} catch (Exception e) {}
//        
//        f.setBackground (Color.green);
//        f.update(f.getGraphics());
//        try {Thread.sleep(4000);} catch (Exception e) {}
//        
//        f.setLastFrame();
//        f.update(f.getGraphics());
//        try {Thread.sleep(4000);} catch(Exception e) {};
//        
//        System.exit(0);
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        
//       
////        LinkedList1<String> t1 = new LinkedList1<String>();
////        
////        t1.addLast("hello");
////        t1.addLast("wie");
////        t1.addLast("gehts");
////        
////        LinkedList1<String>.ListIterator lit = t1.listIterator();
////        
////        while (lit.hasNext()) {
////            System.out.println(lit.getNext());
////            String adp = lit.next();
////            System.out.println(adp);
////        }
////        
////        LinkedList1<Integer> li = new LinkedList1<Integer>();
////        
////        li.addLast(1);
////        li.addLast(2);
////        li.addLast(3);
////        
////        LinkedList1<Integer>.ListIterator liter = li.listIterator();
////        while(liter.hasNext()) {
////            Integer i = liter.next();
////            System.out.println(i);
////        }
////        
////        LinkedList1.Test<Integer> entry = new LinkedList1.Test<Integer> (new Integer(5), null, null);
////       
//        
//        
//    }
//}
//
//    
//
//
//
//
//
//
//

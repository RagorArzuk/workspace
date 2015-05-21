
    public class Student implements Person, Druckbar{
        private String name;
        private int geburtsdatum;
        private int martrikelnr;
        private int semester;
        
        
        public Student (String n, int gd, int mn, int sem) {
            name = n;
            geburtsdatum = gd;
            martrikelnr = mn;
            semester = sem;
        }
        
        Student(){}
        
        @Override
        public String toString() {
            System.out.println("Name:                  " + name);
            System.out.println("geburtsdatum:          " + geburtsdatum);
            System.out.println("martrikelnr:           " + martrikelnr);
            System.out.println("semester:              " + semester);      
            
            return ("Student");
        }
        
        @Override
        public String getName() {return name;};
        @Override
        public int getGeburtsdatum() { return geburtsdatum;}
        public int getMartrikelnr() {return martrikelnr;}
        public int getSemester() {return semester;}
        @Override
        public void drucken() {
            System.out.println("Name:                  " + name);
            System.out.println("geburtsdatum:          " + geburtsdatum);
            System.out.println("martrikelnr:           " + martrikelnr);
            System.out.println("semester:              " + semester);      
        }
        @Override
        public boolean hat_Geburtstag(int datum) {
            return (geburtsdatum%10000) == (datum%10000);
        }
    }



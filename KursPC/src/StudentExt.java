
public class StudentExt extends Student {
    
    private int ext;

    public StudentExt (String n, int gd, int mn, int sem) {
        super(n, gd, mn, sem);
    }
    
     StudentExt(String n, int gd, int mn, int sem, int ext){
         super( n,  gd,  mn,  sem);
         this.ext = ext;
     }
     
     public String toString() {
         super.toString();
         System.out.println("Ext: " + ext);
       
         return "StudentExt";
     }
}

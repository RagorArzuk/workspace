
public class StudentExt2 extends StudentExt  {

    private int ext2;
    
    StudentExt2(String n, int gd, int mn, int sem, int ext, int ext2){
        super(n, gd, mn, sem, ext);
        this.ext2 = ext2;
    }
    
    public StudentExt2 (String n, int gd, int mn, int sem) {
        super(n, gd, mn, sem);
    }
    
    public void drucken() {
        System.out.println("Hello World!");
    }
}

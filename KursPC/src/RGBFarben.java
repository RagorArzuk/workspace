
public class RGBFarben {

    enum Farben{
        rot(255, 0, 0), 
        gruen(0, 255, 0), 
        blau(0, 0, 255), 
        gelb(255, 255, 0),
        weiss(255, 255, 255);
        
        final int r;
        final int g;
        final int b;
        
        Farben(int r, int g, int b){
            this.r = r;
            this.g = g;
            this.b = b;
        }
        
        public String toRGB() {
            return "(" + r + "," + g + "," + b + ")";
        }
    }
    
   
   

    
    
}
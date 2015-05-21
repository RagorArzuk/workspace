package StaticMethodeUndPackageImportUndSystemArrayCopy;


import StaticNonStatic.StaticMethode;


public class Main {

    public static void main (String[] args) {
        StaticMethode.staticAction();
        
        
//        SYSTEM.ARRAYCOPY(AUSGANGSOBJEKT, STATTPOSAUSGANGSOBJEKT, ZIELOBJEKT, STARTPOSZIELOBJEKT, LÄNGE):
        
        int[] array1 = { 
                1, 2, 3, 4
        };
        
        int[] array2 = new int[array1.length];
        
        
        System.arraycopy(array1, 0, array2, 0, array1.length);
        
        System.out.println("Array1 beinhaltet: ");
        for(int current : array1)
            System.out.println(current);
        
        System.out.println("Array2 beinhaltet: ");
        for(int current : array2)
            System.out.println(current);
        
//        FOR (Rückgabewert current : ausDemObjekt){
//               Anweisung;
//        }
        
    }
}

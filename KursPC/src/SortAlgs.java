
public class SortAlgs {
    
    private static void swap(int[] S, int n, int m) {
        int tmp=S[n];
        S[n] = S[m];
        S[m] = tmp;
    }
    
    
    public static void selectionSort(int[] sortieren) {
        int min;
        int minIndex;
        for (int i=0; i<sortieren.length-1; i++) {
            min = sortieren[i];
            minIndex = i;
            for(int y=i + 1; y<sortieren.length;y++) {
                if(sortieren[y]<min) {
                    min = sortieren[y];
                    minIndex = y;
                }
            }
            swap(sortieren, i, minIndex);
        }      
    }
    
    public static void insertionSort(int[] S) {
        int r;
        int j;
        for (int i=1; i<S.length;i++) {
            r=S[i];
            j=i-1;
            while (j>= 0 && r<S[j]) {
                S[j+1]=S[j];
                j--;
            }
            S[j+1] = r;
        }
    }
    
    public static void BubbleSort(int[] S) {
       for (int i=1;i<S.length;i++) {
           for (int j=S.length-1;j>=i;j--) {
               if (S[j]<S[j-1])
                   swap(S, j, j-1);
           }
       }
    }
    
    private static int findx(int[] S, int i, int j) {
        int k=i+1;
        while (k<=j && (S[k]==S[k-1]))
            k++;
        if(k>j) {
            return -1;} else if (S[k-1]<S[k]) {
                return k;}
            else    
                return k-1;
    }
    
    private static int partition(int[] S, int i, int j, int x) {
        int l=i;
        int r=j;
        while (l<r) {
            while (S[l]<x)
                l++;
            while (S[r]>=x)
                r--;
            if (l<r)
                swap(S, l, r);
        }
        return l;
    }
    
    private static void quickSort(int[] S, int i, int j) {
        int k, xIndex;
        if(i<j) {
            xIndex = findx(S, i, j);
            if(xIndex!=-1) {
                k = partition(S, i, j, S[xIndex]);
                quickSort(S, i, k-1);
                quickSort(S, k, j);
            }
        }
    }
    
    public static void quickSort(int[] S) {
        quickSort(S, 0, S.length-1);
    }
    
  
    
    
    
    public static void aufgabeSort(int[] S) {
        int m, p;
        boolean b;
        
        for(int i=S.length - 1;i>= 1;i--) {
            m = S[i];
            p = i;
            b = true;
            while ((p<S.length) && b) {
                if (m>S[p+1]) {
                    S[p] = S[p+1];
                    p++;
                } else
                    b = false;
            }
            S[p] = m;
        }
        
    }
    
public static boolean findPair(int[] S, int i, int j) {
    j = 1;
    
    while (j<=S.length-1) {
        if (S[j]<S[j-1]) {
            i = j - 1;
            return true;
        }
        j++;
    }
    return false;
}
    
    
    
}


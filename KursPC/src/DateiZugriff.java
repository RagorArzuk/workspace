import java.io.*;

public class DateiZugriff {

    public static void schreiben(String dateiname, String s) throws IOException{
        PrintWriter out;
        out = new PrintWriter(new FileWriter(dateiname));
        out.print(s);
        out.close();
    }
    
    public static String lesen(String dateiname)throws FileNotFoundException, IOException{
        BufferedReader in = new BufferedReader(new FileReader(dateiname));
        StringBuffer inputstr = new StringBuffer("");
        String line;
        line = in.readLine();
        while (line!=null) {
            inputstr = inputstr.append(line);
            inputstr = inputstr.append("\n");
            line = in.readLine();
        }
        in.close();
        return inputstr.toString();
    }
}

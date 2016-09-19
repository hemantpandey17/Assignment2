package DirectedGraph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class compbio3 {

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<String> fastastr = new ArrayList<String>();
        ArrayList<String> str = new ArrayList<String>();
        File infile = new File("dataset.txt");
        Scanner sb1 = new Scanner(infile);

        String s = null;
        while (sb1.hasNextLine()) {

            String buf = sb1.nextLine();
            if (buf.charAt(0) == '>') {
                str.add(s);
                fastastr.add(buf.substring(1));
                s="";
            } 
            else {

                s=s+buf;

            }

        }
        str.remove(0);
        str.add(s);
        
        ArrayList<String> res = overlapgraph(fastastr, str);

        
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }

    }

    public static ArrayList<String> overlapgraph(ArrayList<String> fastastr, ArrayList<String> str) {
        // TODO Auto-generated method stub
        ArrayList<String> overlap = new ArrayList<String>();
        int size = fastastr.size();

        for (int i = 0; i < size; i++) {
            int Len1 = str.get(i).length();

            for (int j = 0; j < size; j++) {

                if (i != j && str.get(i).substring(Len1 - 3).equals(str.get(j).substring(0, 3))) {
                    String str1 = fastastr.get(i) + " " + fastastr.get(j);
                    overlap.add(str1);
                }
            }
        }

        return overlap;
    }
}



//http://www.tutorialspoint.com/java/java_string_substring.htm

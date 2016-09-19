/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DirectedGraph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hemant
 */
public class c3 {
     public static void main(String[] args) throws FileNotFoundException {

        ArrayList<String> fastastr = new ArrayList<String>();
        ArrayList<String> str = new ArrayList<String>();
        File infile = new File("dataset2.txt");
        Scanner sb1 = new Scanner(infile);

        String s = null;
          while (sb1.hasNextLine()) {
              fastastr.add(sb1.nextLine().substring(1));
              str.add(sb1.nextLine());
          }
          ArrayList<String> res = new ArrayList<String>();
          overlapgraph(fastastr,str,res);
          for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
          
}
     public static void overlapgraph(ArrayList<String> fastastr, ArrayList<String> str, ArrayList<String> res)
     {
         int size = str.size();
         for(int i=0; i<size;i++)
         {
              int Len1 = str.get(i).length();
              for (int j = 0; j < size; j++) {
                   if (i != j && str.get(i).substring(Len1 - 3).equals(str.get(j).substring(0, 3))) {
                    String str1 = fastastr.get(i) + " " + fastastr.get(j);
                    res.add(str1);
              }
         }
         
     }
     }
}

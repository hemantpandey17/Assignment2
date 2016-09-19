/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DirectedGraph;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Hemant
 */
public class RemoveIntrons {
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        String s="";
        ArrayList<String> fastastr = new ArrayList<String>();
        List<String> intr = new ArrayList<String>();
        File infile = new File("introns2.txt");
         
        Scanner sc = new Scanner(infile);
         
        
        int count = 0;
        while (sc.hasNextLine()) {
               if(count == 0)
               {
                   fastastr.add(sc.nextLine());
                   s = sc.nextLine();
               }
               else
               {
                    fastastr.add(sc.nextLine());
                    intr.add(sc.nextLine());
               }
               count++;
          }
        
        
        StringBuilder res = new StringBuilder();
        func(s,intr,res);
        System.out.println(res);
        
        
        
    }
    public static void func(String s, List<String> intr, StringBuilder res){
        
        for(int i=0; i<intr.size();i++)
        {
            if(s.contains(intr.get(i)))
            s = s.replace(intr.get(i),"");
             
        }
        s = s.replace('T', 'U');
         
        String[] array = s.split("(?<=\\G.{3})"); 
        System.out.print(array);
        HashMap<String,Character> map = new HashMap<String,Character>();
         
           map.put("UUU", 'F');
           map.put("UUC", 'F');
           map.put("UUA", 'L');
           map.put("UUG", 'L');
           map.put("UCU", 'S');
           map.put("UCC", 'S');
           map.put("UCA", 'S');
           map.put("UCG", 'S');
           map.put("UAU", 'Y');
           map.put("UAC", 'Y');
           map.put("UAA", null);
           map.put("UAG", null);
           map.put("UGU", 'C');
           map.put("UGC", 'C');
           map.put("UGA", null);
           map.put("UGG", 'W');
           map.put("CUU", 'L');
           map.put("CUC", 'L');
           map.put("CUA", 'L');
           map.put("CUG", 'L');
           map.put("CCU", 'P');
           map.put("CCC", 'P');
           map.put("CCA", 'P');
           map.put("CCG", 'P');
           map.put("CAU", 'H');
           map.put("CAC", 'H');
           map.put("CAA", 'Q');
           map.put("CAG", 'Q');
           map.put("CGU", 'R');
           map.put("CGC", 'R');
           map.put("CGA", 'R');
           map.put("CGG", 'R');
           map.put("AUU", 'I');
           map.put("AUC", 'I');
           map.put("AUA", 'I');
           map.put("AUG", 'M');
           map.put("ACU", 'T');
           map.put("ACC", 'T');
           map.put("ACA", 'T');
           map.put("ACG", 'T');
           map.put("AAU", 'N');
           map.put("AAC", 'N');
           map.put("AAA", 'K');
           map.put("AAG", 'K');
           map.put("AGU", 'S');
           map.put("AGC", 'S');
           map.put("AGA", 'R');
           map.put("AGG", 'R');
           map.put("GUU", 'V');
           map.put("GUC", 'V');
           map.put("GUA", 'V');
           map.put("GUG", 'V');
           map.put("GCU", 'A');
           map.put("GCC", 'A');
           map.put("GCA", 'A');
           map.put("GCG", 'A');
           map.put("GAU", 'D');
           map.put("GAC", 'D');
           map.put("GAA", 'E');
           map.put("GAG", 'E');
           map.put("GGU", 'G');
           map.put("GGC", 'G');
           map.put("GGA", 'G');
           map.put("GGG", 'G');
           
           for(int i=0; i<array.length; i++)
           {
                
                   if(map.get(array[i])!=null)
                   {
                      res.append(map.get(array[i])); 
                       
                   }
                   else if(map.get(array[i])==null)
                       break;
                    
                    
               }
          
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package computational.biology;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.F;

/**
 *
 * @author Hemant
 */
public class ComputationalBiology {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File infile = new File("dataset8.txt");
         Scanner sb1 = new Scanner(infile);
         String s = null;
         while(sb1.hasNextLine())
        {
            s = sb1.nextLine();
        }
          StringBuilder res = new StringBuilder();
         GeneticCode(s,res);
          
             System.out.println(res);
         
    }
         
       public static void GeneticCode(String str, StringBuilder res)
       {
          String[] array = str.split("(?<=\\G.{3})"); 
          HashMap<String,Character> map = new HashMap<String, Character>();
          
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
       
        // TODO code application logic here
    }
    


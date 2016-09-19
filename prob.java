/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DirectedGraph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Hemant
 */
public class prob {

    public static void main(String[] args) throws FileNotFoundException
    {
        File infile = new File("datalis.txt");

        Scanner sc = new Scanner(infile);
        String num = "";
        String[] inp = new String[0];
        while (sc.hasNext())
        {
            num = sc.nextLine();
            inp = sc.nextLine().split(" ");

        }
        int n = Integer.parseInt(num);
        int[] input = new int[inp.length];
        for(int i=0;i<inp.length;i++)
        {
            input[i] = Integer.parseInt(inp[i]);
        }
     int[] res = lis(input);
    for(int i = 0; i < res.length; i++) {
      System.out.print(res[i] + " ");
    }
    System.out.println();
    int[] res1 = lds(input);
    for(int i = 0; i < res1.length; i++) {
      System.out.print(res1[i] + " ");
    }
        
    }
    public static int[] lis(int[] input)
    {
        int len = input.length;
        int[] arr = new int[len];
        int[] pre = new int[len];
        int max=0;
        int end=0; 
        arr[0]=1;
        for(int i=1; i<len;i++)
        {
            arr[i] = 1;
            for(int j=0;j<i;j++)
            {
                if(input[j]<input[i])
                {
                    if(arr[i]<1+arr[j])
                    {
                        arr[i] = 1 + arr[j];
                        pre[i] = j;
                    }
                }
            }
        }
            for(int k=0; k<len ;k++)
            {
                     if(max<arr[k])
                     {
                       max = arr[k];
                       end = k;
                     }
            }
             int[] res = new int[max];
             int i=end;
             int numadd = max -1;
             while(numadd >= 0)
             {
                 res[numadd] = input[i];
                 numadd--;
                 i=pre[i];
             }
             return res;   
               
    }
    public static int[] lds(int[] input)
    {
        int len = input.length;
        int[] arr = new int[len];
        int[] pre = new int[len];
        int max=0;
        int end=0; 
        arr[0]=1;
        for(int i=1; i<len;i++)
        {
            arr[i] = 1;
            for(int j=0;j<i;j++)
            {
                if(input[j]>input[i])
                {
                    if(arr[i]<1+arr[j])
                    {
                        arr[i] = 1 + arr[j];
                        pre[i] = j;
                    }
                }
            }
        }
            for(int k=0; k<arr.length;k++)
            {
                     if(max<arr[k])
                     {
                       max = arr[k];
                       end = k;
                     }
            }
             int[] res = new int[max];
             int i=end;
             int numadd = max -1;
             while(numadd >= 0)
             {
                 res[numadd] = input[i];
                 numadd--;
                 i=pre[i];
             }
             return res;   
               
    }
}
        
    
    //Algo ref : http://www.geeksforgeeks.org/dynamic-programming-set-3-longest-increasing-subsequence/

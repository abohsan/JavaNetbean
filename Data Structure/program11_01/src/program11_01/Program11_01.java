/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program11_01;

import java.util.Random;

/**
 *
 * @author abdu
 */
public class Program11_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0;
        int max = 0;
        int min = 0;
        int size = 100;
         
        int sum2 = 0;
        int max2 = 0;
        int min2 = 0;
        int size2 = size*2;
        Integer[] num = new Integer[size];

        Random random = new Random();

        for (int i = 0; i < size; ++i) {
            num[i] = random.nextInt(100);

        }

        max = num[0];
        min = num[0];
        for (int i = 0; i < size; i++) {
            sum = sum + num[i];

            if (max < num[i]) {
                max = num[i];

            }
            if (min > num[i]) {
                min = num[i];

            }

        }

       
        
       
        Integer[] num2 = new Integer[size2];
        for (int i = 0; i < (size2); i++) {
           if (i < size){
               num2[i] = num[i];
           }else{
               num2[i] = random.nextInt(100);
           }
            

        }
           
           for (int i = 0; i < (size2); i++) {
            sum2 = sum2 + num2[i];

            if (max2 < num2[i]) {
                max2 = num2[i];

            }
            if (min2 > num2[i]) {
                min2 = num2[i];

            }

        }
           
           
        
         System.out.println("-------- Print All");
         System.out.println("index      num      num2");
         
         for (int i = 0; i < (size2); i++) {
           System.out.print(i);
         
             if (i < size){
               System.out.print("          " + num[i]);
         
           }else{
                System.out.print("          "); 
             }
            System.out.println("         " + num2[i]);

        }
         
          System.out.println("--------");
        System.out.print("sum :");
        System.out.print(sum);
        System.out.println("   "+sum2);
        System.out.print("max :");
        System.out.print(max);
        System.out.println("    "+max2);
        System.out.print("Min :");
        System.out.print(min);
        System.out.println("    "+min2);
        System.out.print("Avaerage : ");
        System.out.print((sum / num.length));
        System.out.println("    "+(sum2 / num2.length));
        System.out.print("size : ");
        System.out.print((num.length));
        System.out.println(("   "+num2.length));
        

    }

    
}

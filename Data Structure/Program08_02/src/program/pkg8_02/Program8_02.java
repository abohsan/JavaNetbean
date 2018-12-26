/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program.pkg8_02;

import java.util.Random;

/**
 *
 * @author abdu
 */
public class Program8_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0;
        int max = 0;
        int min = 0;
        int size = 100;
        Integer[] num = new Integer[size];

        Random random = new Random();

        for (int i = 0; i < size; ++i) {
            num[i] = random.nextInt(100)+100;

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
        System.out.println("----print----");
        for (int i = 0; i < size; i++) {
            System.out.println(num[i]);

        }

        System.out.println("--------");
        System.out.print("sum :");
        System.out.println(sum);
        System.out.print("max :");
        System.out.println(max);
        System.out.print("Min :");
        System.out.println(min);
        System.out.print("Avaerage : ");
        System.out.println((sum / num.length));

    }

}

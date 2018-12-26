/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program01_01;

import java.util.Scanner;

/**
 *
 * @author abdu
 */
public class Program01_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        do {

            double x1, y1, x2, y2, x3, y3;
                // input 

            Scanner in = new Scanner(System.in);

            System.out.println("Enter Vertices");
            x1 = in.nextDouble();
            y1 = in.nextDouble();
            
            x2 = in.nextDouble();
            y2 = in.nextDouble();
            
            x3 = in.nextDouble();
            y3 = in.nextDouble();

            double a = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
            double b = Math.sqrt(Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2));
            double c = Math.sqrt(Math.pow(x1-x3, 2) + Math.pow(y1-y3, 2));
            
            double s = (a+b+c)/2.0;
            double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println(area);
            
            
            
        } while (true);
    }

}

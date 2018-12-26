/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program17_01;

/**
 *
 * @author abdu
 */
public class Program17_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        NewClass n = new NewClass(1000);

        n.printAll();
        n.insertionSort();
        System.out.println("Done!");
        n.printAll();
    }

}

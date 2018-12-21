/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise3;

/**
 *
 * @author abdu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PriorityQueue p = new PriorityQueue();
        p.add(10);
        p.add(40);
        p.add(20);
        p.display();
        p.add(50);
        p.add(30);

        p.display();
        System.out.println("max " + p.max());
        p.display();
        p.removeMax();
         p.display();
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise1;

/**
 *
 * @author abdu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Deque deq = new Deque();

        deq.push(10);
        deq.push(20);
        deq.push(30);
        deq.inject(40);
        deq.inject(50);
        System.out.print(deq.getData());
        System.out.println("Eject " + deq.eject());
        System.out.print(deq.getData());
        System.out.println("pop " + deq.pop());
        System.out.print(deq.getData());
        System.out.println("get Front " + deq.getFront());
        System.out.println("get Rear " + deq.getRear());
        System.out.print(deq.getData());
//        deq.display();

    }

}

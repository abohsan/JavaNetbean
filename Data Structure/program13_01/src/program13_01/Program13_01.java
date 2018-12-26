/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program13_01;

/**
 *
 * @author abdu
 */
public class Program13_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LinkedList m = new LinkedList();
//         System.out.println(m.isEmpty());
        m.add(1);
        m.add(2);
        m.add(3);
        m.add(4);
        m.add(5);
        m.add(6);
        m.insert(15, 2);
         m.insert(15, 0);
        
    
       
        m.display();
        System.out.println(m.search(12));
        System.out.println(m.search(2));
        System.out.println(m.isEmpty());
        
    }
    
}

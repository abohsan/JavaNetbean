/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;



/**
 *
 * @author abdu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         stack ls = new stack();
         ls.push(10);
         ls.push(11);
         ls.push(12);
         ls.display();
         System.out.println("peek " + ls.peek());
         ls.display();
         System.out.println("pop " + ls.pop());
         ls.display();
        
         System.out.println("Size: " + ls.getSize());
         ls.display();
        
    }

}

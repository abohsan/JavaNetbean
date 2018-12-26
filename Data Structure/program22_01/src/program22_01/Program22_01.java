/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program22_01;

/**
 *
 * @author abdu
 */
public class Program22_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        exam n = new exam();
        BinarySearchTree myTree = new BinarySearchTree();

        myTree.add(25);
        myTree.add(10);
        myTree.add(15);
        myTree.add(11);
        myTree.add(17);
        myTree.add(37);
        myTree.add(29);
        myTree.add(27);
        myTree.add(42);

        myTree.display();
        System.out.println();
   
         System.out.println(myTree);
         System.out.println(myTree.getHeight());
         System.out.println(myTree.getCount());
         System.out.println(myTree.getMax());
         myTree.printLevels();
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 *  @author 5676440
 *  
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayBag myArrayBag = new ArrayBag(10);
        myArrayBag.add("a2");
        myArrayBag.add("a2");
        myArrayBag.add("c2");
        myArrayBag.add("d2");
        myArrayBag.add("e2");
        myArrayBag.add("f2");
        myArrayBag.add("g2");
        myArrayBag.add("h2");
        myArrayBag.add("i2");
        myArrayBag.add("j2");
        myArrayBag.add("k2");
        System.out.println("Is the list empty? " + myArrayBag.isEmpty());
        myArrayBag.print();
        System.out.println("\"a2\" found " + myArrayBag.count("a2"));
        System.out.println("\"b2\" found " + myArrayBag.count("b2"));
        System.out.println("\"c2\" found " + myArrayBag.count("c2"));
        myArrayBag.remove("a2");
        myArrayBag.print();
        myArrayBag.remove("b2");
        myArrayBag.remove("j2");
        myArrayBag.print();

    }

}

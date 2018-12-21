/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *  @author 5676440
 * 
 */
public interface Bag {

    public boolean isEmpty();

    public void print();

    public void add(String s);

    public void remove(String s);

    public int count(String s); //counts occurrences of s in the bag

}

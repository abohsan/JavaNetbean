/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program24_02;

/**
 *
 * @author abdu
 */
public class Person {
    String firstName;
    String lastName;
    int priority;
    
    public Person(){
        
    }
    public Person(String f, String l, int p){
        firstName = f;
        lastName = l;
        priority = p;
    }
    public String toStrng(){
        return  "First Name: " +firstName + "\nlast Name: " +lastName +
                "\npriority: " +priority;
    }
    
    
    
    
}

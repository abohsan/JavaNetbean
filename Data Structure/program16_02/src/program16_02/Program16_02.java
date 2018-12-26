/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program16_02;

/**
 *
 * @author abdu
 */
public class Program16_02 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        recursive nn = new recursive();
        
   
        
        
        for(int i =-6; i<100 ;i++){
           System.out.println(i+ " : " +nn.fib(i)); 
        }
        
        
    }
    
}

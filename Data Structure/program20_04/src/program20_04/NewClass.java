/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program20_04;

/**
 *
 * @author abdu
 */
public class NewClass {

    int[] list = {12, 23, 3, 10, 3};

    public String getMin() {

        int min1 = list[0];
        int min2 = list[0];

        for (int i = 1; i < list.length; i++) {
            if (min1 > list[i]) {
                min1 = list[i];
            }
        }

        for (int i = 1; i < list.length; i++) {
            if (min2 > list[i] && (list[i] > min1)) {
                min2 = list[i];
            }

        }

        return min1 + " , " + min2;

    }

    public int getMin1() {

        int min1;
        int min2;

        if (list[0] < list[1]) {
            min1 = list[0];
            min2 = list[1];
        }else{
            min1 = list[1];
            min2 = list[0];
        }
        
        
        for (int i = 2; i < list.length; i++) {
           
            if (list[i] == list[i]) { // not completed
                min1 = list[i];
            }
            
        }

        return min1 ;

    }

}

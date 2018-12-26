/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject;

/**
 *
 * @author abdu
 */
public class exam {

    int[] A = {10,    5,    7,     9,    16,    -5};
    int[] B = {210,    420,    125,    301,    112,    121};
    
    public void sum() {
        for (int i = 0; i < B.length; i++) {
            for (int j = i; j < B.length; j++) {

                int x = B[i]+B[j];
                System.out.println(B[i] +":"+B[j] + "=" +x+" ; "+ isItinA(x)); 
            }

        }

    }

    public boolean isItinA(int x) {
        for (int i = 0; i < A.length; i++) {
            if (x == A[i]) {
                return true;
            }
        }
        return false;
    }

}

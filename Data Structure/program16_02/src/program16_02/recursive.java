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
public class recursive {

    public String printArray(int[] n) {

//        System.out.println(n);
//        if (n < 0) {
//            return "";
//        } else if (n < 0) {
//            return 0;
//        } else {
//            return n * factor(n - 1) + 3;
//        }
        return ";";
    }

    public long factor(int n) {

//        System.out.println(n);
        if (n == 1 || n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        } else {
            return n * factor(n - 1) + 3;
        }

    }

    public long recurrence(int n) {

//     
        if (n == 0) {
            return 5;

        } else if (n > 1) {

            return 2 * recurrence(n - 1) + 3;

        } else {
            return 0;
        }
    }

    public long fib(int n) {

//     
        if (n == 0) {
            return 0;

        } else if (n == 1) {
            return 1;

        } else if (n > 1) {

            return fib(n - 1) + fib(n - 2);

        } else {
            return 0;
        }
    }

}

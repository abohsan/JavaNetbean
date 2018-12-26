/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program29_01;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Stack;

/**
 *
 * @author abdu
 */
public class Program19_01 {

    int[] num;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Program19_01();
    }

    public Program19_01() {
        Random rnd = new Random();
        LinkedList<Integer> list = new LinkedList<>();

        int total = 10;
        for (int i = 0; i < total; i++) {
            list.add(rnd.nextInt(total + 1));

        }

        System.out.println(list);
        Iterator<Integer> it;
        for (int i = 0; i <= total; i++) {
            it = list.iterator();
            int ctr = 0;
            while (it.hasNext()) {
                if (i == it.next()) {
                    ctr++;

                }

            }
            System.out.println(i + ": " + ctr + " times");

        }
    }

    public boolean isPalindrome(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            if (stack.peek() != s.charAt(i)) {
                return false;

            }
            stack.pop();
        }
        return true;

    }

}

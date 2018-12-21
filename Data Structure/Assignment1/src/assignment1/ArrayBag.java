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
public class ArrayBag implements Bag {

    private int length = 0;
    private int SIZE;
    private String list[] = new String[10];

    public ArrayBag(int size) {
        list = new String[size];
        SIZE = size;
        length = 0;
    }

    @Override
    public boolean isEmpty() {

        return length == 0;
    }

    @Override
    public void print() {
        String elements = "";
        System.out.print("The list {");
        for (int i = 0; i < length; i++) {
//            System.out.println(list[i]);
            if (i == (length - 1)) {
                elements = elements + list[i];
            } else {
                elements = elements +list[i]+ ", ";
            }
        }
        System.out.println(elements + "}");

    }

    @Override
    public void add(String s) {

        if (length == SIZE) {
            System.out.println("The list is full! \"" + s + "\" is not added");
        } else {
            list[length] = s;
            length++;
            System.out.println(s + " added to the list");

        }
    }

    @Override
    public void remove(String s) {

        int pos = 0;
        int count = 0;

        while (pos != -1) {
            pos = -1;

            // look for the target
            for (int i = 0; i < length; i++) {
                if (list[i] == s) {
                    pos = i;

                }
            }

            // if the target is found remove it
            if (pos != -1) {
                count++;
                for (int p = pos; p < length - 1; p++) {
                    list[p] = list[p + 1];
                }
                length--;
            }
        } // remove while there is target
        if (count != 0) {
            System.out.println("\"" + s + "\" is removed");
        } else {
            System.out.println("The list does not have \"" + s + "\" to remove");
        }

    }

    @Override
    public int count(String s) {
        int num = 0;

        for (int i = 0; i < length; i++) {
            if (list[i] == s) {
                num++;
            }
        }
        return num;
    }

}

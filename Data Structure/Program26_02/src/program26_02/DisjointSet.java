/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program26_02;

/**
 *
 * @author abdu
 */
public class DisjointSet {

    private int size;
    private int[] list;

    public DisjointSet() {
        size = 10;
        for (int i = 0; i < 10; i++) {
            list[i] = -2;

        }
    }

    public DisjointSet(int s) {
        size = s;
        list = new int[s];
        for (int i = 0; i < s; i++) {
            list[i] = -2;

        }
    }

    public void makeSet(int x) {

        list[x] = -1;
    }

    public int find(int x) {
        int element = x;
        while (list[element] != -1) {
            element = list[element];
        }
        return element;
        /*
         recursive version
         if(list[x] == -1){
         return x;
         }else{
         return find(list[x]);
         }
         */

    }

    public void union(int x, int y) {

        int rootx = find(x);
        int rooty = find(y);
        list[rooty] = rootx;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < size; i++) {
            s += list[i] + "  ";

        }
        return "[" + s + "]";
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itemset;

/**
 *
 * @author abdu
 */
public class ItemSet {

    int size;

    private boolean[] isInSet;

    public ItemSet() {

        size = 1000;
        isInSet = new boolean[size];
        for (int i = 0; i < size; i++) {
            isInSet[i] = false;

        }

    }

    public boolean search(int i) {

        return isInSet[i];
    }

    public void add(int ID) {

        isInSet[ID] = true;
    }

    public void remove(int ID) {

        isInSet[ID] = false;
    }

    public void union(ItemSet q) {
        for (int i = 0; i < size; i++) {
            isInSet[i] |= q.isInSet[i]; // same as "isInSet[i] = isInSet[i] || q.isInSet[i];"

        }
    }

    public void intersection(ItemSet q) {
        for (int i = 0; i < size; i++) {
            isInSet[i] &= q.isInSet[i]; // same as "isInSet[i] = isInSet[i] && q.isInSet[i];"

        }
    }

    public void difference(ItemSet q) {
        for (int i = 0; i < size; i++) {
            isInSet[i] = isInSet[i] & !q.isInSet[i];

        }
    }

    public void print() {

        for (int i = 0; i < size; i++) {
            if (!isInSet[i]) {
                System.out.println(i);
            }

        }

    }

}

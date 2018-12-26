/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program23_01;

/**
 *
 * @author abdu
 */
public class HashTable {

    private LinkedList[] table;
    private int tableSize;
    

    public HashTable() {
        tableSize = 5;
        table = new LinkedList[tableSize];
        for (int i = 0; i < tableSize; i++) {
            table[i] = new LinkedList();
        }
    }

    public HashTable(int size) {
        tableSize = size;
        table = new LinkedList[tableSize];
        for (int i = 0; i < tableSize; i++) {
            table[i] = new LinkedList();
        }
    }

    public void remove(String str) {
        int hashValue = hash(str);
        table[hashValue].remove(str);

    }

    public boolean search(String str) {
        int hashValue = hash(str);
        return table[hashValue].search(str);

    }

    public void print() {
        for (LinkedList list : table) {
         
            list.display();
        }
    }

    public void add(String str) {
        int hashValue = hash(str);
        table[hashValue].add(str);

    }

    public int hash(String key) {
        int hashVal = 0;
        for (int i = 0; i < key.length(); i++) {
            hashVal = 37 * hashVal + key.charAt(i);
        }
        hashVal %= tableSize;
        if (hashVal < 0) {
            hashVal += tableSize;
        }

        return hashVal;
    }

    public int hash(String key, int tableSize) {
        int hashVal = 0;
        for (int i = 0; i < key.length(); i++) {
            hashVal = 37 * hashVal + key.charAt(i);
        }
        hashVal %= tableSize;
        if (hashVal < 0) {
            hashVal += tableSize;
        }

        return hashVal;
    } // Not used

}

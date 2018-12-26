/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program23_03;

/**
 *
 * @author abdu
 */
public class HashTable {

    private String[] table;
    private byte[] locationStatus;
    private int tableSize;
    private int length; // number of element stored

//    private LinkedList[] table;
    public HashTable() {
        tableSize = 5;
        table = new String[tableSize];
        locationStatus = new byte[tableSize];
        for (int i = 0; i < tableSize; i++) {
            table[i] = "";
            locationStatus[i] = 0;
        }
        length = 0;

    } // done!

//    public HashTable(int size) {
//        tableSize = size;
//        table = new LinkedList[tableSize];
//        for (int i = 0; i < tableSize; i++) {
//            table[i] = new LinkedList();
//        }
//    }

    public void remove(String str) {
//        int hashValue = hash(str);
//        table[hashValue].remove(str);

    }

    public boolean search(String str) {
        int hashValue = hash(str);
        int count = 0;
        boolean stop = false;
        while (!stop) {
            if ((count == tableSize)
                    || (table[hashValue].equals(str)
                    && locationStatus[hashValue] == 1)
                    || (locationStatus[hashValue] == 0)) {
                stop = true;
            } else {
                hashValue = (hashValue + 1) % tableSize;
                count++;
            }

        }
        return (table[hashValue].equals(str) && locationStatus[hashValue] == 1);

    } // done!

//    public void print() {
//        for (LinkedList list : table) {
//
//            list.display();
//        }
//    }

    public void add(String str) {
        if (length == tableSize) {
            System.out.println("Table is full!");

        } else {
            int hashValue = hash(str);
            while (locationStatus[hashValue] == 1) {
                hashValue = (hashValue + 1) % tableSize;
            }

            table[hashValue] = str;
            locationStatus[hashValue] = 1;
            length++;
        }

    } // done!

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

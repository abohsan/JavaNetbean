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
public class Program23_01 {

    /**
     * @param args the command line arguments
     */
    LinkedList myLink = new LinkedList();
    HashTable myHashTable;

    public static void main(String[] args) {
        // TODO code application logic here
        new Program23_01();

    }

    public Program23_01() {

        myHashTable = new HashTable();

        String[] keywords = {"abstract", "continue", "for", "new", "switch",
            "assert", "default", "goto", "package", "synchronized", "boolean", "do",
            "if", "private", "this", "break", "double", "implements", "protected",
            "throw", "byte", "else", "import", "public", "throws", "case", "enum",
            "instanceof", "return", "transient", "catch", "extends", "int",
            "short", "try", "char", "final", "interface", "static", "void", "class",
            "finally", "long", "strictfp", "volatile", "const", "float", "native",
            "super", "while"
        };

        for (int i = 0; i < keywords.length; i++) {

            myHashTable.add(keywords[i]);
//            System.out.println(keywords[i] + ": " + hash(keywords[i], 67));

        }
        
        System.out.println(" ------ printing --------");
            myHashTable.print();


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
    }
}

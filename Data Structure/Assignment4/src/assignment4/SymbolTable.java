// 5676440
 
package assignment4;

public class SymbolTable {

    private int tableSize;
    private BinarySearchTree[] table;

    public SymbolTable() {
        tableSize = 20;

        table = new BinarySearchTree[tableSize];
        for (int i = 0; i < tableSize; i++) {
            table[i] = new BinarySearchTree();
        }
    } // Done!

    public SymbolTable(int size) {
        tableSize = size;
        table = new BinarySearchTree[tableSize];
        for (int i = 0; i < tableSize; i++) {
            table[i] = new BinarySearchTree();
        }
    } // Done!

    public void add(ElementType e) {
        int hashVale = hash(e.identifier);

        table[hashVale].add(e);
    }

    public boolean search(String key) {

        return table[hash(key)].contains(key);

    }

    private int hash(String key) {
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

    @Override
    public String toString() {
        String s = "";
        int i = 0;
        for (BinarySearchTree u : table) {

            s += i + "  " + u.toString() + "\n";
            i++;
        }

        return s;
    }

}

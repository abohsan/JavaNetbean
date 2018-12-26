package program21_01;

public class LinkedList implements ListInterface {

  
    public class Node {

        private String value;
        private Node next;
        
        private String key;
     

        public Node() {
            value = null;
            next = null;
        }

        public void setInfo(String i) {
            value = i;
        }

        public void setNext(Node l) {
            next = l;
        }

        public String getInfo() {
            return value;
        }
        public String getKey() {
            return key;
        }

        public Node getNext() {
            return next;
        }
    }

    private Node first;

    public LinkedList() {
        first = new Node();
    }

    public boolean isEmpty() {
        return (first.getNext() == null);
    }

    public void print() {
        Node current = first.getNext();

        while (current != null) {
            System.out.print(current.getInfo() + " "+ current.getKey());
            current = current.getNext();
        }

        System.out.println();
    }

    public boolean search(int x) {
        Node current = first.getNext();

        while (current != null) {
            if (current.getInfo().equals(x) ) {
                return true;
            }
            current = current.getNext();
        }

        return false;
    }

    public void add(int x) {
        Node p = new Node();

        p.setInfo(x);
        p.setNext(first.getNext());

        first.setNext(p);
    }

    public void remove(int x) {
        Node old = first.getNext(),
                p = first;

        boolean found = false;
        while (old != null && !found) {
            if (old.getInfo().equals(x)) {
                found = true;
            } else {
                p = old;
                old = p.getNext();
            }
        }

        if (found) {
            p.setNext(old.getNext());
        }
    }

    public void insert(int x, int loc) {

    }

    public void removeItemAt(int loc) {

    }
}

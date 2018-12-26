package program14_01;

public class LinkedList implements ListInterface {

    public class Node {

        private int info;
        private Node next;
        private Node pree;

        public Node() {
            info = 0;
            next = null;
        }

        public void setInfo(int i) {
            info = i;
        }

        public void setNext(Node l) {
            next = l;
        }

        public int getInfo() {
            return info;
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

    public void display() {
        Node current = first.getNext();

        while (current != null) {
            System.out.print(current.getInfo() + " ");
            current = current.getNext();
        }

        System.out.println();
    }

    public boolean search(int x) {
        Node current = first.getNext();

        while (current != null) {
            if (current.getInfo() == x) {
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
            if (old.getInfo() == x) {
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

    public int length() {
        int counter = 0;
        Node current = first.getNext();

        while (current != null) {
            counter++;
            current = current.getNext();

        }

        return counter;
    }

    public void insert1(int x, int loc) {

        int pos = 0;

        Node pre = first.getNext();
        Node current = first.getNext();

        while (current != null) {

            if (pos == loc) {

                Node p = new Node();
                p.setInfo(x);
                pre.setNext(p);
                p.setNext(current.getNext());

            }

            if (pos == 0) {
                current = current.getNext();
            } else {
                pre = current;
                current = current.getNext();

            }
            pos++;

        }

    }

    public void insert(int x, int loc) {

        if (loc >= length()) {

        } else {
            Node current = first;
            for (int i = 0; i < loc; i++) {
                current = current.getNext();
            }

            Node p = new Node();
            p.setInfo(x);
            p.setNext(current.getNext());
            current.setNext(p);

        }

    }

    public void removeItemAt(int loc) {

        if (loc >= length()) {

        } else {
            Node current = first;
            for (int i = 0; i < loc; i++) {
                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
        }

    }
}

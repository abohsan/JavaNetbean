/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise3;

/**
 *
 * @author abdu
 */
public class PriorityQueue {

    public class Node {

        private int info;
        private Node next;
        private Node previous;

        public Node() {
            info = 0;
            next = null;
            previous = null;
        }

        public void setInfo(int i) {
            info = i;
        }

        public void setNext(Node l) {
            next = l;
        }

        public void setPrevious(Node j) {
            previous = j;
        }

        public int getInfo() {
            return info;
        }

        public Node getNext() {
            return next;
        }

        public Node getPrevious() {
            return previous;
        }
    }
    private Node first;
    private Node last;

    public PriorityQueue() {
        first = new Node();
        last = new Node();
        first.setNext(last);
        last.setPrevious(first);
    }

    public boolean isEmpty() {
        return (first.getNext() == last);
    }

    public void display() {
        Node current = first.getNext();
            System.out.print("Data  ");
    
        while (current != last) {
            System.out.print(current.getInfo() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public void add(int n) {
//FILL IN
        Node current = first.getNext();
        Node temp = new Node();
        temp.setInfo(n);
        while (current != last) {
            if (current.getInfo() > n) {
                current = current.getPrevious();
                temp.setPrevious(current);
                temp.setNext(current.getNext());
                current.getNext().setPrevious(temp);
                
                current.setNext(temp);
                break;
            }
            current = current.getNext();
        }
        if (current == last) {
            current = current.getPrevious();
            temp.setPrevious(current);
            temp.setNext(current.getNext());
            current.getNext().setPrevious(temp);
            current.setNext(temp);
        }
        System.out.println("Added " +n);
    }

    public int max() {
        //FILL IN
        return first.getNext().getInfo();
    }

    public void removeMax() {
        //FILL IN
        if (first.getNext() == last) {
            System.out.println("Empty Priority Queue");
        } else {
            Node current = first.getNext();
            first.setNext(current.getNext());
            current.getNext().setPrevious(first);
        }
        System.out.println("Removed Max");
    }

    public int getLength() {
        int length = 0;
        Node current = first.getNext();
        while (current != null) {
            length++;
            current = current.getNext();
        }
        return length;
    }
}

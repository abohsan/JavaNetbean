/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise1;

import java.util.NoSuchElementException;

/**
 *
 * @author abdu
 */
public class Deque implements DequeInterface {

    public class Node {

        private int info;
        private Node next;

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

    private Node front, rear;
    private int listSize;

    public Deque() {
        front = null;
        rear = null;
        listSize = 0;

    }

    @Override
    public void push(int x) {
        System.out.println("push "+ x);
        Node p = new Node();
        p.setInfo(x);
        listSize++;
        if (front == null) {
            front = p;
            rear = front;

        } else {
            p.setNext(front);
            front = p;

        }

    }

    @Override
    public int pop() {
        
        if (isDequeEmpty()) {
            throw new NoSuchElementException("Unerflow Exception");
        }
        Node p = front;
        front = p.getNext();
        if (front == null) {
            rear = null;
            listSize--;

        }
        
        return p.getInfo();
    }

    @Override
    public void inject(int x) {
        System.out.println("inject "+ x);
        Node p = new Node();
        p.setInfo(x);
        listSize++;
        if (rear == null) {
            rear = p;
            front = rear;

        } else {
            rear.setNext(p);
            rear = p;
        }
    }

    @Override
    public int eject() {
      
        if (isDequeEmpty()) {
            throw new NoSuchElementException("Unerflow Exception");
        }
        int element = rear.getInfo();
        Node x = front;
        Node y = front;
        while (x != rear) {
            y = x;
            x = x.getNext();

        }
        rear = y;
        rear.setNext(null);
        listSize--;
        
        return element;
    }

    @Override
    public int getFront() {
        if (isDequeEmpty()) {
            throw new NoSuchElementException("Unerflow Exception");
        }
        
        return front.getInfo();
    }

    @Override
    public int getRear() {
        if (isDequeEmpty()) {
            throw new NoSuchElementException("Unerflow Exception");
       
        }
        return rear.getInfo();
    }
    
      public String getData() {
          String data = " --------- Begin Data ----------\n";
        if (front != null) {
           data = data + front.getInfo() + "\n";
                Node current = front.getNext();

            while (current != null) {
               data = data + current.getInfo() + "\n";
                current = current.getNext();
            }

        }else{
            return "       No such data";
        }

        return data +" --------- End Data ----------\n";
    }


    private boolean isDequeEmpty() {
        return (front.getNext() == null);
    }

}


package Exercise2;

import java.util.NoSuchElementException;



/* Class linkedStack */
class stack {
    /* Class Node */ 

    public class Node {

        protected int data;
        protected Node link;

    
        public Node() {
            link = null;
            data = 0;
        }
    
        

        public Node(int d, Node n) {
            data = d;
            link = n;
        }
    
        public void setLink(Node n) {
            link = n;
        }
    
        public void setData(int d) {
            data = d;
        }
    
        public Node getLink() {
            return link;
        }
      
        public int getData() {
            return data;
        }
    }

    protected Node top;
    protected int size;

    public stack() {
        top = null;
        size = 0;
    }
 
    public boolean isEmpty() {
        return top == null;
    }

    public int getSize() {
        return size;
    }

    public void push(int data) {
        Node nptr = new Node(data, null);
        if (top == null) {
            top = nptr;
        } else {
            nptr.setLink(top);
            top = nptr;
        }
        size++;
         System.out.println("push "+ data);
           
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("ERROR : Statck is Empty ....!!!!");
            throw new NoSuchElementException("Underflow Exception");
        }

        Node ptr = top;
        top = ptr.getLink();
        size--;
        return ptr.getData();
    }
   
    public int peek() {
        if (isEmpty()) {
            System.out.println("ERROR : Statck is Empty ....!!!!");
            throw new NoSuchElementException("Underflow Exception");
        }
        return top.getData();
    }
  
    public void display() {
        System.out.print("Stack = ");
        if (size == 0) {
            System.out.print("Empty\n");
            return;
        }
        Node ptr = top;
        while (ptr != null) {
            System.out.print(ptr.getData() + " ");
            ptr = ptr.getLink();
        }
        System.out.println();
    }
}

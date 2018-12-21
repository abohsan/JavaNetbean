package Exercise1;

public interface DequeInterface {

    public void push(int x);//: insert item x on the front end of the queue.

    public int pop(); //remove the front item from the deque and return it. 

    public void inject(int x); //: insert item x on the rear end of the queue. 

    public int eject();//: remove the rear item from the deque and return it. 

    public int getFront();//: returns the element at the front of the deque.

    public int getRear();//: returns the element at the rear of the deque.

  
}

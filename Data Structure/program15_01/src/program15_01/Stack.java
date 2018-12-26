package program15_01;

import java.util.Arrays;

public class Stack {

    public Stack() {
        size = 100;
        list = new char[size];
        top = 0;
    }

    public Stack(int s) {
        size = s;
        list = new char[size];
        top = 0;
    }

    public void push(char c) {
        if(top == size){
            size = size*2;
            list = Arrays.copyOf(list, size);
            list[top] = c;
            top++;
        }else{
            list[top] = c;
            top++;
        }
  
    }

    public void doubleTheArray(){
        listD = new char[size*2];
        listD = list;
        
        
        for(int i = 0; i < size ; i++){
            System.out.println(listD[i]);
        }
        
        
        
    }
    public void pop() {
        if (top != 0) {
            top--;
        }

    }

    public char peek() {
        if (top > 0) {
            return list[top - 1];
        } else {
            return ' ';
        }

    }

    public boolean isEmpty() {
        return top == 0;
    }
    private char[] list;
    private char[] listD;
    private int size;
    private int top;
}

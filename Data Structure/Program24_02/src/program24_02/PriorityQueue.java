/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program24_02;

/**
 *
 * @author abdu
 */
public class PriorityQueue {
    private Person[] list;
    private int arraySize;
    private int length;
    
    public PriorityQueue() {
        arraySize = 50;
        list = new Person[arraySize];
        length = 0;
    }

    public void add(Person x) {
        int loc = ++length;
        list[0] = x;
        while (x.priority < list[loc / 2].priority) {
            list[loc] = list[loc / 2];
            loc /= 2;
        }
        list[loc] = x;
    }

    public void removeMax() {
        Person lastIteam = list[length];
        
        length--;
        int parent = 1;
        while (parent * 2 <= length) {
            int child = parent * 2;
            if (child != length && list[child + 1].priority < list[child].priority) {
                child++;
            }
            if (list[child].priority < lastIteam.priority) {
                list[parent] = list[child];

            } else {
                break;
            }
            parent = child;
        }
        list[parent] = lastIteam;
    }
    
    public int max(){
        
        if(length > 0){
            
           return list[1].priority;  
        }else{
            return -1;
        }
    } 
}

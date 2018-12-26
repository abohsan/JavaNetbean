/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program24_01;

/**
 *
 * @author abdu
 */
public class Heap {
///
    
    private int[] list;
    private int arraySize;
    private int length;
    
    public Heap() {
        arraySize = 50;
        list = new int[arraySize];
        length = 0;
    }

    public void add(int x) {
        int loc = ++length;
        list[0] = x;
        while (x < list[loc / 2]) {
            list[loc] = list[loc / 2];
            loc /= 2;
        }
        list[loc] = x;
    }

    public void removeMin() {
        int lastIteam = list[length];
        
        length--;
        int parent = 1;
        while (parent * 2 <= length) {
            int child = parent * 2;
            if (child != length && list[child + 1] < list[child]) {
                child++;
            }
            if (list[child] < lastIteam) {
                list[parent] = list[child];

            } else {
                break;
            }
            parent = child;
        }
        list[parent] = lastIteam;
    }
    
    public int min(){
        
        if(length > 0){
            
           return list[1];  
        }else{
            return -1;
        }
    }
    
}

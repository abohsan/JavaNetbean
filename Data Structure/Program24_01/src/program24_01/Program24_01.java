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
public class Program24_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Program24_01 ff = new Program24_01();
        Heap heap = new Heap();
        int[] a = {5, 3, 12, 2, 7};
        int[] b = new int[5];
        
        heapSort(a, b);
        
        for(int x : b)
        {
            System.out.print(x + " ");
        }

    }

    public static void heapSort(int[] arr, int[] sortedArray) {
        Heap heap = new Heap();
        for (int i = 0; i < arr.length; i++) {
            heap.add(arr[i]);

        }
        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = heap.min();
            heap.removeMin();

        }

    }

}

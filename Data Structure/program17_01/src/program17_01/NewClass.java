/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program17_01;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author abdu
 */
public class NewClass {

    int[] list;

    public NewClass(int n) {
        Random ram = new Random();
        list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = ram.nextInt(100);

        }

    }

    public void timing() {
        System.out.println(" The Section of code lasted Time A  Time B");

        Date current = new Date();
        for (long n = 1; n < 500000; n += 100) {
            long startTime = current.getTime();

            int x = 0;
            for (long i = 1; i <= n; i++) {
                for (long j = 1; j <= 1000; j++) {
                    x = 0;
                }
            }

            current = new Date();
            long stopTime = current.getTime();
            long elapsedTime = stopTime - startTime;
//////
            long startTime1 = current.getTime();

            int x1 = 0;
            for (long i = 1; i <= n; i++) {
                for (long j = 1; j <= n; j++) {
                    x1 = 0;
                }
            }

            current = new Date();
            long stopTime1 = current.getTime();
            long elapsedTime1 = stopTime1 - startTime1;

            System.out.println(" The Section of code lasted " + n + " : " + elapsedTime + " : " + elapsedTime1 + " ms");

        }
    }

    public void printAll() {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);

        }
    }

    public void sorting() {

        int n = list.length;
        for (int i = 0; i < n; i++) {
            if (list[i] > list[i + 1]) {
                int temp = list[i];
                list[i] = list[i + 1];
                list[i + 1] = temp;

            }

        }

    }

    public void bubbleSort() {
        int n = list.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;

                }
            }

        }

    }

    public void insertionSort() {
        int n = list.length;
        for (int i = 1; i < n; i++) {
            int key = list[i];
            int j = i - 1;

            while ((j > -1) && (list[j] > key)) {

                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;

        }
    }

    // prof's answer
    public void insertionSort1() {
        int n = list.length;
        for (int i = 0; i < n; i++) {
            int temp = list[i];
            int j = i - 1;
            while (j >= 0 && temp < list[j]) {
                list[j + 1] = list[j];
                j--;

            }
            list[j + 1] = temp;
        }

    }
    public void selectionSort() {
        int n = list.length;
      for(int i = 0 ; i< n-1 ; i++){
//          int minPos = minimum(i, n-1);
          int minPos = minimum(i);
          swap(i, minPos);
          
      }

    }
    //private int minimum(int i, int a){
    private int minimum(int a){
        int temp = list[a];
        int pos = a;
       for(int i = a ; i < list.length-1; i++){
           if (temp > list[i]){
               temp = list[i];
               pos = i;
           }
           
       }
        
        
        return pos;
    }
    private void swap(int a, int newPos ){
        int temp = list[a];
        list[a] = list[newPos];
        list[newPos] = temp;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_3;

import java.util.Random;

/**
 *
 * @author abdu
 */
public class sortClass {

    private int[] bubbleArray;
    private int[] insertionArray;
    private int[] selectionArray;
    private int[] quicksortArray;
    private int[] mergeArray;

    public void printAll() {
        System.out.print("bubbleArray    : ");

        for (int i = 0; i < bubbleArray.length; i++) {
            System.out.print(bubbleArray[i] + ", ");
        }
        System.out.println();
        System.out.print("insertionArray : ");

        for (int i = 0; i < insertionArray.length; i++) {
            System.out.print(insertionArray[i] + ", ");
        }
        System.out.println();
        System.out.print("selectionArray : ");

        for (int i = 0; i < selectionArray.length; i++) {
            System.out.print(selectionArray[i] + ", ");
        }
        System.out.println();
        System.out.print("quicksortArray : ");

        for (int i = 0; i < quicksortArray.length; i++) {
            System.out.print(quicksortArray[i] + ", ");
        }
        System.out.println();
        System.out.print("mergeArray     : ");

        for (int i = 0; i < mergeArray.length; i++) {
            System.out.print(mergeArray[i] + ", ");
        }
        System.out.println();

    }

    public void createData(int size) {

        bubbleArray = new int[size];
        insertionArray = new int[size];
        selectionArray = new int[size];
        quicksortArray = new int[size];
        mergeArray = new int[size];

        Random r = new Random();

        int temp;

        for (int i = 0; i < size; i++) {
            temp = r.nextInt(size);

            bubbleArray[i] = temp;
            insertionArray[i] = temp;
            selectionArray[i] = temp;
            quicksortArray[i] = temp;
            mergeArray[i] = temp;

        }

    } // End createData method

    public void insertionSort() {
        for (int i = 1; i < insertionArray.length; i++) {
            int temp = insertionArray[i];
            int j = i - 1;
            while (j >= 0 && temp < insertionArray[j]) {
                insertionArray[j + 1] = insertionArray[j];
                j--;
            }
            insertionArray[j + 1] = temp;
        }
    }// End InsertionSort method

    public void selectionSort() {
        int n = selectionArray.length;

        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n; i++) {
            // Find the minimum element in unsorted array 
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (selectionArray[j] < selectionArray[min_idx]) {
                    min_idx = j;
                }
            }

            // Swap the found minimum element with the first 
            // element 
            int temp = selectionArray[min_idx];
            selectionArray[min_idx] = selectionArray[i];
            selectionArray[i] = temp;
        }
    } // End selectionSort method

    public void bubbleSort() {
        int n = bubbleArray.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (bubbleArray[j] > bubbleArray[j + 1]) {
                    int temp = bubbleArray[j];
                    bubbleArray[j] = bubbleArray[j + 1];
                    bubbleArray[j + 1] = temp;

                }
            }

        }

    } // End bubbleSort method

    public void mergeSort() {

        mergeSort(0, mergeArray.length - 1);

    } //End MergeSort method

    public void quicksort() {
        quicksort(0, quicksortArray.length - 1);
    } //End quicksort method

    private void mergeSort(int begin, int end) {
        if (begin < end) {
            int mid = (begin + end) / 2;
            mergeSort(begin, mid);
            mergeSort(mid + 1, end);
            merge(begin, mid, end);
        }
    } // End mergeSort method

    private void merge(int b, int m, int e) {
        int[] temp = new int[e - b + 1];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = mergeArray[b + i];
        }

        int bPtr = b;
        int ePtr = m + 1;
        int i = b;
        while (bPtr != (m + 1) && ePtr != (e + 1)) {
            if (temp[bPtr - b] < temp[ePtr - b]) {
                mergeArray[i] = temp[bPtr - b];
                bPtr++;
            } else {
                mergeArray[i] = temp[ePtr - b];
                ePtr++;
            }
            i++;
        }

        if (ePtr == e + 1) {
            while (bPtr != (m + 1)) {
                mergeArray[i] = temp[bPtr - b];
                bPtr++;
                i++;
            }
        }
    } //End merge method

    private void quicksort(int begin, int end) {
        int temp;
        int pivot = findPivotLocation(begin, end);

        // swap list[pivot] and list[end]
        temp = quicksortArray[pivot];
        quicksortArray[pivot] = quicksortArray[end];
        quicksortArray[end] = temp;

        pivot = end;

        int i = begin,
                j = end - 1;

        boolean iterationCompleted = false;
        while (!iterationCompleted) {
            while (quicksortArray[i] < quicksortArray[pivot]) {
                i++;
            }
            while ((j >= 0) && (quicksortArray[pivot] < quicksortArray[j])) {
                j--;
            }

            if (i < j) {
                //swap list[i] and list[j]
                temp = quicksortArray[i];
                quicksortArray[i] = quicksortArray[j];
                quicksortArray[j] = temp;

                i++;
                j--;
            } else {
                iterationCompleted = true;
            }
        }

        //swap list[i] and list[pivot]
        temp = quicksortArray[i];
        quicksortArray[i] = quicksortArray[pivot];
        quicksortArray[pivot] = temp;

        if (begin < i - 1) {
            quicksort(begin, i - 1);
        }
        if (i + 1 < end) {
            quicksort(i + 1, end);
        }
    } // End quicksort method

    private int findPivotLocation(int b, int e) {
        return (b + e) / 2;
    } // End findPivotLocation method

}

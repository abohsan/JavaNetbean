/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program22_01;

/**
 *
 * @author abdu
 */
public class NewClass {

    int[] a = {3, 4, 6, 6, 7, 8, 1, 2};
    int[] aa = {3, 4, 6, 6, 7, 8, 1, 2};
    int[] bb = {3, 4, 6, 6, 7, 8, 1, 2};
    int[] cc = {3, 4, 6, 6, 7, 8, 1, 2, 3, 4, 6, 6, 7, 8,2};

    

    public void bubleSortingaa() {
        int n = aa.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (aa[j] > aa[j + 1]) {
                    int x = aa[j];
                    aa[j] = aa[j + 1];
                    aa[j + 1] = x;

                }

            }

        }
        System.nanoTime();

    }
    public void bubleSortingbb() {
        int n = bb.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (bb[j] > bb[j + 1]) {
                    int x = bb[j];
                    bb[j] = bb[j + 1];
                    bb[j + 1] = x;

                }

            }

        }

    }

    public void print() {
        int n = a.length;
        for (int i = 0; i < n; i++) {

            System.out.println(a[i]);
        }
    }

    public void printC() {
        int n = cc.length;
        for (int i = 0; i < n; i++) {

            System.out.println(cc[i]);
        }
    }

    public void insetionSort() {
        int n = a.length;

        for (int i = 1; i < n; i++) {
            int temp = a[i];
            int j = i - 1;
            while (j >= 0 && temp > a[j]) {
                a[j + 1] = a[j];
                j--;

            }
            a[j + 1] = temp;

        }
    }

    private void swap(int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    public void sort() {
        int n = a.length;

        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n; i++) {
            // Find the minimum element in unsorted array 
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min_idx]) {
                    min_idx = j;
                }
            }

            // Swap the found minimum element with the first 
            // element 
            int temp = a[min_idx];
            a[min_idx] = a[i];
            a[i] = temp;
        }
    }

    public void merg() {

        int a1 = 0;
        int b1 = 0;
        int i = 0;
        while (a1 != aa.length && b1 != bb.length) {
            if (aa[a1] < bb[b1]) {
                cc[i] = aa[a1];
                a1++;
            } else {
                cc[i] = bb[b1];
                b1++;
            }
            i++;
        }

    }

}

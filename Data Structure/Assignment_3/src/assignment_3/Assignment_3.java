/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author abdu
 */
public class Assignment_3 {

    /**
     * @param args the command line arguments
     */
    static PrintWriter output = null;
    static long startTime;
    static long stopTime;//the code to be timed goes here
    static boolean isFileOpened = false;//the code to be timed goes here

    public static void main(String[] args) {
        // TODO code application logic here
        openFile();
        sortClass n = new sortClass();
        if (isFileOpened) {

            output.println("Element ,bubble sort,insertion sort,selection sort,quicksort,merge sort");

            for (int i = 1; i <= 2000; i++) {
                String str = (20 * i) + "";
                n.createData(20 * i);

                startTime = System.nanoTime();;
                n.bubbleSort();
                stopTime = System.nanoTime();;
                str = str + "," + (stopTime - startTime);

                System.nanoTime();
                startTime = System.nanoTime();
                n.insertionSort();
                stopTime = System.nanoTime();
                str = str + "," + (stopTime - startTime);

                startTime = System.nanoTime();
                n.selectionSort();
                stopTime = System.nanoTime();
                str = str + "," + (stopTime - startTime);

                startTime = System.nanoTime();
                n.quicksort();
                stopTime = System.nanoTime();
                str = str + "," + (stopTime - startTime);

                startTime = System.nanoTime();
                n.mergeSort();
                stopTime = System.nanoTime();
                str = str + "," + (stopTime - startTime);

                output.println(str);

            } // End for loop

            output.close(); //close output stream
        } // End if (isFileOpen)
    }

    private static void openFile() {
        String outputFilename = "output.csv";

        //open output stream
        try {
            output = new PrintWriter(new FileWriter(outputFilename));
            isFileOpened = true;
        } catch (IOException ex) {
            isFileOpened = false;
            System.exit(1);

        }
    }

}

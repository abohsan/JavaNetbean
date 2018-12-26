/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program27_02;

import java.util.Arrays;

/**
 *
 * @author abdu
 */
public class Graph implements GraphInterface {

    private int verticesNumber;
    private LinkedList[] list;

    public Graph() {
        verticesNumber = 10;
        list = new LinkedList[verticesNumber];
        
        for (int i = 0; i < verticesNumber; i++) {
            list[i] = new LinkedList();
        }
    }

    public Graph(int v) {
        verticesNumber = v;
        list = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            list[i] = new LinkedList();
        }

    }

    @Override
    public void addEdge(int v, int w) {
//        matrix[v][w] = 1;
//        matrix[w][v] = 1;
    }

    @Override
    public void removeEdge(int v, int w) {
//        matrix[v][w] = 0;
//        matrix[w][v] = 0;
    }

    @Override
    public int[] findAdjacencyVertices(int v) {
//        int[] vert = new int[verticesNumber];
//        int total = 0;
//        for (int i = 0; i < verticesNumber; i++) {
//            if (matrix[v][i] == 1) {
//                vert[total] = i;
//                total++;
//            }
//        }
//        return Arrays.copyOf(vert, total);
        return null;
    }

    @Override
    public String toString() {
//        String str = "";
//
//        for (int i = 0; i < verticesNumber; i++) {
//            for (int j = 0; j < verticesNumber; j++) {
//                str += matrix[i][j];
//            }
//
//        }
        return null;
    }
}

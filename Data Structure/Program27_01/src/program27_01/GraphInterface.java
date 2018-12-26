/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program27_01;

/**
 *
 * @author abdu
 */
public interface GraphInterface {
    
    public void addEdge(int v, int w);
    public void removeEdge(int v, int w);
    public int[] findAdjacencyVertices(int v);
    @Override
    public String toString();
    
}

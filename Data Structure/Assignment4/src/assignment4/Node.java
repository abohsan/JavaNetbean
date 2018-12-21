// 5676440
 
package assignment4;

/**
 * @author A. Hernandez Data Structures and Algorithms
 */
public class Node {

    private ElementType info;     //element stored in this node
    private Node left;    //link to left child
    private Node right;   //link to right child
  

    public Node() {
        info = null;
        left = right = null;

    }

    public ElementType getInfo() {
        return info;
    }

    public Node getLeftChild() {
        return left;
    }

    public Node getRightChild() {
        return right;
    }

    public void setNode(ElementType x, Node l, Node r) {
        info = x;
        left = l;
        right = r;
    }

    public void setInfo(ElementType x) {
        info = x;
    }

    public void setLeftChild(Node l) {
        left = l;
    }

    public void setRightChild(Node r) {
        right = r;
    }

    @Override
    public String toString() {
        return info.toString();
    }

}

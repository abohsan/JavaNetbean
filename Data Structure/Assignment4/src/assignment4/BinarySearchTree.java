// 5676440
 
package assignment4;

/**
 * @author A. Hernandez Data Structures and Algorithms
 */
public class BinarySearchTree {

    private Node root;    //root of the bst; implemented as a dummy node.

    public BinarySearchTree() {
        root = new Node();        //dummy node as the root
        root.setLeftChild(null);
        root.setRightChild(null);
    } // Done!

    public void add(ElementType x) {
        if (root.getLeftChild() == null) {
            Node p = new Node();
            p.setNode(x, null, null);
            root.setLeftChild(p);
        } else {
            add(x, root.getLeftChild());
        }
    } // Done!

    public boolean contains(String x) {
        return contains(x, root.getLeftChild());
    } // Done!

    public boolean isEmpty() {
        return root.getLeftChild() == null;
    } // Done!

    @Override
    public String toString() {

        return toString(root.getLeftChild());
    } // Done!

    private void add(ElementType x, Node p) {

        if (p.getInfo().identifier.compareTo(x.identifier) < 0) {
            if (p.getLeftChild() == null) {
                Node q = new Node();
                q.setNode(x, null, null);
                p.setLeftChild(q);
            } else {
                add(x, p.getLeftChild());
            }
        } else if (p.getRightChild() == null) {
            Node q = new Node();
            q.setNode(x, null, null);
            p.setRightChild(q);
        } else {
            add(x, p.getRightChild());
        }
    }

    private boolean contains(String x, Node p) {
        if (p == null) {
            return false;
        } else if (p.getInfo().identifier.compareTo(x) == 0) {
            return true;
        } else if ( p.getInfo().identifier.compareTo(x) < 0) {
            return contains(x, p.getLeftChild());
        } else {
            return contains(x, p.getRightChild());
        }

    } //Done!

    private String toString(Node p) {
        if (p != null) {

            return toString(p.getLeftChild()) + p.toString() + " -> " + toString(p.getRightChild());
        } else {
            return "";
        }
    } // Done!

}
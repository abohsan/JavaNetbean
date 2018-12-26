/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject1;

import java.util.Scanner;

class BNode {

    int data;
    BNode left, right;

    public BNode(int item) {
        data = item;
        left = right = null;
    }
}

public class Btree {

    BNode root;

    Btree() {
        root = null;
    }

    void insert(int data) {
        root = insertData(root, data);
    }

    BNode insertData(BNode root, int data) {

        if (root == null) {
            root = new BNode(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertData(root.left, data);
        } else if (data > root.data) {
            root.right = insertData(root.right, data);
        }

        return root;
    }

    void deletedata(int data) {
        root = deleteRec(root, data);
    }

    BNode deleteRec(BNode root, int data) {
        /* Base Case: If the tree is empty */
        if (root == null) {
            return root;
        }

        /* Otherwise, recur down the tree */
        if (data < root.data) {
            root.left = deleteRec(root.left, data);
        } else if (data > root.data) {
            root.right = deleteRec(root.right, data);
        } // if data is same as root's data, then This is the node
        // to be deleted
        else {
            // node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // node with two children: Get the inorder successor (smallest
            // in the right subtree)
            root.data = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteRec(root.right, root.data);
        }

        return root;
    }

    int minValue(BNode root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    public BNode search(BNode root, int key) {
        // Base Cases: root is null or key is present at root 
        if (root == null || root.data == key) {
            return root;
        }

        // val is greater than root's key 
        if (root.data > key) {
            return search(root.left, key);
        }

        // val is less than root's key 
        return search(root.right, key);
    }

    void printLevelOrder() {
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++) {
            printGivenLevel(root, i);
        }
    }

    int height(BNode root) {
        if (root == null) {
            return 0;
        } else {

            int lheight = height(root.left);
            int rheight = height(root.right);

            if (lheight > rheight) {
                return (lheight + 1);
            } else {
                return (rheight + 1);
            }
        }
    }

    /* Print nodes at the given level */
    void printGivenLevel(BNode root, int level) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            System.out.print(root.data + " ");
        } else if (level > 1) {
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }

    public static void main(String[] args) {
        Btree bt = new Btree();
        Scanner input = new Scanner(System.in);
        System.out.println("Inorder traversal of the given tree");
        int s1 = input.nextInt();
        int s2 = input.nextInt();
        int s3 = input.nextInt();
        int s4 = input.nextInt();
        int s5 = input.nextInt();
        int s6 = input.nextInt();
        System.out.println("Delete");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        bt.search(bt.root, s5);
        bt.deletedata(num);
        System.out.println();

    }

}

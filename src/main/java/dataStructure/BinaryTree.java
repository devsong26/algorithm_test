package dataStructure;

public class BinaryTree {

    class Node{
        int value;
        Node left;
        Node right;

        Node(int value){
            this.value = value;
            left = null;
            right = null;
        }
    }

    Node root;

    BinaryTree(){
        root = null;
    }

    void insert(int value){
        root = insertRec(root, value);
    }

    Node insertRec(Node root, int value){
        if(root == null){
            root = new Node(value);
            return root;
        }

        if(value < root.value){
            root.left = insertRec(root.left, value);
        }else if(value > root.value){
            root.right = insertRec(root.right, value);
        }

        return root;
    }


    void preorder(){
        preorderRec(root);
    }

    void preorderRec(Node root){
        if(root != null){
            System.out.println(root.value + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    void inorder(){
        inorderRec(root);
    }

    void inorderRec(Node root){
        if(root != null){
            inorderRec(root.left);
            System.out.print(root.value + " ");
            inorderRec(root.right);
        }
    }

    void postorder(){
        postorderRec(root);
    }

    private void postorderRec(Node root){
        if(root != null){
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.value + " ");
        }
    }
}

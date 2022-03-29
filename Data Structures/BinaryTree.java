import java.util.LinkedList;
import java.util.Queue;


class BinaryTree {

     Node left = null;
     Node right = null;
     Node root = null;

    public BinaryTree() {

    }
    public BinaryTree(Node root) {
        this.root = root;
    } 

    public boolean has_children(Node parent) {
        if (parent.left != null && parent.right != null) {
            return true;
        }
        return false;
    }

    public void insert_node(int data) {
        Node new_node = new Node(data);
        if (this.root == null) {
            this.root = new_node;
            return;
        }
        Queue<Node> que = new LinkedList<Node>();
        
        Node curr = this.root;
        while (has_children(curr)) {
            que.add(curr.left);
            que.add(curr.right);
            curr = que.poll();
        }
        if (curr.left == null) {
            curr.left = new_node;
        }
        else {
            curr.right = new_node;
        }
    }


    public void print_inorder(Node root) {
        if (root.left != null) {
            print_inorder(root.left);
        }
        System.out.print(root.data + " ");
        if (root.right != null) {
            print_inorder(root.right);
        }

    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert_node(5);
        bt.insert_node(9);
        bt.insert_node(3);
        bt.insert_node(6);
        bt.insert_node(10);
        bt.insert_node(4);
        bt.insert_node(21);

        bt.print_inorder(bt.root);
    }
        
        
        
    
}
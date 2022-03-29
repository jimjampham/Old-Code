// import java.util.Random;

class BinarySearchTree {
    Node left = null;
    Node right = null;
    Node root = null;

    public BinarySearchTree() {
        
    }

    public BinarySearchTree(Node root) {
        this.root = root;
    }
    
    public void insert(int d) {
        Node n = new Node(d);
        if (this.root == null) {
            this.root = n;
            return;
        }

        Node curr = this.root;
        Node parent = this.root;
        // Check if the value we are at is lower than the node we want to insert
        while (curr != null) {
            parent = curr;
            if (n.data < curr.data) {
                curr = curr.left;
            }
            else {
                curr = curr.right;
            }
        }
        
        if (n.data < parent.data) {
            parent.left = n;
        } 
        else {
            parent.right = n;
        }

        // Check if the value we are at is greater than or equal to the node we want to insert

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

    public int find_max(Node root) {
        if (root.right != null) {
            return find_max(root.right);
        } 
        else {
            return root.data;
        }
    }

    public int find_min(Node root) {
        if (root.left != null) {
            return find_min(root.left);
        }
        else {
            return root.data;
        }

    }


    public static void main(String[] args) {
        BinarySearchTree my_tree = new BinarySearchTree();
        my_tree.insert(50);
        for (int i = 0; i < 6; i++) {
            int n = (int)(Math.random() * 100) + 1;
            my_tree.insert(n);
            System.out.print(n + " ");
        }
        System.out.println();
        my_tree.print_inorder(my_tree.root);
        System.out.println();
        System.out.println(my_tree.find_min(my_tree.root));
        System.out.println(my_tree.find_max(my_tree.root));
    }
}
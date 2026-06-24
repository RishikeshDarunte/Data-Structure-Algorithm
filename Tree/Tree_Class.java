
import java.util.Scanner;

public class Tree_Class {

    public class Node {

        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    private Node root;

    void insert(Node r, Node n)//R is the root. N is the new node.
    {
        if (root == null) {
            root = n;
        } else {
            if (n.data < r.data)//lesser?
            {
                if (r.left == null)//to left
                {
                    r.left = n;//insert
                } else {
                    insert(r.left, n);//explore left

                }
            } else//greater or equal
            {
                if (r.right == null)//to right
                {
                    r.right = n;//insert
                } else {
                    insert(r.right, n);//explore right

                }
            }
        }
    }

    void inorder(Node r) {
        if (r != null) {
            inorder(r.left);//L
            System.out.print(r.data + ",");//P
            inorder(r.right);//R
        }
    }

    void preorder(Node r) {
        if (r != null) {
            System.out.print(r.data + ",");//P
            preorder(r.left);//L
            preorder(r.right);//R
        }
    }

    void postorder(Node r) {
        if (r != null) {
            postorder(r.left);//L
            postorder(r.right);//R
            System.out.print(r.data + ",");//P
        }
    }

    int count_Node(Node r) {
        if (r == null) {
            return 0;
        } else {
            return 1 + count_Node(r.left) + count_Node(r.right);
        }
    }

    int count_Leaf_Node(Node r) {
        if (r == null) {
            return 0;
        } else if (r.left == null && r.right == null) {
            return 1;
        } else {
            return count_Leaf_Node(r.left) + count_Leaf_Node(r.right);
        }
    }

    int count_Height(Node r) {
        if (r == null) {
            return -1;
        } else {
            int leftHeight = count_Height(r.left);
            int rightHeight = count_Height(r.right);
            return 1 + Math.max(leftHeight, rightHeight);
        }
    }

// create menu driven code for inorder , preorder, and postorder traversals
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tree_Class obj = new Tree_Class();

        int choice, data;

        do {
            System.out.print("\n\n===== Tree Menu =====");
            System.out.print("\n1. Insert");
            System.out.print("\n2. Inorder Traversal");
            System.out.print("\n3. Preorder Traversal");
            System.out.print("\n4. Postorder Traversal");
            System.out.print("\n5. Total nodes in tree");
            System.out.print("\n6. Count leaf nodes in tree");
            System.out.print("\n7. Count height of tree");
            System.out.print("\n0. Exit");
            System.out.print("\nEnter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\nEnter data to insert: ");
                    data = sc.nextInt();
                    obj.insert(obj.root, obj.new Node(data));
                    break;

                case 2:
                    System.out.print("\nInorder Traversal: ");
                    obj.inorder(obj.root);
                    break;

                case 3:
                    System.out.print("\nPreorder Traversal: ");
                    obj.preorder(obj.root);
                    break;

                case 4:
                    System.out.print("\nPostorder Traversal: ");
                    obj.postorder(obj.root);
                    break;

                case 5:
                    System.out.print("\nTotal nodes in tree: " + obj.count_Node(obj.root));
                    break;

                case 6:
                    System.out.print("\nTotal leaf nodes in tree: " + obj.count_Leaf_Node(obj.root));
                    break;

                case 7:
                    System.out.print("\nHeight of tree: " + obj.count_Height(obj.root));
                    break;

                case 0:
                    System.out.print("\nExiting... rishi's code");
                    break;

                default:
                    System.out.print("\nInvalid choice. Try again.");
            }

        } while (choice != 0);
    }

}

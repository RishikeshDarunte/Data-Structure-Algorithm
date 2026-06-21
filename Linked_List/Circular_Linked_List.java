import java.util.Scanner;
public class Circular_Linked_List {

    Node root, last;

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    void insert_left(int data) {
        Node n = new Node(data);//create a node
        if (root == null)//only 1st time
        {
            root = last = n;
            last.next = root;
        } else {
            n.next = root;//1
            root = n;//2
            last.next = root;//3
        }

    }

    void insert_right(int data) {
        Node n = new Node(data);//create a node
        if (root == null)//only 1st time
        {
            root = last = n;
            last.next = root;
        } else {
            last.next = n;//1
            last = n;//2
            last.next = root;//3
        }
    }

    void delete_left() {
        if (root == null) {
            System.out.print("\nEmpty List");
        } else {
            Node t = root;//1
            if (root == last)//single node
            {
                root = last = null;
            } else {
                root = root.next;//2
                last.next = root;//3

                
            }
            System.out.print("\n|" + t.data + "|-> deleted");

        }
    }

    void delete_right() {
        if (root == null) {
            System.out.print("\nEmpty List");
        } else {
            Node t, t2;
            t = t2 = root;//1
            if (root == last)//single node
            {
                root = last = null;
            }//manual deletion
            else {
                while (t != last)//2
                {
                    t2 = t;
                    t = t.next;
                }
                last = t2;//3
                last.next = root;//4
            }
            System.out.print("\n|" + t.data + "|-> deleted");
        }
    }

    void print_list() {
        if (root == null) {
            System.out.print("\nList Empty");
        } else {
            Node t = root;
            do {
                System.out.print("|" + t.data + "|->");
                t = t.next;
            } while (t != root);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circular_Linked_List obj = new Circular_Linked_List();
        int choice = 0, e;
        do {
            System.out.print("\n\nCircular Linked List Menu");
            System.out.print("\n-------------------------");
            System.out.print("\n1. Insert Left");
            System.out.print("\n2. Insert Right");
            System.out.print("\n3. Delete Left");
            System.out.print("\n4. Delete Right");
            System.out.print("\n5. Print List");
            System.out.print("\n6. Exit");
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("\nEnter element to insert: ");
                    e = sc.nextInt();
                    obj.insert_left(e);
                    break;
                case 2:
                    System.out.print("\nEnter element to insert: ");
                    e = sc.nextInt();
                    obj.insert_right(e);
                    break;
                case 3:
                    obj.delete_left();
                    break;
                case 4:
                    obj.delete_right();
                    break;
                case 5:
                    obj.print_list();
                    break;
                case 6:
                    System.out.println("Exiting... code by Rishi");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 6);
    }

}

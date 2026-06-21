// PRN : 260244520063
// Name : Rishikesh Pandharinath Darunte

import java.util.Scanner;

public class Circular_Doubly_Linked_List {

    class Dnode {

        int data;
        Dnode left, right;

        Dnode(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Dnode root, last;

    void insert_left(int data) {
        Dnode n = new Dnode(data);

        if (root == null) {
            root = last = n;
            root.left = root.right = root;
        } else {
            n.right = root;
            n.left = last;
            root.left = n;
            last.right = n;
            root = n;
        }
    }

    void insert_right(int data) {
        Dnode n = new Dnode(data);

        if (root == null) {
            root = last = n;
            root.left = root.right = root;
        } else {
            n.right = root;
            n.left = last;
            root.left = n;
            last.right = n;
            last = n;
        }
    }

    void delete_left() {
        if (root == null) {
            System.out.println("\n Emplt List");
        } else if (root == last) {
            System.out.print("\n<-|" + root.data + "|->deleted");
            root = last = null;
        } else {
            Dnode t = root;
            root = root.right;
            root.left = last;
            last.right = root;
            System.out.print("\n<-|" + t.data + "|->deleted");
        }
    }

    void delete_right() {
        if (root == null) {
            System.out.println("\n Empty List");
        } else if (root == last) {
            System.out.print("\n<-|" + root.data + "|->deleted");
            root = last = null;
        } else {
            Dnode t = last;

            last = last.left;
            last.right = root;
            root.left = last;
            System.out.print("\n<-|" + t.data + "|->deleted");
        }
    }

    void print_list() {
        if (root == null) {
            System.out.print("\n List Empty");
        } else {
            Dnode t = root;
            do {
                System.out.print("<-|" + t.data + "|->");
                t = t.right;
            } while (t != root);
        }
    }

    void print_rev() {
        if (root == null) {
            System.out.print("\n List Empty");
        } else {
            Dnode t = last;
            do {
                System.out.print("<-|" + t.data + "|->");
                t = t.left;
            } while (t != last);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circular_Doubly_Linked_List obj = new Circular_Doubly_Linked_List();

        int choice = 0, data, key, ref;

        do {
            System.out.print("\n\n===== Circular Doubly Linked List Menu =====");
            System.out.print("\n1. Insert Left");
            System.out.print("\n2. Insert Right");
            System.out.print("\n3. Delete Left");
            System.out.print("\n4. Delete Right");
            System.out.print("\n5. Print Normal");
            System.out.print("\n6. Reverse Print");
            System.out.print("\n0. Exit");
            System.out.print("\nEnter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    obj.insert_left(data);
                    break;

                case 2:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    obj.insert_right(data);
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
                    obj.print_rev();
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
 
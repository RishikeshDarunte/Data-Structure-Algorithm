import java.util.Scanner;

public class Linear_Linked_List_Class {

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    Node root;

    void insert_left(int data) {
        Node n = new Node(data);//create a node
        if (root == null)//only 1st time
        {
            root = n;
        } else {
            n.next = root;//1
            root = n;//2
        }

    }

    void insert_right(int data) {
        Node n = new Node(data);//create a node
        if (root == null)//only 1st time
        {
            root = n;
        } else {
            Node t = root;//1 start from root
            while (t.next != null)//2 move to right most
            {
                t = t.next;
            }
            t.next = n;//3 connected
        }
    }

    void delete_left() {
        if (root == null) {
            System.out.print("\nEmpty List");
        } else {
            Node t = root;//1
            root = root.next;//2
            System.out.print("\n|" + t.data + "|-> deleted");
            //The printing simply prints what is deleted but
            // AGC will physically delete once method is over
        }
    }

    void delete_right() {
        if (root == null) {
            System.out.print("\nEmpty List");
        } else {
            Node t, t2;
            t = t2 = root;//1
            if (root.next == null)//single node
            {
                root = null;//manual deletion
            } else {
                while (t.next != null)//2
                {
                    t2 = t;
                    t = t.next;
                }

                t2.next = null;//3
            }
            System.out.print("\n|" + t.data + "|-> deleted");
        }
    }

    void print_list() {
        if (root == null) {
            System.out.print("\nList Empty");
        } else {
            Node t = root;
            while (t != null) {
                System.out.print("|" + t.data + "|->");
                t = t.next;
            }
            System.out.print("NULL");
        }
    }

    void search_list(int key)//key is element to search
    {
        if (root == null) {
            System.out.print("\nList Empty"); 
        }else {
            Node t = root;
            while (t != null) {
                if (t.data == key) {
                    System.out.print("\n" + key + " found in list");
                    return;
                }
                t = t.next;
            }
            System.out.print("\n" + key + " not found in list");
        }
    }

    void insert_after(int ref, int e)//key is element to search
    {
        if (root == null) {
            System.out.print("\nList Empty"); 
        }else {
            Node t = root;
            while (t != null) {
                if (t.data == ref) {
                    System.out.print("\n" + ref + " found in list");
                    //found
                    Node n = new Node(e);//element
                    n.next = t.next;//1
                    t.next = n;//2
                }
                t = t.next;
            }
            System.out.print("\n" + ref + " not found in list");
        }
    }

    void delete_element(int e)//e if found will be deleted.
    {
        if (root == null) {
            System.out.print("\nList Empty"); 
        }else {
        
            Node t = root;
            Node t2 = root;
            while (t != null) {
                if (t.data == e) {
                    System.out.print("\n" + e + " found in list");
                    //found nd now search for case
                    if (t == root)//case 1
                    {
                        root = root.next; 
                    }else if (t.next == null)//case 2
                    {
                        t2.next = null; 
                    }else//case 3
                    {
                        t2.next = t.next;//re refering to next
            }System.out.print("\n" + t.data + " deleted");
                    return;
                }
                t2 = t;
                t = t.next;

            }
            System.out.print("\n" + e + " not found in list");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Linear_Linked_List_Class list = new Linear_Linked_List_Class();
        int choice, data;
        do {
            System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Print List\n6.Search\n7.Insert After\n8.Delete Element\n9.Exit");
            System.out.print("Enter Choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Data:");
                    data = sc.nextInt();
                    list.insert_left(data);
                    break;
                case 2:
                    System.out.print("Enter Data:");
                    data = sc.nextInt();
                    list.insert_right(data);
                    break;
                case 3:
                    list.delete_left();
                    break;
                case 4:
                    list.delete_right();
                    break;
                case 5:
                    list.print_list();
                    break;
                case 6:
                    System.out.print("Enter element to search:");
                    data = sc.nextInt();
                    list.search_list(data);
                    break;
                case 7:
                    System.out.print("Enter Reference Element:");
                    int ref = sc.nextInt();
                    System.out.print("Enter Data:");
                    data = sc.nextInt();
                    list.insert_after(ref, data);
                    break;
                case 8:
                    System.out.print("Enter Element to Delete:");
                    data = sc.nextInt();
                    list.delete_element(data);
                    break;
                case 9:
                    System.out.println("Exiting...the code by rishi");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 9);
    }
}


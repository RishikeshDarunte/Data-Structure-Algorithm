
import java.util.Scanner;
//  Stack using Linkedlist

public class Dynamic_Stack {

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    Node tos;//all opeartions done by/on root

    void push(int data) {
        Node n = new Node(data);//create a node
        if (tos == null)//only 1st time
        {
            tos = n; 
        }else {
            n.next = tos;//1
            tos = n;//2
        }

    }

    void pop() {
        if (tos == null) {
            System.out.print("\nEmpty Stack"); 
        }else {
            Node t = tos;//1
            tos = tos.next;//2
            System.out.print("\nPoped:" + t.data);
        }
    }

    void print_stack() {
        if (tos == null) {
            System.out.print("\nStack Empty"); 
        }else {
            Node t = tos;
            while (t != null) {
                System.out.print("\n|" + t.data + "|");
                System.out.print("\n-----");
                t = t.next;
            }

        }
    }

    void peek() {
        if (tos == null) {
            System.out.print("\nStack Empty"); 
        }else {
            System.out.print("\nAt Peek:" + tos.data);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dynamic_Stack obj = new Dynamic_Stack();
        int choice = 0, e;
        do {
            System.out.print("\nStack Menu");
            System.out.print("\n-----------");
            System.out.print("\n1.Push");
            System.out.print("\n2.Pop");
            System.out.print("\n3.Peek");
            System.out.print("\n4.Print");
            System.out.print("\n0.Exit");
            System.out.print("\n:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("\nEnter element to push:");
                    e = sc.nextInt();
                    obj.push(e);//obj.push(sc.nextInt());
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.peek();
                    break;
                case 4:
                    System.out.print("\nElements on Stack. \n");
                    obj.print_stack();
                    break;
                case 0:
                    System.out.print("\nExiting code .. coded by amar.career");
                    break;
                default:
                    System.out.print("\nInvalid option selected.");
                    break;
            }
        } while (choice != 0);//Not zero, continue.
    }
}

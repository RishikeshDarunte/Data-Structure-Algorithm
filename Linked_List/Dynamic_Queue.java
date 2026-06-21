
import java.util.Scanner;

public class Dynamic_Queue {

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    Node front, rear;

    void enqueue(int data) {
        Node n = new Node(data);//create a node
        if (rear == null)//only 1st time
        {
            front = rear = n;
        } else {
            rear.next = n;//1
            rear = n;//2
        }
    }

    void dequeue() {
        if (front == null) {
            System.out.println("Empty queue"); 
        }else {
            Node t = front;
            if (front == rear)//single node
            {
                front = rear = null;//manual delete
             }else {
                front = front.next;//move ahead

                        }System.out.println("Dequeued:" + t.data);
        }
    }

    void print_queue() {
        if (front == null) {
            System.out.print("\nQueue Empty"); 
        }else {
            Node t = front;
            while (t != null) {
                System.out.print("|" + t.data + "|-");
                t = t.next;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dynamic_Queue obj = new Dynamic_Queue();
        int choice = 0, e;
        do {
            System.out.print("\n\nQueue Menu");
            System.out.print("\n-----------");
            System.out.print("\n1. Enqueue");
            System.out.print("\n2. Dequeue");
            System.out.print("\n3. Print Queue");
            System.out.print("\n0. Exit");
            System.out.print("\nEnter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element: ");
                    e = sc.nextInt();
                    obj.enqueue(e);
                    break;

                case 2:
                    obj.dequeue();
                    break;

                case 3:
                    obj.print_queue();
                    break;

                case 0:
                    System.out.print("\nExiting... coded by Rishi");
                    break;

                default:
                    System.out.print("Invalid choice");
            }

        } while (choice != 0);
    }
}

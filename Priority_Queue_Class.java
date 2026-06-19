
import java.util.Scanner;

public class Priority_Queue_Class {

    private int front, rear, Maxsize, queue[];

    void create_queue(int size) {
        front = 0;  
        rear = -1;
        Maxsize = size;
        queue = new int[Maxsize];
    }

    // ENQUEUE
    void enqueue(int e) {
        queue[++rear] = e;
        //sort:bubble sort
        for (int i = front; i < rear; i++) {
            for (int j = front; j < rear; j++) {
                if (queue[j] > queue[j + 1])//For ascending priority cube 
                {
                    int temp = queue[j];
                    queue[j] = queue[j + 1];
                    queue[j + 1] = temp;
                }
            }
        }
    }

    boolean is_full() {
        return (rear == Maxsize - 1);
    }

    // DEQUEUE
    int dequeue() {
        return (queue[front++]);
    }

    boolean is_empty() {
        return (front > rear);
    }

    void print_queue() {
        System.out.print("\nQueue Elements (FIFO): ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Priority_Queue_Class obj = new Priority_Queue_Class();

        System.out.print("\nEnter size of Queue: ");
        int size = sc.nextInt();
        obj.create_queue(size);

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
                    if (!obj.is_full()) {
                        System.out.print("Enter element: ");
                        e = sc.nextInt();
                        obj.enqueue(e);
                    } else {
                        System.out.print("Queue Full");
                    }
                    break;

                case 2:
                    if (!obj.is_empty()) {
                        System.out.print("Dequeued Element: " + obj.dequeue());
                    } else {
                        System.out.print("Queue Empty");
                    }
                    break;

                case 3:
                    if (!obj.is_empty()) {
                        obj.print_queue();
                    } else {
                        System.out.print("Queue Empty");
                    }
                    break;

                case 0:
                    System.out.print("\nExiting... coded by Amar Career Credentials");
                    break;

                default:
                    System.out.print("Invalid choice");
            }

        } while (choice != 0);
    }
}

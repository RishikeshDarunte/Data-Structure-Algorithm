import java.util.Scanner;

public class Circular_Queue {

    private int front, rear, count, Maxsize;
    private int[] queue;

    void create_queue(int size) {
        front = 0;
        rear = -1;
        count = 0;
        Maxsize = size;
        queue = new int[Maxsize];
    }

    void enqueue(int e) {
        rear = (rear + 1) % Maxsize;  
        queue[rear] = e;
        count++;
    }

    int dequeue() {
        int temp = queue[front];
        front = (front + 1) % Maxsize; 
        count--;
        return temp;
    }

    boolean is_full() {
        return (count == Maxsize);
    }

    boolean is_empty() {
        return (count == 0);
    }

    void print_queue() {
        int i = front;
        int c = 0;

        while (c < count) {
            System.out.print(queue[i] + "-");
            i = (i + 1) % Maxsize;
            c++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circular_Queue obj = new Circular_Queue();

        System.out.print("\nEnter size of Queue: ");
        int size = sc.nextInt();
        obj.create_queue(size);

        int choice, e;

        do {
            System.out.println("\nQueue Menu");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Print");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (!obj.is_full()) {
                        System.out.print("Enter element: ");
                        e = sc.nextInt();
                        obj.enqueue(e);
                    } else {
                        System.out.println("Queue Full");
                    }
                    break;

                case 2:
                    if (!obj.is_empty()) {
                        System.out.println("Dequeued: " + obj.dequeue());
                    } else {
                        System.out.println("Queue Empty");
                    }
                    break;

                case 3:
                    if (!obj.is_empty()) {
                        System.out.print("Queue: ");
                        obj.print_queue();
                    } else {
                        System.out.println("Queue Empty");
                    }
                    break;

                case 0:
                    System.out.println("Exiting...  code by rishi");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 0);

        sc.close();
    }
}
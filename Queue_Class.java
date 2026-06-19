
import java.util.Scanner;

public class Queue_Class {

    private int front, rear, Maxsize, queue[];

    void create_queue(int size) {
        rear = -1;
        front = 0;
        Maxsize = size;
        queue = new int[Maxsize];
    }

    //enqueue(e):Increment rear by one and accepts element at q[rear]
    void enqueue(int e) {
        queue[++rear] = e;
    }

    boolean is_full() {
        return (rear == Maxsize - 1);
    }

    //dequeue():e:Remove element from queue front.
    //With every Dequeue operation front increments by one.
    int dequeue() {
        return (queue[front++]);
    }

    boolean is_empty() {
        return (front > rear);
    }

    void print_queue() //print in FIFO->front->rear
    {
        for (int i = front; i <= rear; i++)//countdown
        {
            System.out.print(queue[i] + "-");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue_Class obj = new Queue_Class();
        System.out.print("\nEnter size of Queue:");
        int size = sc.nextInt();
        int choice = 0, e;
        obj.create_queue(size);
        do {
            System.out.print("\nQueue Menu");
            System.out.print("\n-----------");
            System.out.print("\n1.Enqueue");
            System.out.print("\n2.Dequeue");
            System.out.print("\n3  .Print");
            System.out.print("\n0.Exit");
            System.out.print("\n:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (!obj.is_full())//if not full
                    {
                        System.out.print("\nEnter element to queue:");
                        e = sc.nextInt();
                        obj.enqueue(e);//obj.push(sc.nextInt());
                    } else {
                        System.out.print("\nQueue Full");
                    }
                    break;
                case 2:
                    if (!obj.is_empty())//if not empty
                    {
                        System.out.print("\nElement Removed:" + obj.dequeue());
                    } else {
                        System.out.print("\nQueue Empty");
                    }
                    break;
                case 3:
                    if (!obj.is_empty())//if not empty
                    {
                        System.out.print("\nElements on Queue. \n");
                        obj.print_queue();
                    } else {
                        System.out.print("\nQueue Empty");
                    }
                    break;
                case 0:
                    System.out.print("\nExiting code .. coded by rishi");
                    break;
                default:
                    System.out.print("\nInvalid option selected.");
                    break;
            }
        } while (choice != 0);//Not zero, continue.
    }
}

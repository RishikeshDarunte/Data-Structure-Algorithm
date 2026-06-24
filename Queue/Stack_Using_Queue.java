import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Stack_Using_Queue {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int e) {
        q2.add(e);

        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }
        while (!q2.isEmpty()) {
            q1.add(q2.poll());
        }
    }

    public int pop() {
        if (!q1.isEmpty()) {
            return q1.poll();
        }
        return -1;
    }

    int Peek() {
        if (!q1.isEmpty()) {
            return q1.peek();
        }
        return -1;
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public void print_stack() {
        System.out.println(q1);
    }

    public static void main(String[] args) {
        Stack_Using_Queue sq = new Stack_Using_Queue();

        Scanner sc = new Scanner(System.in);
        int choice, e;
        do {
            System.out.println("1.push element");
            System.out.println("2.pop element");
            System.out.println("3.peek element");
            System.out.println("4.check empty");
            System.out.println("5.print stack");
            System.out.println("Enter choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    e = sc.nextInt();
                    sq.push(e);
                    break;
                }
                case 2: {
                    if (!sq.isEmpty()) {
                        System.out.println(sq.pop()); 
                    }else {
                        System.out.println("empty stack");
                    }

                    break;
                }
                case 3: {
                    System.out.println(sq.Peek());
                    break;
                }
                case 4: {
                    System.out.println(sq.isEmpty());
                    break;
                }
                case 5: {
                    sq.print_stack();
                    break;
                }
                default:
                    System.out.println("invalid choice");
            }

        } while (choice != 0);
    }
}

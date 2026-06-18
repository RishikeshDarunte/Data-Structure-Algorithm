// Rishikesh Darunte
// 260244520063

import java.util.Scanner;

public class TwoStacks {

    private int tos1, tos2, maxsize, stack[];

    void create_stack(int size) {
        maxsize = size;
        stack = new int[maxsize];
        tos1 = -1;
        tos2 = maxsize;
    }

    void push1(int e1) {
        if (is_full()) {
            System.out.println("Stack 1 Overflow");
            return;
        }
        stack[++tos1] = e1; 
    }

    void push2(int e2) {
        if (is_full()) {
            System.out.println("Stack 2 Overflow");
            return;
        }
        stack[--tos2] = e2;
    }

    int pop1() {
        if (is_empty1()) {
            System.out.println("Stack 1 Underflow");
            return -1;
        }
        return stack[tos1--];
    }

    int pop2() {
        if (is_empty2()) {
            System.out.println("Stack 2 Underflow");
            return -1;
        }
        return stack[tos2++];
    }

    int peek1() {
        if (is_empty1()) {
            System.out.println("Stack 1 Empty");
            return -1;
        }
        return stack[tos1];
    }

    int peek2() {
        if (is_empty2()) {
            System.out.println("Stack 2 Empty");
            return -1;
        }
        return stack[tos2];
    }

    boolean is_empty1() {
        return (tos1 == -1);
    }

    boolean is_empty2() {
        return (tos2 == maxsize);
    }

    boolean is_full() {
        return (tos1 + 1 == tos2);
    }

    void print_stack1() {
        for (int i = tos1; i >= 0; i--) {
            System.out.println(" " + stack[i]);
        }
    }

    void print_stack2() {
        for (int i = tos2; i < maxsize; i++) {
            System.out.println(" " + stack[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TwoStacks obj = new TwoStacks();
        System.out.println("Enter size of stack: ");
        int size = sc.nextInt();
        obj.create_stack(size);

        int choice, e;

        do {
            System.out.println("1.Push in stack 1");
            System.out.println("2.Push in stack 2");
            System.out.println("3.Pop in stack 1");
            System.out.println("4.Pop in stack 2");
            System.out.println("5.Peek in stack 1");
            System.out.println("6.Peek in stack 2");
            System.out.println("7.Print in stack 1");   
            System.out.println("8.Print in stack 2");
            System.out.println("0.Exit");
            System.out.println("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (!obj.is_full()) {
                        System.out.println("\nEnter element to push in stack 1:");
                        e = sc.nextInt();
                        obj.push1(e);
                    } else {
                        System.out.println("\nStack is full");
                    }
                    break;
                case 2:
                    if (!obj.is_full()) {
                        System.out.println("\nEnter element to push in stack 2:");
                        e = sc.nextInt();
                        obj.push2(e);
                    } else {
                        System.out.println("\nStack is full");
                    }
                    break;
                case 3:
                    if (!obj.is_empty1()) {
                        System.out.print("\nElement popped from stack 1:" + obj.pop1());
                    } else {
                        System.out.print("\nStack 1 Empty");
                    }
                    break;
                case 4:
                    if (!obj.is_empty2()) {
                        System.out.print("\nElement popped from stack 2:" + obj.pop2());
                    } else {
                        System.out.print("\nStack 2 Empty");
                    }
                    break;
                case 5:
                    if (!obj.is_empty1()) {
                        System.out.print("\nElement @ Peek from stack 1:" + obj.peek1());
                    } else {
                        System.out.print("\nStack 1 Empty");
                    }
                    break;
                case 6:
                    if (!obj.is_empty2()) {
                        System.out.print("\nElement @ Peek from stack 2:" + obj.peek2());
                    } else {
                        System.out.print("\nStack 2 Empty");
                    }
                    break;
                case 7:
                    if (!obj.is_empty1()) {
                        System.out.println("\nStack 1:");
                        obj.print_stack1();
                    } else {
                        System.out.println("\nStack 1 Empty");
                    }

                    break;
                case 8:
                    if (!obj.is_empty2()) {
                        System.out.println("\nStack 2:");
                        obj.print_stack2();
                    } else {
                        System.out.println("\nStack 2 Empty");
                    }
                    break;

                case 0:
                    System.out.println("Exiting....code by Rishi");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 0);
    }

}

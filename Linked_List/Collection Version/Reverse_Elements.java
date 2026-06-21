// Reverse Elements in a LinkedList  we have to take elements from the usr and store in the linked list and then reverse the elements of the linked list   use Dynamic stack

import java.util.LinkedList;
import java.util.Scanner;
public class Reverse_Elements {
    static LinkedList<Integer> reverse(LinkedList<Integer> list) {
        LinkedList<Integer> reversedList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Original List: " + list);
        LinkedList<Integer> reversedList = reverse(list);
        System.out.println("Reversed List: " + reversedList);
    }
}

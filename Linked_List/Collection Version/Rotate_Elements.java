// Rotate elements of the linked list by k positions to the right

import java.util.LinkedList;
public class Rotate_Elements {
    static LinkedList<Integer> rotate(LinkedList<Integer> list, int k) {
        if (list.isEmpty() || k <= 0) {
            return list;
        }

        int size = list.size();
        k = k % size;

        for (int i = 0; i < k; i++) {
            Integer lastElement = list.removeLast();
            list.addFirst(lastElement);
        }
        return list;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int k = 2; // Number of positions to rotate
        System.out.println("Original List: " + list);
        LinkedList<Integer> rotatedList = rotate(list, k);
        System.out.println("Rotated List: " + rotatedList);
    }
}
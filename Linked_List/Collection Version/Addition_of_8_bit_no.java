// 260244520063
// Rishikesh Darunte

import java.util.LinkedList;

public class Addition_of_8_bit_no {

    static LinkedList<Integer> sumOfBinary(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList< Integer> list3 = new LinkedList<Integer>();
        int carry = 0;

        while (!list1.isEmpty() || !list2.isEmpty()) {
            int val1 = list1.isEmpty() ? 0 : list1.removeLast();
            int val2 = list2.isEmpty() ? 0 : list2.removeLast();

            int sum = val1 + val2 + carry;

            list3.addFirst(sum % 2);
            carry = sum / 2;

        }
        if (carry != 0) {
            list3.addFirst(carry);
        }

        return list3;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        list1.add(1);
        list1.add(1);
        list1.add(0);
        list1.add(0);
        list1.add(1);
        list1.add(0);
        list1.add(1);
        list1.add(1);

        list2.add(1);
        list2.add(1);
        list2.add(0);
        list2.add(0);
        list2.add(1);
        list2.add(0);
        list2.add(1);
        list2.add(0);

        System.out.println(sumOfBinary(list1, list2));

    }

}


import java.util.LinkedList;

public class Merging_Sorted {

    static LinkedList<Integer> Merge(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> list3 = new LinkedList<>();
        int index1 = 0, index2 = 0;
        while (index1 < list1.size() && index2 < list2.size()) {
            if (list1.get(index1) < list2.get(index2)) {
                list3.add(list1.get(index1++));
            } else {
                list3.add(list2.get(index2++));
            }
        }
        while (index1 < list1.size()) {
            list3.add(list1.get(index1++));
        }

        while (index2 < list2.size()) {
            list3.add(list2.get(index2++));
        }

        return list3;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        LinkedList<Integer> list3 = new LinkedList<>();
        //create and add sorted
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        //create and add sorted
        list2.add(5);
        list2.add(8);
        list2.add(12);
        list3 = Merge(list1, list2);
        System.out.print("\nList1:" + list1);
        System.out.print("\nList2:" + list2);
        System.out.print("\nList3:" + list3);
    }
}

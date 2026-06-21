import java.util.LinkedList;
import java.util.Scanner;

public class Linked_List_Collection {

    public static void main(String[] args) {
        LinkedList<Integer> obj = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        int choice = 0, data, key, ref;

        do {
            System.out.print("\n\n===== Doubly Linked List Menu =====");
            System.out.print("\n1. Insert Left");
            System.out.print("\n2. Insert Right");
            System.out.print("\n3. Delete Left");
            System.out.print("\n4. Delete Right");
            System.out.print("\n5. Print List");
            System.out.print("\n0. Exit");
            System.out.print("\nEnter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    obj.addFirst(data);
                    break;

                case 2:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    obj.addLast(data);
                    break;

                case 3:
                    if (!obj.isEmpty()) {
                        System.out.print("\nRemoved from Left:" + obj.removeFirst());
                    } else {
                        System.out.print("\nLinked list is empty. ");
                    }
                    break;

                case 4:
                    if (!obj.isEmpty()) {
                        System.out.print("\nRemoved from Right:" + obj.removeLast());
                    } else {
                        System.out.print("\nLinked list is empty. ");
                    }
                    break;

                case 5:
                    if (!obj.isEmpty()) {
                        for (int index = 0; index < obj.size(); index++) {
                            System.out.print("|" + obj.get(index) + "|->");
                        }
                        /* for(int i:obj)
                        {
                            System.out.print("|"+i+"|->");
                        }*/
                        //System.out.print("List has:"+obj);
                    } else {
                        System.out.print("\nLinked list is empty. ");
                    }
                    break;

                case 0:
                    System.out.print("\nExiting... Career Credentials Mode OFF 🚀");
                    break;

                default:
                    System.out.print("\nInvalid choice. Try again.");
            }

        } while (choice != 0);
    }
}

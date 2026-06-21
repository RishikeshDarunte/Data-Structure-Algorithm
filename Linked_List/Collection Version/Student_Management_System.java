
import java.util.LinkedList;
import java.util.Scanner;

// Student class
class Student {

    private String name;
    private char gender;
    private float pointer;

    //constructor
    public Student(String name, char gender, float pointer) {
        this.name = name;
        this.gender = gender;
        this.pointer = pointer;
    }
    //getter for searching
    public String get_name() {
        return name;
    }
    // to display student details
    public void print_student() {
        System.out.println("Name: " + name + ", Gender: " + gender + ", Pointer: " + pointer);
    }
}

public class Student_Management_System {

    public static void main(String[] args) {

        LinkedList<Student> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        int choice;
        String name;
        char gender;
        float pointer;

        do {
            System.out.println("\n-----Student Management Menu------");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Search Student");
            System.out.println("4. Print All Students");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter name: ");
                    name = sc.nextLine();

                    System.out.print("Enter gender: ");
                    gender = sc.next().charAt(0);

                    System.out.print("Enter pointer: ");
                    pointer = sc.nextFloat();

                    list.add(new Student(name, gender, pointer));
                    System.out.println("Student Added!");
                    break;

                case 2:
                    System.out.print("Enter name to delete: ");
                    name = sc.nextLine();

                    boolean removed = false;
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).get_name().equalsIgnoreCase(name)) {
                            list.remove(i);
                            removed = true;
                            System.out.println("Student Deleted!");
                            break;
                        }
                    }
                    if (!removed) {
                        System.out.println("Student not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    name = sc.nextLine();

                    boolean found = false;
                    for (Student s : list) {
                        if (s.get_name().equalsIgnoreCase(name)) {
                            System.out.println("Student Found:");
                            s.print_student();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found!");
                    }
                    break;

                case 4:
                    if (list.isEmpty()) {
                        System.out.println("List is empty.");
                    } else {
                        System.out.println("\nStudent List:");
                        for (Student s : list) {
                            s.print_student();
                        }
                    }
                    break;

                case 0:
                    System.out.println("Exiting... Code by RishiD");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);
    }
}

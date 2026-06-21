
import java.util.Scanner;
import java.util.LinkedList;

public class Polynomial_Addition {

    static class Polynomial {

        int power;
        float coeff;

        Polynomial(int power, float coeff) {
            this.power = power;
            this.coeff = coeff;
        }

        @Override
        public String toString() {
            return coeff + "X^" + power;
        }
    }

    static LinkedList<Polynomial> create_polynomial(int max_power) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Polynomial> list = new LinkedList<>();

        for (int p = max_power; p >= 0; p--) {
            System.out.print("For power " + p + " coefficient: ");
            float co = sc.nextFloat();

            if (co != 0.0) {
                list.add(new Polynomial(p, co));
            }
        }
        return list;
    }

    static void print_polynomial(LinkedList<Polynomial> list) {
        if (list.isEmpty()) {
            System.out.println("Polynomial is empty.");
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));

            if (i != list.size() - 1) {
                System.out.print(" + ");
            }
        }
        System.out.println();
    }

    // Method to add two polynomials
    static LinkedList<Polynomial> add_polynomials(LinkedList<Polynomial> poly1, LinkedList<Polynomial> poly2) {
        LinkedList<Polynomial> result = new LinkedList<>();
        int i = 0, j = 0;  // i for poly1 and j for poly2

        while (i < poly1.size() && j < poly2.size()) {
            Polynomial p1 = poly1.get(i);
            Polynomial p2 = poly2.get(j);

            if (p1.power == p2.power) {
                float coeff_sum = p1.coeff + p2.coeff;
                if (coeff_sum != 0.0) {
                    result.add(new Polynomial(p1.power, coeff_sum));
                }
                i++;
                j++;
            } else if (p1.power > p2.power) {
                result.add(new Polynomial(p1.power, p1.coeff));
                i++;
            } else {
                result.add(new Polynomial(p2.power, p2.coeff));
                j++;
            }
        }

        // Add remaining terms from poly1
        while (i < poly1.size()) {
            Polynomial p1 = poly1.get(i);
            result.add(new Polynomial(p1.power, p1.coeff));
            i++;
        }

        // Add remaining terms from poly2
        while (j < poly2.size()) {
            Polynomial p2 = poly2.get(j);
            result.add(new Polynomial(p2.power, p2.coeff));
            j++;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Highest power for Polynomial 1: ");
        int power1 = sc.nextInt();
        LinkedList<Polynomial> polynomial_list_1 = create_polynomial(power1);

        System.out.print("\nEnter Highest power for Polynomial 2: ");
        int power2 = sc.nextInt();
        LinkedList<Polynomial> polynomial_list_2 = create_polynomial(power2);

        System.out.println("\nPolynomial 1:");
        print_polynomial(polynomial_list_1);

        System.out.println("\nPolynomial 2:");
        print_polynomial(polynomial_list_2);

        System.out.println("\nSum of Polynomials:");
        LinkedList<Polynomial> sum = add_polynomials(polynomial_list_1, polynomial_list_2);
        print_polynomial(sum);
    }
}

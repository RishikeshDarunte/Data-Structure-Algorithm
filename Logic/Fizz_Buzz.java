// This program is a simple implementation of the Fizz Buzz game. It takes an integer input from the user and checks if it is divisible by 3, 5, or both. If the number is divisible by both 3 and 5, it prints "FizzBuzz". If it is only divisible by 3, it prints "Fizz". If it is only divisible by 5, it prints "Buzz". If it is not divisible by either, it prints the number itself.

import java.util.Scanner;

class Fizz_Buzz {

    int function (){
        System.out.println("Enter The Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (num % 3 == 0) {
            System.out.println("Fizz");
        } else if (num % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
     
    }
}

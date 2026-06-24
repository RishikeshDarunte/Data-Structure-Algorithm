
import java.util.Scanner;

class PrimeOrNot{
    public static void main(String[] args) {
        System.out.println("Enter Number to check prime or Not");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = true;
        if(num <=1){
            isPrime = false;
        }else{
            for (int i =2;
            i % num !=0;i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println("The given number is :" + isPrime);
    }
}

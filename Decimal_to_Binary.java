
import java.util.Scanner;
import java.util.Stack;

public class Decimal_to_Binary
{
    static int to_binary(int dec_number)
    {
        Stack<Integer> stack=new Stack<>();
        //2
        while(dec_number!=0)
        {
            stack.push(dec_number%2);
            dec_number=dec_number/2;
        }
        //3
        int bin_number=0;
        while(!stack.isEmpty())
        {
           bin_number=bin_number*10+ stack.pop();
        }
        return (bin_number);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Dec_number;
        //1
        System.out.println("Enter number:");
        Dec_number=sc.nextInt();
        System.out.print("Binary is:"+to_binary(Dec_number));

    }
}

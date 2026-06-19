import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinarytoDecimal
{
    static int to_dec(String bin)
    {
        Queue<Character> q = new LinkedList<>();

        // Insert binary digits into queue
        for(char bit : bin.toCharArray())
        {
            q.offer(bit);
        }

        System.out.println("\nQueue has: " + q);

        int dec = 0;

        // Process queue
        while(!q.isEmpty())
        {
            char bit = q.poll();
            dec = dec * 2 + (bit - '0');
        }

        return dec;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Binary Number: ");
        String bin = sc.next();

        int dec = to_dec(bin);

        System.out.println("Decimal Number: " + dec);

        sc.close();
    }
}
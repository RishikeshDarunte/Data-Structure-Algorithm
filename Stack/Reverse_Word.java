// Reverse a word using stack "FUNCTIONAL CODING"
import java.util.Scanner;
import java.util.Stack;
public class Reverse_Word
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word,rword="";
        //1
        System.out.println("Enter word:");
        word=sc.next();
        Stack<Character> stack=new Stack<>();
        //2
        for(char c: word.toCharArray())
        {
            stack.push(c);
        }
        //3
        while(!stack.isEmpty())
        {
            rword=rword+stack.pop();
        }

        //4
        System.out.print("\nReverse word is:"+rword);
    }
}

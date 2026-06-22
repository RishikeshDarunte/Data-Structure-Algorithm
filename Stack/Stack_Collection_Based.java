import java.util.Scanner;
import java.util.Stack;//In collection
public class Stack_Collection_Based
{
    public static void main(String[] args)
    {

        Stack<Integer> obj=new Stack<>();
                Scanner sc=new Scanner(System.in);

        int choice=0,e;

        do
        {
            System.out.print("\nStack Menu");
            System.out.print("\n-----------");
            System.out.print("\n1.Push");
            System.out.print("\n2.Pop");
            System.out.print("\n3.Peek");
            System.out.print("\n4.Print");
            System.out.print("\n0.Exit");
            System.out.print("\n:");
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                        System.out.print("\nEnter element to push:");
                        e=sc.nextInt();
                        obj.push(e);//obj.push(sc.nextInt());
                        break;
                case 2:
                      if(!obj.isEmpty())//if not empty
                    {
                        System.out.print("\nElement poped:"+obj.pop());
                    }
                    else
                    {
                        System.out.print("\nStack Empty");
                    }
                    break;
                case 3:
                    if(!obj.isEmpty())//if not empty
                    {
                        System.out.print("\nElement @ Peek:"+obj.peek());
                    }
                    else
                    {
                        System.out.print("\nStack Empty");
                    }
                    break;
                case 4:
                    if(!obj.isEmpty())//if not empty
                    {
                        System.out.print("\nElements on Stack. \n");
                        for(int index=obj.size()-1;index>=0;index--)
                        {
                            System.out.print(obj.get(index)+"\n1");
                        }
                    }
                    else
                    {
                        System.out.print("\nStack Empty");
                    }
                    break;
                case 0:
                    System.out.print("\nExiting code .. coded by amar.career");
                    break;
                default:
                    System.out.print("\nInvalid option selected.");
                    break;
            }
        }while(choice!=0);//Not zero, continue.
    }
}

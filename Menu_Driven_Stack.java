
public class Menu_Driven_Stack
{
    private int tos,Maxsize,stack[];

    void create_stack(int size)
    {
        tos=-1;
        Maxsize=size;
        stack=new int[Maxsize];
    }
    //push(e):Increment tos by one and accept element.
    void push(int e)
    {
        tos++;
        stack[tos]=e;
        //stack[++tos]=e;
    }

    boolean is_full()
    {
        if(tos==Maxsize-1)
            return true;
        else
            return false;
        //return(tos==Maxsize-1)
    }
    //pop():remove and return elelement at tos
    int pop()
    {
        int temp=stack[tos];
        tos--;
        return (temp);
        //return(stack[tos--]);
    }
    boolean is_empty()
    {
        if(tos==-1)
            return true;
        else
            return false;
        //return(tos==-1)
    }
    //peek():only return element at tos
    int peek()
    {
       return(stack[tos]);
    }
    void print_stack()//print in LIFO->tos to 0
    {
        for(int i=tos;i>=0;i--)//countdown
        {
            System.out.print("\n"+stack[i]);
        }
    }

    // public static void main(String[] args)
    // {
    //     Scanner sc=new Scanner(System.in);
    //     Menu_Driven_Stack obj=new Menu_Driven_Stack();
    //     System.out.print("\nEnter size of stack:");
    //     int size=sc.nextInt();
    //     int choice=0,e;
    //     obj.create_stack(size);
    //     do
    //     {
    //         System.out.print("\nStack Menu");
    //         System.out.print("\n-----------");
    //         System.out.print("\n1.Push");
    //         System.out.print("\n2.Pop");
    //         System.out.print("\n3.Peek");
    //         System.out.print("\n4.Print");
    //         System.out.print("\n0.Exit");
    //         System.out.print("\n:");
    //         choice=sc.nextInt();

    //         switch (choice)
    //         {
    //             case 1:
    //                 if(!obj.is_full())//if not full
    //                 {
    //                     System.out.print("\nEnter element to push:");
    //                     e=sc.nextInt();
    //                     obj.push(e);//obj.push(sc.nextInt());
    //                 }
    //                 else
    //                 {
    //                     System.out.print("\nStack Full");
    //                 }
    //                 break;
    //             case 2:
    //                 if(!obj.is_empty())//if not empty
    //                 {
    //                     System.out.print("\nElement poped:"+obj.pop());
    //                 }
    //                 else
    //                 {
    //                     System.out.print("\nStack Empty");
    //                 }
    //                 break;
    //             case 3:
    //                 if(!obj.is_empty())//if not empty
    //                 {
    //                     System.out.print("\nElement @ Peek:"+obj.peek());
    //                 }
    //                 else
    //                 {
    //                     System.out.print("\nStack Empty");
    //                 }
    //                 break;
    //             case 4:
    //                 if(!obj.is_empty())//if not empty
    //                 {
    //                     System.out.print("\nElements on Stack. \n");
    //                     obj.print_stack();
    //                 }
    //                 else
    //                 {
    //                     System.out.print("\nStack Empty");
    //                 }
    //                 break;
    //             case 0:
    //                 System.out.print("\nExiting code .. coded by rishi");
    //                 break;
    //             default:
    //                 System.out.print("\nInvalid option selected.");
    //                 break;
    //         }
    //     }while(choice!=0);//Not zero, continue.
    // }

    public static void main(String[] args) {
        Menu_Driven_Stack obj = new Menu_Driven_Stack();
        
        // 1. Create a stack of size 3
        obj.create_stack(3);

        // 2. Add (Push) elements
        obj.push(10);
        obj.push(20);
        obj.push(30);

        // 3. Print the stack elements
        System.out.println("Stack elements:");
        obj.print_stack();
        System.out.println();

        // 4. Call peek to see the top element
        System.out.println("\nTop element (Peek): " + obj.peek());

        // 5. Call pop to remove elements
        System.out.println("\nPopped element: " + obj.pop());
        System.out.println("Popped element: " + obj.pop());

        // 6. Print the remaining stack
        System.out.println("\nStack after pops:");
        obj.print_stack();
        System.out.println();
    }
}


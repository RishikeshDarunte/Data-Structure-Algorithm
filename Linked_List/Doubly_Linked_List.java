
class Dnode {

    int data;
    Dnode left, right;

    Dnode(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Doubly_Linked_List {

    Dnode root;//create root

    void insert_left(int data) {
        Dnode n = new Dnode(data);//create a node
        if (root == null)//only 1st time
        {
            root = n;
        } else {
            n.right = root;
            root.left = n;//1,2
            root = n;//3
        }
    }

    void delete_left() {
        if (root == null) {
            System.out.print("\nEmpty List");
        } else {
            Dnode t = root;//1
            if (root.left == null && root.right == null) {
                root = null;
            } else {
                root = root.right;//2
                root.left = null;//3
            }
            System.out.print("\n<-|" + t.data + "|-> deleted");

        }
    }

    void insert_right(int data) {
        Dnode n = new Dnode(data);//create a node
        if (root == null)//only 1st time
        {
            root = n;
        } else {
            Dnode t = root;//1 start from root
            while (t.right != null)//2 move to right most
            {
                t = t.right;
            }
            t.right = n;//3 connected
            n.left = t;//4
        }
    }

    void delete_right() {
        if (root == null) {
            System.out.print("\nEmpty List");
        } else {
            Dnode t, t2;
            t = root;//1
            if (root.right == null)//single node
            {
                root = null;//manual deletion
            } else {
                while (t.right != null)//2
                {
                    t = t.right;
                }
                t2 = t.left;//3 ref to pref who is on left
                t2.right = null;//4
                //(t.left).right=null;
            }
            System.out.print("\n|" + t.data + "|-> deleted");
        }
    }

    void print_list() {
        if (root == null) {
            System.out.print("\nList Empty");
        } else {
            Dnode t = root;
            System.out.print("NULL");
            while (t != null) {
                System.out.print("<-|" + t.data + "|->");
                t = t.right;
            }
            System.out.print("NULL");
        }
    }

    void print_list_rev()//print from last to first
    {
        if (root == null) {
            System.out.print("\nList Empty");
        } else {
            Dnode t = root;
            System.out.print("NULL");
            //only go to last and stop
            //loop
            //from last to first print
            //loop2
            while (t != null)//loop2
            {
                System.out.print("<-|" + t.data + "|->");
                t = t.left;
            }
            System.out.print("NULL");
        }
    }
}

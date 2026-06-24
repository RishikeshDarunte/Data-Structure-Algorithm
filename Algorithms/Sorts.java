
import java.util.Arrays;
import java.util.Scanner;

public class Sorts {

    public static void main(String[] args) {
        int a[] = {33, 11, 99, 88, 55, 66, 77, 22, 44};

        System.out.println("Initially "
                + "Array is:" + Arrays.toString(a));
        // call
        // bubble_sort(a);
        // selection_sort(a);
        // insertion_sort(a);
        // quick_sort1(a, 0, a.length - 1);
        // quick_sort2(a, 0, a.length - 1);
        merge_sort(a, 0, a.length - 1);

        System.out.println("After Sort Array is:" + Arrays.toString(a));

        // binary search
        // binary searching only works on the sorted array
        Sorts s = new Sorts();
        System.out.println("Enter element for Searching: ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int index = s.binary_search(a, 0, a.length - 1, key);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

    }

    //Bubble Sort
    static void bubble_sort(int a[]) {
        int i, j, temp;
        for (i = a.length - 1; i > 0; i--)//gives n-1 passes
        {
            for (j = 0; j < i; j++)//j stops at second last j+1 last
            {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    // Selection sort
    static void selection_sort(int a[]) {
        int i, j, min_element, position;
        for (i = 0; i < a.length - 1; i++)//gives n-1 passes
        {
            min_element = a[i];
            position = i;
            for (j = i + 1; j < a.length; j++)//j goes to end
            {
                if (a[j] < min_element) {
                    min_element = a[j];
                    position = j;
                }
            }//j
            //SWAP I TH WITH MIN
            a[position] = a[i];
            a[i] = min_element;
        }
    }

// moving pivote from start to end and partitioning the array into two parts
    static void quick_sort1(int a[], int start, int end) {
        int i, j, pivot;
        i = start;
        j = end;
        pivot = start;
        while (i < j) {
            while (a[j] > a[pivot]) {
                j--;
            }
            if (i < j)//swap
            {
                int temp = a[pivot];
                a[pivot] = a[j];
                a[j] = temp;
            }
            if (i < end) {
                quick_sort1(a, start + 1, end);
            }
        }
    }

//moving pivote from end to start and partitioning the array into two parts
    static void quick_sort2(int a[], int start, int end) {
        int i, j, pivot;
        i = start;
        j = end;
        pivot = end;
        while (i < j) {
            while (a[i] < a[pivot]) {
                i++;
            }
            if (i < j)//swap
            {
                int temp = a[pivot];
                a[pivot] = a[i];
                a[i] = temp;
            }
            if (j > start) {
                quick_sort2(a, start, end - 1);
            }
        }
    }

// merge sort
    static void merge_sort(int a[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            merge_sort(a, start, mid);
            merge_sort(a, mid + 1, end);
            merger(a, start, mid, end);
        }
    }

    static void merger(int a[], int start, int mid, int end) {
        int i, j;
        int temp[] = new int[a.length];
        int t_index = start;
        //set
        i = start;
        j = mid + 1;
        t_index = start;
        while (i <= mid && j <= end) {
            if (a[i] < a[j]) {
                temp[t_index++] = a[i++];
            } else {
                temp[t_index++] = a[j++];
            }
        }
        while (i <= mid) {
            temp[t_index++] = a[i++];
        }
        while (j <= end) {
            temp[t_index++] = a[j++];
        }
        for (i = start; i <= end; i++)//copy back to a
        {
            a[i] = temp[i];
        }
    }

    int binary_search(int a[], int start, int end, int key) {
        if (start <= end) {
            int mid = (start + end) / 2;
            if (a[mid] == key) {
                return mid;//found
            } else {
                if (key < a[mid]) {
                    return binary_search(a, start, mid - 1, key);
                } else {
                    return binary_search(a, mid + 1, end, key);
                }
            }
        } else {
            return -1;
        }
    }

}

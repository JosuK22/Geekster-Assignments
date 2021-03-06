
import java.util.*;

public class QuickSort {
    
    int partition(int arr[], int l, int h) {
        
        int pivot = arr[h];
        int i = (l - 1);
        for (int j = l; j < h; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[h];
        arr[h] = temp;
        return i + 1;
    }

    void sort(int arr[], int l, int h) {
        if (l < h) {
            int pi = partition(arr, l, h);
            sort(arr, l, pi - 1);
            sort(arr, pi + 1, h);
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Array elements : ");
        for (int i = 0; i < n; i++) {
            
            arr[i] = sc.nextInt();
        }
        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n - 1);
        System.out.println("sorted array");
        printArray(arr);
        sc.close();
    }
}
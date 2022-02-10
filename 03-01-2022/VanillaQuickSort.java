
import java.util.*;

public class VanillaQuickSort {
    
    public static int[] quickSort(int[] arr, int Keys) {
        
        if (Keys < 2) {
            return arr;
        }

        int position = 0;
        int temp;

        for (int i = 1; i < Keys; i++) {
            
            if (arr[i] <= arr[0]) {
                
                position++;
                temp = arr[i];
                arr[i] = arr[position];
                arr[position] = temp;

            }
        }

        temp = arr[0];
        arr[0] = arr[position];
        arr[position] = temp;

        int[] left = quickSort(arr, position);

        int[] arr2 = Arrays.copyOfRange(arr, position + 1, Keys);

        int[] right = quickSort(arr2, Keys - position - 1);
        int[] arr3 = new int[Keys];
        for (int i = 0; i < position; i++) {
            
            arr3[i] = left[i];
        }
        arr3[position] = arr[position];
        for (int i = position + 1; i < Keys; i++) {
            
            arr3[i] = right[i - position - 1];
        }

        return arr3;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array Elements one after one :");

        for (int i = 0; i < n; i++) {
            
            arr[i] = sc.nextInt();
        }
        arr = quickSort(arr, n);

        for (int i = 0; i < n; i++) {
            
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        sc.close();
    }

}
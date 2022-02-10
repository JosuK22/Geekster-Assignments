
import java.util.*;

public class BinarySearchRecursion {
    
    int Search(int arr[], int l, int r, int target) {
        
        if (r >= l && l <= arr.length - 1) {
            
            int mid = l + (r - l) / 2;
            if (arr[mid] == target){
                
                return mid;
                
            }
            if (arr[mid] > target){
                
                return Search(arr, l, mid - 1, target);
                
            }
            return Search(arr, mid + 1, r, target);
        }
        return -1;
    }

    public static void main(String args[]) {
        
        BinarySearchRecursion ob = new BinarySearchRecursion();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.print("Enter the Array elements : ");
        for (int i = 0; i < n; i++) {
            
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the element to be searched : ");
        int k = sc.nextInt();
        int result = ob.Search(arr, 0, n - 1, k);
        
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
        sc.close();
    }
}

import java.util.*;

public class AverageOfArray {
    
    static double avgArr(int A[], int i, int n) {
        
        if (i == n - 1){
            
            return A[i];
        }
        if (i == 0){
            
            return ((A[i] + avgArr(A, i + 1, n)) / n);
    
        }
        return (A[i] + avgArr(A, i + 1, n));
    }

    static double arrayAverage(int A[], int n) {
        
        return avgArr(A, 0, n);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.print("Enter the Array elements : ");
        for (int i = 0; i < n; i++) {
            
            arr[i] = sc.nextInt();
        }
        System.out.println(arrayAverage(arr, n));
        sc.close();
    }
}
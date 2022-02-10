
import java.util.*;

public class StringSortRecursion {
    
    static void sortString(String str) {
        
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.print(String.valueOf(arr));
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String s = sc.nextLine();
        
        sortString(s);
        sc.close();
    }
}
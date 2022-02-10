
import java.util.*;

public class PalindromeRecursion{
    
    public static int checkPalindrome(char[] s, int start, int end) {
        
        if (start == end || (end - start == 1)) {
            return 1;
        } 
        else {
            
            if (s[start] == s[end]) {
                
                return checkPalindrome(s, start + 1, end - 1);
                
            } 
            else {
                
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String :");
        String s = sc.next();
        
        char a[] = s.toCharArray();
        int n = s.length();
        
        if (checkPalindrome(a, 0, n - 1) == 1) {
            
            System.out.println("String"+" "+ s +" "+"is Palindrome");
        } 
        else {
            System.out.println("String"+" "+ s +" "+"is not Palindrome");
        }
        sc.close();
    }
}


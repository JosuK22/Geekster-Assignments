import java.util.Scanner;

public class ReverseNumberRecursion {
    
    public static void NumReverse(int num) {
        
        if (num < 10) {
            
            System.out.println(num);
            return;
            
        } 
        else {
            
            System.out.print(num % 10);
            NumReverse(num / 10);
        }
    }

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to reverse :");
        int num = sc.nextInt();
        
        System.out.print("Reversed Number: ");
        NumReverse(num);
        sc.close();
    }
}
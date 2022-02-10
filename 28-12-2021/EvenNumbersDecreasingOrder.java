
import java.util.*;

public class EvenNumbersDecreasingOrder {
    
    static int evenNumbers(int num2, int num1) {
        
        if (num1 > num2)
            return 0;
        System.out.print(num2 + " ");
        return evenNumbers(num2 - 2, num1);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num1 = 2, num2;
        System.out.print("Enter your Limit:");
        
        num2 = sc.nextInt();
        System.out.print("All Even number given range are:");
        evenNumbers(num2, num1);
        sc.close();
    }
}

		



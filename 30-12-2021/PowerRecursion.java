import java.util.Scanner;

public class PowerRecursion {
    
    public static int power(int num, int Power) {
        if (Power != 0) {
            
            return (num * power(num, Power - 1));
            
        } 
        else {
            
            return 1;
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();
        
        System.out.println("Enter the Power :");
        int Power = sc.nextInt();
        
        int result = power(num, Power);
        System.out.println(num + "^" + Power + "=" + result);
        sc.close();
    }

    
}
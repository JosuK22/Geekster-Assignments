import java.util.Scanner;

public class GCD {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second Number :");
        int num2 = sc.nextInt();
        int tem = gcd(num1, num2);

        System.out.printf("G.C.D of"+" "+num1+" "+"and"+" "+num2+" "+"is"+" "+tem );
        sc.close();
    }

    public static int gcd(int num1, int num2) {
        if (num2 != 0)
            return gcd(num2, num1 % num2);
        else
            return num1;
    }
}
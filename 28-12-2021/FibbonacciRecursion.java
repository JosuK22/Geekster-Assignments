
import java.util.*;

public class FibbonacciRecursion{
    
   static int temp1 = 0, temp2 = 1, temp3 = 0;
   
   static void fibbonacci(int count){
       
      if (count > 0) {
          
         temp3 = temp1 + temp2;
         temp1 = temp2;
         temp2 = temp3;
         System.out.print(" " + temp3);
         fibbonacci(count - 1);
      }
   }
   public static void main(String args[]) {
       
      int count = 10;
      System.out.print("[");
      System.out.print(temp3 + " " + temp3);
      
      fibbonacci(count - 2);
      System.out.print("]");
   }
   
}

		



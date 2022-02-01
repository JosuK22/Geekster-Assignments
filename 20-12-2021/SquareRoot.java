package assignments;

import java.util.Scanner;

public class SquareRoot {
	
	static int getSquareRoot(int num) {
		 
		if(num<2) return num;
	        int start =0,end = num;
	        while(start<end){
	            int mid = start + (end - start)/2;
	            int mul = num/mid; 
	            if(mul==mid) return mid; 
	            if(mul<mid){
	                end = mid;
	            }else{
	                start = mid+1;
	            }
	        }
	        return start-1;

   }
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		System.out.print("Square Root of"+" "+num+" "+ "is :");
		System.out.println(	getSquareRoot(num));
		

	}

}

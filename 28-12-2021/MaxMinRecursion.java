
import java.util.*;

public class MaxMinRecursion{
	
	
	public static int MaxElement(int arr[], int n){
	    
	if(n == 1)
		return arr[0];
		
		return Math.max(arr[n-1], MaxElement(arr, n-1));
	}
    
    public static int MinElement(int arr[], int n){
	
	if(n == 1)
		return arr[0];
		
		return Math.min(arr[n-1], MinElement(arr, n-1));
	}
	
	public static void main(String args[])
	{
		int arr[] = {1, -1, 0, 2, -2, 3, -3, 4,-4};
		int n = arr.length;
		
		
		System.out.println("Maximum Element Of the given Array is :"+MaxElement(arr, n));
		System.out.println("Minimum Element of the given Array is :"+MinElement(arr, n));
	}
}


		



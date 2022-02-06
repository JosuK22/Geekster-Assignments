/*1. Create and print elements in matrix
2. Print spiral in matrix
3. Print wave in matrix*/

import java.util.*;

public class MatrixPrints{
	static int R;
	static int C;

	static void SpiralMatrix(int arr[][], int i, int j, int m,int n){
	
		if (i >= m || j >= n) {
			return;
		}

		for (int p = i; p < n; p++) {
			System.out.print(arr[i][p] + "  ");
		}

		for (int p = i + 1; p < m; p++) {
			System.out.print(arr[p][n - 1] + "  ");
		}

		if ((m - 1) != i) {
			for (int p = n - 2; p >= j; p--) {
				System.out.print(arr[m - 1][p] + "  ");
			}
		}

		if ((n - 1) != j) {
			for (int p = m - 2; p > i; p--) {
				System.out.print(arr[p][j] + "  ");
			}
		}
		SpiralMatrix(arr, i + 1, j + 1, m - 1, n - 1);
	}
	 public static void WavePrint(int m, int n, int[][] arr){
     
    
        for (int j = 0; j < n; j++) {
 
      
            if (j % 2 == 0) {
                for (int i = 0; i < m; i++) {
                    System.out.print(arr[i][j] + "  ");
                }
            }
 
      
            else {
                for (int i = m - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + "  ");
                }
            }
        }
  }

	public static void main(String[] args){
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Number of Rows:");
	    R = sc.nextInt();
	    System.out.println("Enter the number of Columns:");
        C = sc.nextInt();
        int row = 0;
        
        int a[][] = new int[R][C];
        System.out.println("Enter the Elements:");
        for (int i = 0; i < R; i++) 
            {
                for (int j = 0; j < C; j++) 
                {
                    a[i][j] = sc.nextInt();
                }
            }
        System.out.println("( [1].Print Matrix, [2].Print Spiral of Matrix, [3].Print Wave Matrix )");
        
        System.out.print("Enter The choice Number :");
        int choice = sc.nextInt();
        switch(choice){
            
            //print Matrix
            case 1:
                for (int i = 0; i < R; i++) {
                    
                    for (int j = 0; j < C; j++){
                        if(a[i][j]>9){
                            System.out.print(a[i][j] + " ");
                        }
                        else{
                            System.out.print(a[i][j] + "  ");
                        }
                    }
                    System.out.println();
            }
                break;
            
            //spiral in matrix    
            case 2:
                System.out.println("Given Matrix :");
                for (int i = 0; i < R; i++) {
                    
                    for (int j = 0; j < C; j++){
                        
                        if(a[i][j]>9){
                            System.out.print(a[i][j] + " ");
                        }
                        else{
                            System.out.print(a[i][j] + "  ");
                        }
                    }
                    System.out.println();
                }
                System.out.println();
                System.out.println("Spiral print of Matrix:");
                
                SpiralMatrix(a, 0, 0, R, C);
                break;
            
            //wave in Matrix    
            case 3:
                System.out.println("Given Matrix :");
                    
                    for (int i = 0; i < R; i++) {
                    
                        for (int j = 0; j < C; j++){
                        
                            if(a[i][j]>9){
                                System.out.print(a[i][j] + " ");
                            }
                            else{
                                System.out.print(a[i][j] + "  ");
                            }
                        }
                        System.out.println();
                    }
                    
                System.out.println();
                
                System.out.println("Wave Print of Matrix:");
                WavePrint(R, C, a);
                break;
                
            default:
                System.out.println("Invalid choice number");
        }
		
	}
}



package lab01;
// Exercises 6.6: twoMatricesSameSize.java

import java.util.Scanner;
public class twoMatricesSameSize {
	public static void main(String args[]){	int m, n, c, d;	Scanner input = new Scanner(System.in);
	 	System.out.println("Input number of rows of matrix");	m = input.nextInt();	System.out.println("Input number of columns of matrix");	n  = input.nextInt();
	 
	int array1[][] = new int[m][n];
	int array2[][] = new int[m][n];
	int sum[][] = new int[m][n];
	 
	System.out.println("Input elements of first matrix");
	 
	for (c = 0 ; c < m ; c++ )
		for (d = 0 ; d < n ; d++ )
	  		array1[c][d] = input.nextInt();
	 
	System.out.println("Input the elements of second matrix");
	 
	for (c = 0 ; c < m ; c++ )
	  	for (d = 0 ; d < n ; d++ )
	     	array2[c][d] = input.nextInt();
	 
	for (c = 0 ; c < m ; c++ )
	  	for (d = 0 ; d < n ; d++ )
	      	sum[c][d] = array1[c][d] + array2[c][d]; 
	 
	System.out.println("Sum of the matrices:-");
	 
	for (c = 0 ; c < m ; c++ ){
		for (d = 0 ; d < n ; d++ )
	  		System.out.print(sum[c][d]+"\t");
			System.out.println();
      }
   }
}

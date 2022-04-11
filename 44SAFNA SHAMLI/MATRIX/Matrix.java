package matrix;

import java.util.Scanner;
public class Matrix {

	public static void main(String[] args) {
		 
		int p,q,m,n;
		Scanner s = new Scanner (System.in);
		System.out.print("Enter number of rows in Matrix A:");
		p = s.nextInt();
		System.out.print("Enter number of columns in Matrix A:");
		q = s.nextInt();
		System.out.print("Enter number of rows in Matrix B:");
		m = s.nextInt();
		System.out.print("Enter the number of columns in Matrix B");
		n=s.nextInt();
		
		if ( p == m && q==n){
			
		int a[][] = new int[p][q] ;	
		int b[][] = new int[m][n] ;	
		
		System.out.print("Enter the Elements of Matrix A:");
		for ( int i = 0 ; i < p ; i++ )
			for ( int j = 0 ; j < q ; j++)
				a[i][j] = s.nextInt();
		
		System.out.print("Enter the Elements of Matrix B:");
		for ( int i = 0 ; i < p ; i++ )
			for ( int j = 0 ; j < q ; j++)
				b[i][j] = s.nextInt();
		
		System.out.print(" Matrix A:");
		for ( int i = 0 ; i < p ; i++ ){
			for ( int j = 0 ; j < q ; j++)
				System.out.print(a[i][j] + " ");
		    System.out.println() ;}
				
		System.out.print(" Matrix B:");
		for ( int i = 0 ; i < p ; i++ ){
			for ( int j = 0 ; j < q ; j++)
				System.out.print( b[i][j] + " ");
		    System.out.println() ;}
	
       System.out.print("The sum of matrix is:");
       for ( int i=0 ; i < m ; i++){
    	   for ( int j= 0 ; j < n ; j++)
                  System.out.print(a[i][j]+b[i][j] + " ");
    	   System.out.println();}
	}
	
		    else{
		System.out.print("these matrices cannot be added");}
                  
		}
	}

	



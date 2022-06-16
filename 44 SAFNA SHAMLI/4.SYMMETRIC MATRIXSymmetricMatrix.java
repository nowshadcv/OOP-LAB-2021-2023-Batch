import java.util.Scanner ;
public class SymmetricMatrix {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Ente the number of rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter number of columns: ");
		int cols=sc.nextInt();
		int matrix[][] = new int[rows][cols];
		System.out.println("Enter the elements of the matrix");
		for (int i = 0 ; i< rows ; i++){
			for (int j = 0 ; j < cols ; j++)
	               matrix[i][j] = sc.nextInt();
	    sc.close();
	    System.out.println("The given matrix is :");
	    for ( int i1 = 0; i1<rows; i1++){
	    	for(int j =0; j<cols ; j++)
	    		System.out.println(matrix[i1][j] + "\t");
	    	System.out.println() ;}
	    if (rows != cols)
	    	System.out.println("The given matrix is not square matrix");
	    else {
	    	boolean symmetric = true;
	    	for ( int i1 = 0 ; i1<rows ; i1++)
	    		for ( int j = 0; j < cols ; j++)
	    	if (matrix[i1][j] != matrix[j][i1])
	    	{
	    		symmetric = false ; break ;
	    	}
	    	if (symmetric)
	    		System.out.println("The given marix is symmetric");
	    	else
	    		System.out.println("The given matrix is not a symmetric matrix ");
	    
	    	}
	    }
	    }
		
		

	}



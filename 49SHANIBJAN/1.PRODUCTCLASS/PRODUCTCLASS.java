import java.util.Scanner;


public class Addition {
	

	public static void main(String[] args) {
		int p,q,m,n;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter matrix A row number : ");
		p=s.nextInt();
		System.out.print("Enter matrix A column number : ");
		q=s.nextInt();
		System.out.print("Enter matrix B row number : ");
		m=s.nextInt();
		System.out.print("Enter matrix B column number : ");
		n=s.nextInt();
		
		if (p==m && q == n){
			
			int a[][] =new int[p][q];
			int b[][]=new int[m][n];
			
			System.out.println("enter elements of matrix A");
			for(int i=0;i<p;i++)
				for(int j=0;j<q;j++)
					a[i][j]=s.nextInt();
			System.out.println("enter elements of matrix B");
			for(int i=0;i<m;i++)
				for(int j=0;j<n;j++)
					b[i][j]=s.nextInt();
			
			System.out.println(" matrix A");
			for(int i=0;i<p;i++)
				for(int j=0;j<q;j++)
					System.out.println(a[i][j]+ " ");
			System.out.println();
			
			System.out.println(" matrix B");
			for(int i=0;i<m;i++)
				for(int j=0;j<n;j++)
					System.out.println(b[i][j]+ " ");
			System.out.println();
			
			System.out.println(" Sum matrix: ");
			for(int i=0;i<m;i++)
				for(int j=0;j<n;j++)
					System.out.println(a[i][j]+b[i][j]+ " ");
			System.out.println();
			
		}
		else{
			System.out.println("These matrices cannot be added");
		}
		
		
	}

}









package project;

public class cars{
public static void main(String[] args){
Product p1 = new Product();
p1.pcode = "Car123";
p1.pname = "Benz";
p1.price = 10000;
System.out.println("Displaying p1:");
p1.display();
Product p2 = new Product("Jaguar" , "Car426" , 25000 );
System.out.println("Displaying p2: " );
p2.display() ;
Product p3 = new Product ("Maruthi", "Car800", 50000 );
System.out.println( "Displaying p3: ");
p3.display( ) ;
Product p = p3.getPrice()<(p1.price<p2.price?p1.price:p2.price)?p3

: (p1.price<p2.price?p1:p2);

System.out.println("\nDisplaying product with lowest price:" );
p.display();
}}
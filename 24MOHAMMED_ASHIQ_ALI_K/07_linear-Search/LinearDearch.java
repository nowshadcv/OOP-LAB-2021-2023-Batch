import java.util.Scanner;

public class LinearDearch {
	public static void main( String [] args)
	{
		int n,i,arr[],search,found=0;
		Scanner sc =  new Scanner(System.in);
		System.out.println("\n enter how many elements in your array\n");
		n = sc.nextInt();
		arr= new int [n];
		System.out.println("\nenter the elements to the array\n");
		for(i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(i=0;i<n;i++)
			System.out.print(arr[i]);
		System.out.println("\nenter the elements to search\n");
		search = sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(arr[i] == search)
			{
				System.out.println("item found at" +(i+1+"location"));
				found=1;
			}
		}
		if(found==0)
		{
			System.out.println("item not found");
		}
		
	}
}

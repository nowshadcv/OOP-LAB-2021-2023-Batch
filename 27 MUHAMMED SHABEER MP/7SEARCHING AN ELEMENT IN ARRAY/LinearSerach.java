
package searchanelement;
import java.util.Scanner;

public class LinearSerach {
public static void main(String[] args)
{
	int c,n,serach,array[];
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of elements");
	n=s.nextInt();
	array=new int[n];
	System.out.println("enter those "+n+"elements");
	for(c=0;c<n;c++)
		array[c]=s.nextInt();
	System.out.println("Enter the value you want find");
	serach=s.nextInt();
	for(c=0;c<n;c++)
		if(array[c]==serach)
		{
			System.out.println(serach+"is present in location :"+(c+1));
			break;
			
		}
	if(c==n)
		System.out.println(serach+"is not present in the array");
}
}

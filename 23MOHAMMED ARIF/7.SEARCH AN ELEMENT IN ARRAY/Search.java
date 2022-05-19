package searchelement;
import java.util.Scanner;


public class Search {

	public static void main(String[] args) {
		int c,n,search,arr[];
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr number of elements");
		n= sc.nextInt();
		arr=new int [n];
		System.out.println("enetr those" + n + "elemnts");
		for(c=0;c<n;c++)
			arr[c]=sc.nextInt();
		System.out.println("enetr the value you want to find");
		search=sc.nextInt();
		for(c=0;c<n;c++)
			if(arr[c]==search){
				System.out.println(search+"it is present location:"+(c+1));
				break;}
			if(c==n)
				System.out.println(search+"is not present");
			}
			

	}



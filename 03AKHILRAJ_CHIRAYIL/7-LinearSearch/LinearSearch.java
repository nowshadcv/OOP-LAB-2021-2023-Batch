import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		int i,n,search,found=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of array");
		n = in.nextInt() ;
		int a[] = new int[n];
		System.out.println("Enter "+n+" array elements");
		for(i=0;i<n;i++){
			a[i] = in.nextInt();
		}
		System.out.println("Enter a element to search");
		search = in.nextInt();
		for(i=0;i<n;i++){
			if(a[i]==search){
				System.out.println(search+" is  found at "+ (i+1) +" position");
				found=1;
				break;
			}
		}
		if(found==0){
			System.out.println("element not found");
		}
			
	}

}


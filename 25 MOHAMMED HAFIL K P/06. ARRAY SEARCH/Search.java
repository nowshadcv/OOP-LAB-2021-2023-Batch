import java.util.*;

public class Search {

	public static void main(String[] args) {
		int i, n, search, array[] = new int[100];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of elements");
		n = in.nextInt();
		System.out.println("Enter those " + n + " elements");
		for (i = 0; i < n; i++)
			array[i] = in.nextInt();
		System.out.println("Enter the value you want to find");
		search = in.nextInt();
		for (i = 0; i < n; i++)
			if (array[i] == search) {
				System.out.println(search + " is present in the location " + (i+1));
				break;
			}
		if (i == n) {
			System.out.println(search + " is not present in the array");
		}
	}

}

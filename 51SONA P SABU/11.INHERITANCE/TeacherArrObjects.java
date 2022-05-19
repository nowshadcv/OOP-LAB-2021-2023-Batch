package inheritance;
import java.util.Scanner;

public class TeacherArrObjects {

	public static void main(String[] args) {
		System.out.println("enter number of Teachers:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter Teacher details one by one .. ");
		Teacher teacher[]=new Teacher[n];
		Scanner scT=new Scanner(System.in);
		int tid;String name;float salary;String address;
		String department;String subject;
		for(int i=0;i<n;i++) {
			System.out.println("enter "+i+"teacher details..");
			System.out.println("enter teacher id(integer):");
			tid=scT.nextInt();
			System.out.println("enter teacher name (String):");
			name=scT.next();
			System.out.println("enter Teacher salary ( float):");
			salary=scT.nextFloat();
			System.out.println("enter Teacher address (String):");
			address=scT.next();
			System.out.println("enter Teacher department (String):");
			department=scT.next();
			System.out.println("enter Teacher subject (String):");
			subject=scT.next();
			Teacher t = new Teacher(tid,name,salary,address,department,subject);
			teacher [i]=t;}
		System.out.println("Teacher are:|n");
		for(Teacher x:teacher) {
			x.display();System.out.println("\n");
			sc.close();
			scT.close();
			
		}

}
}
		
	

		

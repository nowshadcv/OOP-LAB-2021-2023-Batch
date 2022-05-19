package inheritance;

import java.util.Scanner;

public class TeacherArrObject {

	public static void main(String[] args) {
		System.out.println("enter number of teachers");
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		System.out.println("enter teacher details in one by one..");
		Teacher teacher []=new Teacher[n];
		Scanner sct=new Scanner(System.in);
		int tid;String name;float salary;String address;
		String department;
		String subject;
		for(int i=0;i<n;i++){
			System.out.println("enter"+i+"teacher details");
			System.out.println("enter teacher id (int)");
			tid=sct.nextInt();
			System.out.println("enter teacher name (String)");
			name=sct.next();
			System.out.println("enter teacher salary (float)");
			salary=sct.nextFloat();
			System.out.println("enter teacher address (String)");
			address=sct.next();
			System.out.println("enter teacher department (String)");
			department=sct.next();
			System.out.println("enter teacher subject (String)");
			subject=sct.next();
			Teacher t = new Teacher(tid,name,salary,address,department,subject);
			teacher [i]=t;}
		System.out.println("teachers are:\n");
		for(Teacher x : teacher){
			x.display();
			System.out.println("\n");
		}

	}

}

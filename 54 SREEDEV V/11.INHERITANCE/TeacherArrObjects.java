package inheritance;

import java.util.Scanner;

public class TeacherArrObjects {
	public static void main(String[] args) {
		System.out.println("Enter numbers of teachers :");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		System.out.println("Enter Teacher details one by one ...");
		Teacher teacher [ ] = new Teacher [ n ];
		Scanner scT =new Scanner (System.in);
		int tid;String name;float salary;String address;
		String department;String subject;
		for(int i=0;i<n;i++){
			System.out.println(" Enter" + i + "teacher details..");
			System.out.println(" Enter teacher id ( integer ) : ");
			tid = scT.nextInt();
			System.out.println(" Enter teacher name ( String ) :");
			name = scT.next();
			System.out.println(" Enter teacher salary ( float ) :");
			salary = scT.nextFloat();
			System.out.println(" Enter teacher address ( String ) :");
			address = scT.next();
			System.out.println(" Enter teacher department (String) :");
			department = scT.next();
			System.out.println(" Enter teacher subject ( String ) :");
			subject = scT.next();
			Teacher t = new Teacher(tid,name,salary,address,department,subject);
			teacher [ i ] = t;}
		System.out.println( " Teachers are : \n  " );
		for(Teacher x : teacher){
			x.display();System.out.println("\n");
		}

	}

}

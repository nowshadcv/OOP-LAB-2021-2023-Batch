import java.util.Scanner;

class Teacher extends EmployeeT { 	
	String dept,subject;
	Teacher(int empid, String empname ,String empaddress ,int empsal,String empdept,String empsubject){
		
		super(empid,empname,empaddress,empsal);
		 dept = empdept;
		 subject = empsubject;
}
	
	public void display() {
		System.out.println("Teacher Id:" +id+ "\n" + "Teacher Name:" +name+ "\n" + "Teacher Address:" +address+ "\n" + "Teacher Salary:" +salary+ "\n"+ "Teacher Department:" +dept+ "\n"+ "Teacher Subject:" +subject+  "\n");
		System.out.println();
		
	}
}


public class Emp1Arr {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter numbers of teachers");
		int n = sc.nextInt();
		System.out.println("Enter teachers details one by one");
		Teacher teacher [ ] = new Teacher[n];
		int empid;
		String empname;
		String empaddress;
		int empsalary;
		String empdept;
		String empsubject;
		for(int i=0;i<n;i++) {
			System.out.println("Enter "+ i +" teachers details..");
			   System.out.println("Enter teacher id (integer):");
			   empid = sc.nextInt();
			   System.out.println("Enter teacher name (String): ");
			   empname = sc.next();
			   System.out.println("Enter teacher salary (integer):");
			   empsalary = sc.nextInt();
			   System.out.println("Enter teacher address (String):");
			   empaddress = sc.next();
			   System.out.println("Enter teacher department (String):");
			   empdept = sc.next();
			   System.out.println("Enter teacher subject (String):");
			   empsubject = sc.next();
			   sc.close();
			   Teacher t = new Teacher(empid,empname,empaddress,empsalary,empdept,empsubject);
			   teacher[i]=t;
			   }
		System.out.println("Teachers are : \n");
		for(Teacher x : teacher) {
			x.display();
			System.out.println("\n");
			

		}
			
	}
	
}
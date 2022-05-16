import java.util.Scanner;

class Teacher extends EmployeeT{
	String department,subject;
	public Teacher ( int empid ,String empname,int empsal,String empadd,String empdepar,String empsub)
	{
		super(empid,empname,empsal,empadd);
		 department = empdepar;
		 subject = empsub;		
	}
	public void showData()
	{
		System.out.println("EmployeeId:\t" + id +"\n"+ "EmployeeName:\t" + name+"\n" + "EmployeeSalary:\t"+ salary+ "\n" + "EmployeeAddr:\t"+addr+"\n"+"EmployeeDept:\t"+department+"\n"+ "EmployeeSub:\t" +subject+"\n");
		System.out.println();
	}
} 

public class Emp1Arr {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the number of employees");
		int n = sc.nextInt();
		System.out.println("enter employee details one by one");
		Teacher teacher[] = new Teacher[n];
		int empid,empsal;
		String empname,empadd,empdepar,empsub;
		for (int i=0;i<n;i++)
		{
			System.out.println("enter employee details\n");
			System.out.println("enter Teacher id\n");
			empid = sc.nextInt();
			System.out.println("enter Teacher name\n");
			empname = sc.next();
			System.out.println("enter Teacher salary\n");
			empsal = sc.nextInt();
			System.out.println("enter Teacher address\n");
			empadd = sc.next();
			System.out.println("enter Teacher department\n");
			empdepar = sc.next();
			System.out.println("enter Teacher subject\n");
			empsub = sc.next();
			Teacher t = new Teacher(empid, empname, empsal,empadd,empdepar,empsub);
			teacher[i] = t;
		}
		System.out.println("Teacher are :" );
		for(Teacher x : teacher)
		{
			x.showData();
			System.out.println("\n" );
			
		}

	}

}

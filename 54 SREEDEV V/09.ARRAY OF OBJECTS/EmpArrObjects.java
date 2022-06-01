import java.util.Scanner;
public class EmpArrObjects {
	public static void main(String[] args) {
		System.out.println("Enter number of employees :");
		Scanner sc= new Scanner(System . in );
		int n=sc.nextInt();
		System.out.println("Enter Employee details one by one .. ");
		Employee employees [] =new Employee [n];
		Scanner scemp = new Scanner (System . in);
		int eid , esal;
		String enam;
		for(int i=0;i<n;i++){
			System.out.println("Enter "+ i + " employee details ..");
			System.out.println("Enter employee id ( integer ) : ");
			eid=scemp.nextInt();
			System.out.println("Enter Employee name ( String ) : ");
			String nam = scemp.next();
			enam=new String(nam);
			System.out.println("Enter employee salary( integer ) : ");
			esal = scemp.nextInt();
			Employee emp=new Employee(eid,esal,enam);
			employees [i ] =emp;}
		System.out.println("Employees are : \n");
		for(Employee y:employees)
			y.showData ();
		System.out.println("En");
		
	}

}

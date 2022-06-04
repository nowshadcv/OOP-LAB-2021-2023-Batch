import java.util.Scanner;

class EmpArrObjects {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the number of employees");
		int n = sc.nextInt();
		System.out.println("enter employee details one by one");
		Employee employees[] = new Employee[n];
		int eid,esal;
		String ename;
		for (int i=0;i<n;i++)
		{
			System.out.println("enter employee details\n");
			System.out.println("enter employee id\n");
			eid = sc.nextInt();
			System.out.println("enter employee name\n");
			ename = sc.next();
			System.out.println("enter employee salary\n");
			esal = sc.nextInt();
			Employee emp = new Employee(eid, ename, esal);
			employees[i] = emp;
		}
			System.out.println("employees are \n");
			for(Employee y : employees)
			{
				y.showData();
			}
		System.out.println("emter employee to search \n");
		int item = sc.nextInt();
		boolean found = false;
		for(Employee e : employees)
		{
			if(item == e.id)
			{
				found = true;
				System.out.println("item found \n");
				e.showData();
				break;
			}
		}
		if(found==false)
		{
			System.out.println("item not found \n");

		}
		
	}

}
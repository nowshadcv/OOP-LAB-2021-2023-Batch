import java.util.Scanner;;
public class EmpArrObject {

	public static void main(String[] args) {
		System.out.println("enter number of Employee..");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter Employee deatails one bye one");
		Employee employees[]=new Employee [n];
		Scanner scemp= new Scanner(System.in);
		int eid,esal;
		String ename;
		for(int i=0;i<n;i++){
			System.out.println("enter "+i+"  employee details");
			System.out.println("enter employee id(imnteger)");
			eid=scemp.nextInt();
			System.out.println("enter employee name");
			String nam=scemp.next();
			ename = new String(nam);
			System.out.println("enter employee salery (integer)");
			esal=scemp.nextInt();
			Employee emp=new Employee(eid ,esal,ename);
			employees[i]=emp;
		}
			System.out.println("Employees are ......");
			for(Employee y : employees)
				y.showData();
			System.out.println("enter employee ID to search");
			int semp=sc.nextInt();
			boolean found=false;
			for(Employee e : employees)
			{
				if(semp==e.eNo)
				{
					found=true;
					System.out.println("Employee found");
					e.showData();
					break;
					
				}
			}
			
			if(! found)
				System.out.println("Employee not FOUND");
			
			
		}
	}



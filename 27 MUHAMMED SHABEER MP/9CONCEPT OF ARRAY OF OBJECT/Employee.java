
public class Employee {
	int eNo,eSalery;
	String eName;

	public Employee(int no,int sal,String name){
		eNo=no;
		eSalery = sal;
		eName=name;
	}
		public void showData()
		{
			System.out.print("EmpId = "+eNo+ " "+ "Name ="+eName+" "+"salary = "+eSalery);
		System.out.println();
		}
		
	}



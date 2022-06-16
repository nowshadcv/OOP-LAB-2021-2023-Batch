public class Employee {
	int eNo , eSalary;
	String eName;
	public Employee(){}
	public Employee(int no , int sal , String name){
		eNo = no;
		eSalary = sal;
		eName = name;
	}
	public void showData(){
		System.out.println("Empid = "+ eNo +"\n Name = "+ eName +"\n Salary = "+eSalary+"\n");
	}

}



import java.util.Scanner;
public class EmpArrObjects {

	public static void main(String[] args) {
		System.out.println("Enter number of employee");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		Employee employee[] = new Employee[n];
		System.out.println("Enter employee details one by one");
		int eno, sal;
		String name;
		for (int i= 0 ; i<n ;i++){
			System.out.println("Enter"+ i +"Emloyee details");
			System.out.println("Enter Employee name");
			name=sc.next();
			System.out.println("Enter employee id (Integer)");
			eno=sc.nextInt();
			System.out.println("Enter Employee salary");
			sal=sc.nextInt();
			Employee emp = new Employee(eno,sal,name);
			employee[i]=emp;
			System.out.println("\n");
			
		}
		System.out.println("Employees are \n");
		for(Employee Y : employee){
			Y.showData();
		}
		System.out.println("Enter employee number to search ");
		int semp = sc.nextInt();
		boolean found = false;
		for(Employee e : employee){
			if(semp==e.eNo){
				found = true;
				System.out.println(e.eName +" Employee found");
				break;
			}
		}
		if(!found){
			System.out.println("Employee not found");
		}
			
	}

}


public class EmployeeT {
	
int empid;
String name;
float salary;
String address;

EmployeeT(int empid,String name,float salary,String address)
{
	this.empid=empid;
	this.name=name;
	this.salary=salary;
	this.address=address;
}
}
class Teacher extends EmployeeT{
	String department,subject;
	Teacher(int empid,String name,float salary,String address,String subject,String department)
	{
		super(empid,name,salary,address);
		this.department=department;
		this.subject=subject;
	
	}
	public void display(){
		System.out.println(" teacher  id:  "+empid);
		System.out.println(" teacher  name:  "+name);
		System.out.println(" teacher  Salary:  "+salary);
		System.out.println(" teacher  address:  "+address);
		System.out.println(" teacher  department:  "+department);
		System.out.println(" teacher  subject:  "+subject);
		
			
	}
}




import java.util.Scanner;
class EmployeeT {
	int empid;
	String name;
	float salary;
	String address;
	EmployeeT(){}
	EmployeeT(int empid, String name, float salary, String address ){
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.address = address; }}
class Teacher extends EmployeeT{
	String department, subject;
	Teacher(int empid, String name, float salary,String address, String department, String subject){
		super(empid,name,salary,address);
		this.department = department;
		this.subject = subject;}
	public void display() {
		System.out.println("teacher id : " + empid);
		System.out.println("Teacher name : " + name);
		System.out.println("Teacher salary :" + salary);
		System.out.println("Teacher address :" + address);
		System.out.println("Teacher department " + department);
		System.out.println("Teacher subject :" + subject);}}
		
public class TeacherArrObjects {
	public static void main(String[] args) {
		System.out.println (" Enter number of Teachers : ") ;
		Scanner sc = new Scanner ( System .in );
		int n = sc.nextInt();
		System.out.println(" Enter Tcher Details one by one ..");
		Teacher teacher [ ] = new Teacher [ n ] ;
		Scanner scT = new Scanner ( System .in ) ;
		int tid;
		String name;
		float salary;
		String Address;
		String department;
		String subject;
		for ( int i=0; i<n; i++  ) {
		

	}

}

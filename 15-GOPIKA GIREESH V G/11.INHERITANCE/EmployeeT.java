import java.util.Scanner;
class EmployeeT {
	int empid;
	String name;
	float salary;
	String address;
	EmployeeT(){}
	EmployeeT(int empid,String name,float salary,String address){
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		this.address=address;}}
class Teacher extends EmployeeT{
	String department,subject;
	Teacher(int empid,String name,float salary,String address,String department,String subject){
		super(empid,name,salary,address);
		this.department=department;
		this.subject=subject;}
	public void display() {
		System.out.println("Teacher id:"+empid);
		System.out.println("Teacher name:"+name);
        System.out.println("Teacher salary:"+salary);
        System.out.println("Teacher address:"+address);
        System.out.println("Teacher department:"+department);
        System.out.println("Teacher subject:"+subject);}}

public class TeacherArrObjects{
       public static void main(String[] args) {
    	   System.out.println("enter no of teachers:");
    	   Scanner sc=new Scanner(System.in);
    	   int n=sc.nextInt();
    	   System.out.println("enter teacher details one by one...");
    	   Teacher 
       }
		

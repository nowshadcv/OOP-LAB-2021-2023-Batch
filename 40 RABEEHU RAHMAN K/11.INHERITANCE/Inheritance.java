package inheritance;

import java.util.Scanner;
class Employee{
	int empid;
	String name;
	float salary;
	String address;
	Employee(int empid,String name,float salary,String address){
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		this.address=address;
	}
	}
class Teacher extends Employee{
	String department, subject;
	Teacher(int empid,String name,float salary,String address,String department,String subject){
		super(empid,name,salary,address);
		this.department=department;
		this.subject=subject;}
	public void display() {
		System.out.println("Teacher id : "+ empid);
		System.out.println("Teacher name : "+ name);
		System.out.println("Teacher salary : "+ salary);
		System.out.println("Teacher address : "+ address);
		System.out.println("Teacher department : "+ department);
		System.out.println("Teacher subject : "+ subject);
	}		
}

public class Inheritance {

	public static void main(String[] args) {
		
		System.out.println("Enter number of teachers:");
		Scanner sc = new Scanner (System.in);
		int n=sc.nextInt();
		System.out.println("Enter teacher details one by one...");
		Teacher teacher []=new Teacher[n];
		Scanner sct = new Scanner (System.in);
		int tid;String name;float salary;String address;
		String department;String subject;
		for(int i=0;i<n;i++) {
			System.out.println("Enter"+i+"Teacher details...");
			System.out.println("Enter teacher id(integer):");
			tid=sct.nextInt();
			System.out.println("Enter teacher name(string):");
			name=sct.next();
			System.out.println("Enter teacher salary(float):");
			salary=sct.nextFloat();
			System.out.println("Enter teacher address(string):");
			address=sct.next();
			System.out.println("Enter teacher department(string)");
			department=sct.next();
			System.out.println("Enter teacher subject(string):");
			subject=sct.next();
			Teacher t=new Teacher(tid,name,salary,address,department,subject);
			teacher [i]=t;}
		for(Teacher x:teacher) {
			x.display();System.out.println("\n");}
		}
}

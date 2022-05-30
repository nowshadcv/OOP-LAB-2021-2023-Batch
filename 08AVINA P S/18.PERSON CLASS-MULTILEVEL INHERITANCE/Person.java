
public class Person {
	String name;
	String gender;
	String address;
	int age;
	Person(String name,String gender,String address,int age){
	this.name=name;
	this.gender=gender;
	this.address=address;
	
	this.age=age;

	}
	public void display()
	{
	System.out.println("Name :"+this.name);
	System.out.println("Gender :"+this.gender);
	System.out.println("Address :"+this.address);
	System.out.println("Age :"+this.age);
	}
	}
	class Employee extends Person {
	int empId;
	String CompanyName;
	String Qualification;
	int Salary;
	Employee(String name,String gender,String address,int age,int id,String companyname,String qualification,int salary){
	super(name,gender,address,age);
	this.empId=id;
	this.CompanyName=companyname;
	this.Qualification=qualification;
	this.Salary=salary;

	}
	public void display() {
	super.display();
	System.out.println("ID:" + this. empId);
	System.out.println("CompanyName:" +this.CompanyName);
	System.out.println("Qualification :" + this.Qualification);
	System.out.println("Salary:" + this.Salary);
	}
	}
	class Teacher extends Employee{
	String subject;
	String dept;
	int tchrid;
	Teacher(String name,String gender,String address,int age,int id,String companyname,String qualification,int salary,String subject,String dept,int tchrid){
	super(name,gender,address,age,id,companyname,qualification,salary);
	this.dept=dept;
	this.tchrid=tchrid;
	this.subject=subject;
	}
	public void display() {
	super.display();
	System.out.println("Subject:" + this.subject);
	System.out.println("Teacher name:" +name);
	System.out.println(" department:" +  this.dept);
	System.out.println("TeacherID:" +this.tchrid);

	}
	}


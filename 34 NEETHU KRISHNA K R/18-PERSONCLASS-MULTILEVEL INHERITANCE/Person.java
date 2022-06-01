package multilevelinheritance;
import java.util.Scanner ;

	class Person {
	String Name, Gender , Address ;
	protected int Age ;
	public Person() { }
	public Person ( String n , String g , String addr , int a ){
	this . Name = n ;
	this . Gender = g ;
	this . Address =addr ;
	this . Age = a ;}
	public void displayPerson() {
	System.out.println ( " \n Name: "+ Name ) ;
	System.out.println ( " Gender : " + Gender ) ;
	System.out.println ( " Address : " + Address ) ;
	System.out.println ( " Age : " + Age ) ;}}

	class Employee extends Person {
	int Empid , Salary ;
	String Companyname , Qualification ;
	public Employee() { }
	public Employee ( String n , String g , String addr , int a , int eid , String

	cname , String qual , int sal ){

	super ( n , g , addr , a ) ;
	Empid = eid ;
	Companyname = cname ;
	Qualification = qual ;
	Salary = sal ;}
	public void displayEmployee() {
	super . displayPerson();
	System.out.println ( " Empid : "+Empid ) ;
	System.out.println ( " Company name : " + Companyname ) ;
	System.out.println ( " Qualification : " + Qualification ) ;
	System.out.println ( " Salary : " + Salary ) ;}}

	class Teacher1 extends Employee{
	String Subject , Department ;
	int Teacherid ;
	public Teacher1 ( String n , String g , String addr , int a , int eid , String
	cname , String qual , int sal , String sub , String dept , int tid ){
	super ( n , g , addr , a , eid , cname , qual , sal ) ;
	Subject = sub ;
	Department = dept ;
	Teacherid = tid ;}
	public void displayTeacher() {
	super . displayEmployee ( ) ;
	System.out.println( " Teacher id : " + Teacherid ) ;
	System.out.println( " Subject : " + Subject ) ;
	System.out.println( " Department : " + Department + "\n") ;}}

	


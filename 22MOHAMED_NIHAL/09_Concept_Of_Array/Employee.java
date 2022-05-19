
public class Employee {
	int id,sal;
	String name;
	public Employee(){}
	public Employee(int eid,String ename, int esal)
	{
		id= eid;
		name = ename;
		sal= esal;
	}
	public void showData()
	{
		System.out.println("Empid ="+id+"Empname="+name+"Empsal="+sal + "\n");
		System.out.println();
	}
}
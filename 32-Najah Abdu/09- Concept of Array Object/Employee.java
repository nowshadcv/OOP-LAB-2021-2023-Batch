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





public class Employe {
	int eNo,eSalary;
	String eName;
	public Employe(){}
	public Employe(int no,int sal,String name){
		eNo=no;
		eSalary=sal;
		eName =name;
		
	}
	
	public void showData() {
		System.out.println("empid="+" "+"name="+eName+" "+"salary"+eSalary);
		System.out.println();
	}

}

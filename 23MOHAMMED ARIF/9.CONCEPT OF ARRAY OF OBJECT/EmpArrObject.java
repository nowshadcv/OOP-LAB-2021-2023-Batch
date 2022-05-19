import java.util.Scanner;

public class EmpArrObject {

	public static void main(String[] args) {
	System.out.println("enter number of employee");
	Scanner sc= new Scanner (System.in);
	int n =sc.nextInt();
	System.out.println("enter employee details in one by one");
	Employe employees [ ]= new Employe [n];
	Scanner scemp=new Scanner(System.in);
	int eid,esal;
	String ename;
	for(int i=0;i<n;i++)
	{
		System.out.println("enter"+i+"employee details");
		System.out.println("enter employe id(integer)");
		eid=scemp.nextInt();
		System.out.println("enter employe name(string)");
		 String name=scemp.next();
		 ename=new String(name);
		 System.out.println("enter employe salary(integer)");
		 esal=scemp.nextInt();
		 Employe emp =new Employe(eid,esal,ename);
		 employees [i]=emp;}
	System.out.println("empoyees are....");
	for(Employe y : employees)
		y.showData();
	System.out.println("enter employe number to search");
	int semp=sc.nextInt();
	boolean found = false;
	for (Employe e : employees){
		if (semp==e.eNo){
			found =true;
			System.out.println("employee found...");
			e.showData();
			break;}}
	if(! found)
		System.out.println("employee not found");
		}
	
		 
		 
		 
		
	
	
		

	}



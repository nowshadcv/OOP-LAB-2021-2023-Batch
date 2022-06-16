class Result extends Student implements Sports1 {
	 
	 float per;
	 Result(String n,String sp,int m1,int m2) {
	 
	  super(n,sp,m1,m2);
	 }
	 
	 public void Percent_cal() {
	 
	  int tot = score1 + score2;
	  per = (float)tot / 2;
	 }
	 
	 void display() {
	 
	  show();
	  System.out.println("Percentage = "+per);
	 }
	 
	}

	public class ResultAcademic {
	 
	 public static void main (String[] args) {
	 
	  Result r = new Result("Aashish","Cricket",75,95);
	  r.Percent_cal();
	  r.display();
	 }
	}
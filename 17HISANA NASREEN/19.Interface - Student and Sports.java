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





public interface Sports1 {
	 void Percent_cal();
		}

		class Student {
		 
		 String name,sports_name;
		 int roll_no, score1, score2;
		 Student(String n, String sp, int s1, int s2) {
		 
		  name = n;
		  sports_name = sp;
		  score1 = s1;
		  score2 = s2;
		 }
		 
		 void show() {
		 
		  System.out.println("Student Name : "+name);
		  System.out.println("sports_name:"+sports_name);
		  System.out.println("score1 : "+score1);
		  System.out.println("score2 : "+score2);
		 }
}
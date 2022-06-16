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

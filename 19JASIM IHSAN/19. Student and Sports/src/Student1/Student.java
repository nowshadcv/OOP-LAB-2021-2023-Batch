package Student1;

public class Student {
   String name;
   int number;
   float mark1,mark2;
  Student(String n,int r,float m1,float m2){
	  name = n;
	  number = r;
	  mark1 = m1;
	  mark2 = m2;
  }
  void display() {
      System.out.println("Student Details");
      System.out.println("Name of Student: " + name);
      System.out.println("Roll No. of Student: " + number);
      System.out.println("Marks of Subject 1: " + mark1);
      System.out.println("Marks of Subject 2: " + mark2);
  }
}


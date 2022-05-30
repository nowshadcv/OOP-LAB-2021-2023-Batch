package Student1;
import java.util.*;
public class Result extends Student implements Sports{
	
	
	 int r;
	    String item;
	    Scanner sc = new Scanner(System.in);

	    Result(String n, int r, float m1, float m2) {
	        super(n, r, m1, m2);
	    }

	    public void academic() {
	        float total = (mark1 + mark2);
	        float percent = total * 100 / 200;
	        System.out.println("___Academic Info___");
	        System.out.println("Percentage: " + percent + "%");
	    }

	    public void sports_getData() {
	        System.out.print("Enter the sports item which student participated : ");
	        item = sc.nextLine();
	        System.out.print("Enter the rank position that the obtained : ");
	        r = sc.nextInt();
	    }

	    public void sports_dispData() {
	        System.out.println("____sports Info____");
	        System.out.println("Item :" + item);
	        System.out.println("Rank  :" + r);
	    }
	}



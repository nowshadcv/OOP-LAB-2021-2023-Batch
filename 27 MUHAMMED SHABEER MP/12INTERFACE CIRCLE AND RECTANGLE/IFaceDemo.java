import java.util.Scanner;


public class IFaceDemo {
public static void main(String[] args) {
		
		
		
		
		
		
				int ch;
				Circle c=new Circle();
				Rectangle r=new Rectangle();
				Scanner sc=new Scanner(System.in);
				System.out.println("1.Area of Circle");
				System.out.println("2.Area of Reactangle");
				System.out.println("3.perimeter of Circle");
				System.out.println("4.perimeter of Rectangle");
				System.out.println("5program termination");
				
				
				lp:while(true){
					System.out.println("Make your choice :");
					ch=sc.nextInt();
					switch(ch)
					{
					case 1:
						System.out.println("enter the radious of  Circle");
						c.input();
						c.area();
						break;
					case 2:
						System.out.println("enter the length and breadth of rectanglee");
						r.input();
						r.area();
						break;
					case 3:
						System.out.println("enter the radious of circle");
						c.input();
						c.perimeter();
						break;
					case 4:
						System.out.println("enter the length and breadth of rectanglee");
						r.input();
						r.perimeter();
						break;
					case 5:
						break lp;
					default :
						System.out.print("Invalid Choice please make valid choice ");
						
					}
				}
			}
		

		

	}



package interface2;
import java.util.Scanner;

interface AP{
	void input();
	void area();
	void perimeter();}


class Circle implements AP{
	int r = 0;
	double pi = 3.14,area=0,perimeter=0; 
	public void input() {
		Scanner c = new Scanner(System.in);
		r=c.nextInt();}
	public void area() {
		area = pi * r * r;
		System.out.println("Area of circle: "+ area);
		}
	public void perimeter(){
		perimeter = 2* pi * r;
		System.out.println("perimeter of circle:"+ perimeter);
	}
}
class Rectangle implements AP{
	int l = 0, b=0;
	double area,perimeter;
	public void input() {
		Scanner r = new Scanner(System.in);
		l=r.nextInt();
		b=r.nextInt();
	}
	public void area() {
		area = l * b;
		System.out.println("Area of circle: "+ area);
		}
	public void perimeter(){
		perimeter = 2* (l+b);
		System.out.println("perimeter of circle:"+ perimeter);
}
}




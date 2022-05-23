package figuers;

public class Triangle implements FigureTr {
	private int side1, side2, side3;
	public Triangle(int s1, int s2, int s3) {
		side1 = s1; side2 = s2; side3 =s3;}
	public int perimeter() { return side1+side2+side3;}
	public double area() {
	double s = (side1+side2+side3)/2;
	double a = Math.sqrt((s-side1)+(s-side2)+(s-side3));
	return a;}}
		
	
	



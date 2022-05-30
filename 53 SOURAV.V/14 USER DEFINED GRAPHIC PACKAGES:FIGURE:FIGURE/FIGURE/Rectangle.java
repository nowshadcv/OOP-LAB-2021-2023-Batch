package figure;

public class Rectangle implements FigureRect {
	private int l1,b1;
	public Rectangle(int l,int b) {
		l1=l;
		b1=b;
	}
	public int perimeter() {
		return (2*(l1+b1));
	}
	public int area() {
		return (l1*b1);
	}

}

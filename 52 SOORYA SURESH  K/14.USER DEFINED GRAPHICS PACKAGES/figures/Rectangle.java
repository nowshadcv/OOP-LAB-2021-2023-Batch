package figures;

public class Rectangle implements FigureRect {
	private int length;
	private int width;
	public Rectangle(int l,int w) {
		length = l;width=w;}
	public int perimeter() {
		return (2*(length+width));
		}
	public int area() {
		return (length*width);
	}
}

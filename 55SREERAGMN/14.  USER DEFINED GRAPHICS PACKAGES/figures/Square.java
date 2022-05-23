package figures;

public class Square implements FigureSq {
	private int side;
	public Square(int s) {side = s;}
	public int perimeter() {return(4*side);}
	public int area(){return(side*side);}

}

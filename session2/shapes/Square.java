package ir.isc.training1;

public class Square implements Shape {
	
	private int side;

	public Square(int side) {
		this.side = side;
	}

	@Override
	public double area() {
		return side * side;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return side * 4;
	}

}

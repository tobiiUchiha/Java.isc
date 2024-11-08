package ir.isc.training1;

public class Rectangle implements Shape {
	
	private double width;
	private double height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height= height;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		 return width * height;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2 * (height * width);
	}

}

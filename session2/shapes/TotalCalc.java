package ir.isc.training1;

public class Totalcalc implements Shape {

	public static <T extends Shape> double TotalAreaCalc(T[] shapes) {
		double totalarea = 0;
		for (T shape : shapes) {
			totalarea += shape.area();
		}
		
		return totalarea;
	}
	
	public static <T extends Shape> double TotalPerimeterCalc(T[] shapes) {
		double totalperimeter = 0;
		for (T shape : shapes) {
			totalperimeter += shape.perimeter();
		}
		
		return totalperimeter;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

}

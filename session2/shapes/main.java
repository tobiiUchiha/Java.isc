package ir.isc.training1;
public class main {

	public static void main(String[] args) {
		
		Square[] squares = {new Square(4), new Square(3), new Square(7)};
		System.out.println(Totalcalc.TotalAreaCalc(squares));
		System.out.println(Totalcalc.TotalPerimeterCalc(squares));
		
		Rectangle[] rectangles = {new Rectangle(6,3), new Rectangle(6,9), new Rectangle(7,3)};
		System.out.println(Totalcalc.TotalAreaCalc(rectangles));
		System.out.println(Totalcalc.TotalPerimeterCalc(rectangles));
			
		
		
	}
		
}

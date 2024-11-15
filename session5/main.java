package ir.isc.training1;import ir.isc.training1.model.ProductSpecs;
import ir.isc.training1.model.ProductType;
import ir.isc.training1.service.ProductService;
import ir.isc.training1.service.exception.NameNotFound;

public class mainn {

	public static void main(String[] args) {
		
		ProductService s = new ProductService();
		
		System.out.println(s.AllProducts());
		System.out.println();
		System.out.println(s.FindByCategory(ProductType.DIGITAL));
		System.out.println();
		try {
			System.out.println(s.FindByName("samsungs20"));
		} catch (NameNotFound e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println();
		
		try {
			System.out.println(s.FindByName("nokia"));
		} catch (NameNotFound e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println();
		
		try {
			System.out.println(s.FindByNameAndCategory("zaraboot",ProductType.CLOTHES));
		} catch (NameNotFound e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println();
	
		try {
			System.out.println(s.FindByNameAndCategory("koton",ProductType.CLOTHES));
		} catch (NameNotFound e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}

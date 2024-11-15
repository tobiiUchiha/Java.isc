package ir.isc.training1.service;
import java.util.logging.Logger;
import java.util.List;
import java.util.stream.Collectors;
import ir.isc.training1.model.ProductSpecs;
import ir.isc.training1.model.ProductType;
import ir.isc.training1.service.exception.NameNotFound;



public class ProductService {
	
	private static final Logger logger = Logger.getLogger(ProductSpecs.class.getName());

	ProductSpecs xiaomiappliance = new ProductSpecs("xiaomi", ProductType.HOME, 250000, false);
	ProductSpecs samsungs20 = new ProductSpecs("samsungs20",ProductType.DIGITAL, 500000, true);
	ProductSpecs levijean = new ProductSpecs("levijean", ProductType.CLOTHES, 100000, true);
	ProductSpecs asusrog = new ProductSpecs("asusrog", ProductType.DIGITAL, 400000, false);
	ProductSpecs zaraboot = new ProductSpecs("zaraboot", ProductType.CLOTHES,200000, true);
	
	List<ProductSpecs> all = List.of(xiaomiappliance, samsungs20, levijean, asusrog, zaraboot);

	
	public List<ProductSpecs> AllProducts() {
		logger.info("search without any options");
		 return all;
	}
	
	public List<ProductSpecs> FindByCategory(ProductType category) {
		logger.info("search by the category: " + category);
		List<ProductSpecs> categorylist = all.stream()
				.filter(t -> t.category().equals(category))
				.collect(Collectors.toList());
		
		return categorylist;
		
	}
	
	
	public List<ProductSpecs> FindByName(String name) throws NameNotFound {
		logger.info("search by the name: " + name);
		List<ProductSpecs> names = all.stream()
				.filter(t -> t.name().equals(name))
				.collect(Collectors.toList());
		
		if (names.size() != 1) {
			throw new NameNotFound("couldn't find the name");
		}
		
		return names;
		
		
	}
	
	public List<ProductSpecs> FindByNameAndCategory(String name, ProductType category) throws NameNotFound{
		logger.info("search by category: " + category + " and name: " + name);
		List<ProductSpecs> matchlist = all.stream()
				.filter(t -> t.name().equals(name) && t.category().equals(category))
				.collect(Collectors.toList());
		
		if (matchlist.size() != 1) {
			throw new NameNotFound("No results");
		}
		
		return matchlist;
		
	}
}
	
	




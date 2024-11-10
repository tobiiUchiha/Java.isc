package ir.isc.training1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class main {

	public static void main(String[] args) {
		
		Account ali = new Account("Ali", 100, "Shariati");
		Account reza = new Account("Reza", 200, "Mirdamad");
		Account saeid = new Account("Saeid", 500, "Tajrish");
		Account mohammad = new Account("Mohammad", 300, "Sohrevardi");
		Account alireza = new Account("Alireza", 150, "Sadeghie");
		
		Account[] accountsArray = {ali,reza,saeid,mohammad,alireza};
		List<Account> accounts = Arrays.asList(accountsArray);
		System.out.println(accounts);
		
		System.out.println();
		
		Collections.sort(accounts, new AccountSort());
		System.out.println("Sorted List: " + accounts);
		
		System.out.println();
		
		Collections.sort(accounts, new AccountReverseSort());
		System.out.println("Reverse Sorted List: " + accounts);
		
		System.out.println();
		
		
		List<Account> list1 = Arrays.asList(ali,reza);
		List<Account> list2 = Arrays.asList(mohammad);
		
		Map<String, List<Account>> accountMap = new HashMap<>();
		accountMap.put("001", list1);
		accountMap.put("002", list2);
		
		
		for (Entry<String, List<Account>> entry : accountMap.entrySet()) {
			System.out.println("Branch: " +  entry.getKey() + " Accounts:" + entry.getValue());
			
		}
		
		System.out.println();
		
		
		// removing the 002 branch
		
		accountMap.remove("002");
		
		for (Entry<String, List<Account>> entry : accountMap.entrySet()) {
			System.out.println("Branch: " +  entry.getKey() + " Accounts:" + entry.getValue());
		}
			
		System.out.println();

			
		// Accounts starting with A
			
			accounts.stream()
				.filter(t -> t.getName().startsWith("A"))
				.forEach(t -> System.out.println(t));
			
			System.out.println();
			
			accounts.stream()
			.filter(t -> t.getName().startsWith("A"))
			.forEach(t -> System.out.println(t.getName().toUpperCase()));
			
			System.out.println();
			
		
			// copying the filter into a new list
			
			List<Account> newList =  accounts.stream()
			.filter(t -> t.getName().startsWith("A"))
			.filter(t -> t.getBalance() > 100)
			.collect(Collectors.toList());
			
			System.out.println(newList);
		
		
	}
		
}

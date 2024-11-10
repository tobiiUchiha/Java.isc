package ir.isc.training1;

import java.util.Comparator;

public class AccountSort implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		return o1.getBalance() - o2.getBalance();
	}

}

package ir.isc.training1;

import java.util.Comparator;

public class AccountReverseSort implements Comparator<Account>{

	@Override
	public int compare(Account o1, Account o2) {
		return o2.getBalance() - o1.getBalance();
	}

}

package ir.isc.training1;

import java.time.LocalDateTime;

public class Account {
	
	public Account(int balance, String branch) {
		super();
		this.balance = balance;
		this.branch = branch;
	}
	
	public Account(int balance) {
		super();
		this.balance = balance;
	}


	private int balance;
	private String branch;
	private boolean locked;
	private LocalDateTime lastTransaction;
	
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public boolean isLocked() {
		return locked;
	}
	public void setLocked(boolean locked) {
		this.locked = locked;
	}
	public LocalDateTime getLastTransaction() {
		return lastTransaction;
	}
	public void setLastTransaction(LocalDateTime lastTransaction) {
		this.lastTransaction = lastTransaction;
	}
	
	
	public void print() {
		System.out.println("Account balance: "+ balance);
		System.out.println("Account branch: " + branch);
		System.out.println("Account status: " + locked);
		System.out.println("Last Transaction: " + lastTransaction);
		
	}
	
	public int withdraw(int balance) {
		if (this.balance >= balance) {
			this.balance -= balance;
			return this.balance;
		}
		else
			System.out.println("the account does not have sufficient balance! ");
			return this.balance;
			
	}

}

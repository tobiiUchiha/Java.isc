package ir.isc.training1;

public class Account {
	
	public Account(String name, int balance, String branch) {
		this.balance = balance;
		this.name = name;
		this.branch = branch;
	}
	private int balance;
	private String name;
	private String branch;
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "[name= " + name + ", balance= " + balance + ", branch= " + branch + "]";
	}	

}

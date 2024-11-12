package ir.isc.training1;
import java.io.Serializable;
import java.util.List;

public class User implements Serializable {
	
	private static final long serialVersionUID = 2800656784572996312L;
	private List<String> account; 
	private String username;
	private transient String password;
	private transient String cardnumber;
	
	public User(List<String> account, String username, String password, String cardnumber) {
		super();
		this.account = account;
		this.username = username;
		this.password = password;
		this.cardnumber = cardnumber;
	}
	public List<String> getAccount() {
		return account;
	}
	public void setAccount(List<String> account) {
		this.account = account;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}
	
}

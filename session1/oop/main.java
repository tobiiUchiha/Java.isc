package ir.isc.training1;
import java.time.LocalDateTime;
public class main {

	public static void main(String[] args) {
		Account first = new Account(200,"Shariati");
		first.withdraw(230);
		first.print();
		first.withdraw(50);
		first.setLastTransaction(LocalDateTime.now());
		first.print();
	}
}

package builder;

public class builderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HttpConnection newConnection1 = new HttpConnection.Builder()
								 	.Url("http://google.com")
								 	.Port(80)
								 	.User("firefox")
								 	.Password("1234")
								 	.Timeout(500)
								 	.build();
		
		HttpConnection newConnection2 = new HttpConnection.Builder()
								 	.Url("yahoo.com")
								 	.Port(8080)
								 	.User("firefox")
								 	.Password("34343")
								 	.Timeout(100)
								 	.build();
					
		System.out.println("valid connection" + newConnection1);
		
		System.out.println("invalid connection" + newConnection2);

	}
	

}

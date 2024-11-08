package ir.isc.training1;
public class main {

	public static void main(String[] args) {
		
			String[] list1 = {"Ali","Reza","Saeid"};
			String[] list2 = {"Mohammad","Saeid","Ali"};
			
			for (int i = 0; i < list1.length; i++) {
				for (int j = 0; j < list2.length; j++) {
					if (list1[i] == list2[j])
						System.out.println(list2[j]);
				}
			}
	}
}

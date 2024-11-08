package ir.isc.training1;

public abstract class Person {
	
	private String name;
	private boolean isawake;
	
	public abstract void notifyPerson();

	public void awake() {
		System.out.println("are you awake?");
	}

}

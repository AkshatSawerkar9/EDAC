package fruits;

public class Fruits {

	/*
	 * 2.1 Create inheritance hierarchy for fruits Fruit,Apple,Orange,Cherry Add
	 * private data member "name" , in Fruit class , to accept a name of the fruit.
	 * (eg : "Kashmiri Apple" or "Nagpur Orange" ...) Add taste() method to display
	 * its taste.
	 */

	private String name;

	public Fruits(String name) {
		this.name = name;
	}

	public void taste() {
		System.out.println("No specific taste: ");
	}

}

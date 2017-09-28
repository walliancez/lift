package lift;

public class Person implements Runnable{
	
	private int id;
	private int floor;
	
	public Person(int id, int floor) {
		this.id = id;
		this.floor = floor;
	}

	@Override
	public void run() {
		// This is what I should do
		
		// First wait on the floor until the lift is on that floor
		
		// Get in the lift
		
		// Is the lift on the right floor? Then I get out
	}

}

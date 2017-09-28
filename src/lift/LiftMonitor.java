package lift;

public class LiftMonitor {
	int here; 			// If here !=next , here (floor number) tells from which floor
						// the lift is moving and next to which floor it is moving.
	int next; 			// If here ==next , the lift is standing still on the floor
						// given by here.
	int [] waitEntry ;	// The number of persons waiting to enter the lift at the
						// various floors.
	int [] waitExit; 	// The number of persons (inside the lift) waiting to leave
						// the lift at the various floors.
	int load;			 // The number of people currently occupying the lift.

	public LiftMonitor() {
		waitExit = new int[4];
		waitEntry = new int[7];
		
		fillArray(waitExit);
		fillArray(waitEntry);
	}
	
	private void fillArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}
	}
	
	synchronized void addPersonToLift(int id) {
		
	}
	
	synchronized boolean anyoneWaiting() {
		for(int i = 0; i < waitEntry.length; i++) {
			if(waitEntry[i] != 0) {
				return true;
			}
		}
		return false;
	}
	
	synchronized int nextFloor() {
		return 0;
	}
	
	synchronized int checkCurrentLoad() {
		return load;
	}
}

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

	
	synchronized void addPersonToLift(int id) {
		
	}
	
	synchronized int currentFloor() {
		return 0;
	}
	
	synchronized int checkCurrentLoad() {
		return load;
	}
}

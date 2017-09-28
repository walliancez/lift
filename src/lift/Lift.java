package lift;

public class Lift implements Runnable{

	private LiftView lv;
	private LiftMonitor lm;
	
	public Lift(LiftView lv, LiftMonitor lm) {
		this.lv = lv;
		this.lm = lm;
	}
	
	@Override
	public void run() {
		int current = 0;
		int next = 1;
		// TODO Auto-generated method stub
		while(!Thread.currentThread().isInterrupted()) {
			// Things to do
			if(lm.checkCurrentLoad() != 0 && lm.anyoneWaiting()) {
				
			}
		}
	}

}

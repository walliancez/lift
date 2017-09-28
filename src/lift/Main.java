package lift;

public class Main {
	
	//private LiftView liftView;
	private Thread liftThread;
	private LiftMonitor lm;
	
	public Main() {
		lm = new LiftMonitor();
		liftThread = new Thread(new Lift(new LiftView(), lm));
		liftThread.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}

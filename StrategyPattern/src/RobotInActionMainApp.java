
public class RobotInActionMainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot r1 = new Robot("Big Robot");
		Robot r3 = new Robot("R2");

		r1.setBehaviour(new AggressiveBehavior());
		r3.setBehaviour(new NormalBehaviour());
		
		r1.move();
		r3.move();

		System.out.println("\r\nNew behaviours: " +
				"\r\n\t'Big Robot' gets really scared" +
				"\r\n\t, 'George v.2.1' becomes really mad because" +
				"it's always attacked by other robots" +
				"\r\n\t and R2 keeps its calm\r\n");

		r1.setBehaviour(new AggressiveBehavior());
		r1.move();
		r3.move();

	}

}

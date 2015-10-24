
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context cntxt = new Context();
		State start = new StartState();
		
		cntxt.setContext(start);
		cntxt.state.doAction(cntxt);
		
		System.out.println("In running state closing towards completion");
		State end = new EndState();
		
		cntxt.setContext(end);
		cntxt.state.doAction(cntxt);
	}

}

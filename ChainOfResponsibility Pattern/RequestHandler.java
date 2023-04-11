public abstract class RequestHandler {
	public static long SALESMAN = 5000;
	public static long MANAGER = 50000;
	public static long SALES_HEAD = 100000;

	protected long amount;
	protected RequestHandler next_handler;

	public void setNextHandler(RequestHandler next_handler){
		this.next_handler = next_handler;
	}

	public void handleRequest(long amount, String message){
		System.out.println("Received purchase request of " + amount + " for " + message);
		if(this.amount >= amount){
			handle(message);
			return;
		}

		if(next_handler != null){
			next_handler.handleRequest(amount, message);
		}
	}

	abstract protected void handle(String message);

}
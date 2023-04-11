public class Main {
	  private static RequestHandler getChainOfHandlers(){
      	RequestHandler handler1 = new Salesman(RequestHandler.SALESMAN);
      	RequestHandler handler2 = new Manager(RequestHandler.MANAGER);
      	RequestHandler handler3 = new SalesHead(RequestHandler.SALES_HEAD);

      	handler1.setNextHandler(handler2);
      	handler2.setNextHandler(handler3);
      	return handler1;	
   }

	public static void main(String[] args) {
		RequestHandler chain = getChainOfHandlers();

		chain.handleRequest(4300, "Stationary supplies");
		chain.handleRequest(28000, "New PC");
		chain.handleRequest(100000, "New vehicle");		
	}
}
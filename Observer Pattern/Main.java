class Main {
	public static void main(String[] args) {
		Stock stock = new Stock();	
		Investor bob = new Investor("Bob");
		Investor alice = new Investor("Alice");
		stock.attach(bob);
		stock.attach(alice);
		stock.setState(100);
		stock.detach(bob);
		stock.setState(200);
	}
}
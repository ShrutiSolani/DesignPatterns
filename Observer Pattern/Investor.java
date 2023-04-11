public class Investor {
	String name;
	Investor(String name){
		this.name = name;
	}

	public void update(double price){
		System.out.println(this.name + " received an update of stock price changed to "+ price);
	}
}
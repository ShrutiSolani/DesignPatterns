import java.util.ArrayList;
import java.util.List;

public class Stock {
	private List<Investor> investors = new ArrayList<Investor>();
   	private double price;

   	public double getState() {
      return price;
   	}

   	public void setState(double price) {
      this.price = price;
      notifyAllInvestors();
   	}

   	public void attach(Investor investor){
      investors.add(investor);		
   	}

   	public void detach(Investor investor){
   		investors.remove(investor);
   	}

   	public void notifyAllInvestors(){
      for (Investor investor : investors) {
      	investor.update(price);
      }
  } 	
}
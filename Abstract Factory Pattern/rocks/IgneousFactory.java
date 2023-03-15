package rocks;

public class IgneousFactory extends AbstractFactory {
	@Override
	public Rock getRock(String rockName){
		if(rockName.toLowerCase().equals("granite")){
			return new Granite();
		}
		else if(rockName.toLowerCase().equals("basalt")){
			return new Basalt();
		}
		else{
			return null;
		}
	}
}
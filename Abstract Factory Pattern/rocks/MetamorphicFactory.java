package rocks;

public class MetamorphicFactory extends AbstractFactory {
	@Override
	public Rock getRock(String rockName){
		if(rockName.toLowerCase().equals("quartzite")){
			return new Quartzite();
		}
		else if(rockName.toLowerCase().equals("marble")){
			return new Marble();
		}
		else{
			return null;
		}
	}
}
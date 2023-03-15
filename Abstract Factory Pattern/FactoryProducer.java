import rocks.AbstractFactory;
import rocks.IgneousFactory;
import rocks.MetamorphicFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(boolean isIgneous){
		if(isIgneous){
			return new IgneousFactory();
		}
		else{
			return new MetamorphicFactory();
		}
	}
}
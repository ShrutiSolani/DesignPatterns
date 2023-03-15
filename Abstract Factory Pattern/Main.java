import rocks.AbstractFactory;
import rocks.Rock;

public class Main {
	public static void main(String[] args) {
		AbstractFactory obj1 = FactoryProducer.getFactory(true);
		AbstractFactory obj2 = FactoryProducer.getFactory(false);
		Rock graniteObj = obj1.getRock("GRANITE");
		Rock basaltObj = obj1.getRock("Basalt");
		Rock marbleObj = obj2.getRock("MaRBle");
		Rock quarObj = obj2.getRock("quartzite");
		graniteObj.sayHI();
		basaltObj.sayHI();
		marbleObj.sayHI();
		quarObj.sayHI();
	}
}
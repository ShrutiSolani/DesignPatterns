import rocks.RockFactory;
import rocks.Rock;

public class RockMain {
	public static void main(String[] args) {
		RockFactory rock = new RockFactory();	

		Rock ig = rock.getRock("Igneous");
		ig.define();
		ig.example();

		Rock sd = rock.getRock("SEDIMENTARY");
		sd.define();
		sd.example();

		Rock mm = rock.getRock("MetaMorphic");
		mm.define();
		mm.example();
	}
}
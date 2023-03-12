package rocks;

public class Sedimentary implements Rock {

	@Override
	public void define() {
		System.out.println("The sedimentary rocks are formed by the deposition and subsequent cementation of that material within bodies of water and at the surface of the earth.");
	}

	@Override
	public void example() {
		System.out.println("Sedimentary rock eg. - Sandstone");
	}
} 
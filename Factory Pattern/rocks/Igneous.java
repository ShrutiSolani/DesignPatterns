package rocks;

public class Igneous implements Rock {

	@Override
	public void define() {
		System.out.println("Igneous rocks are defined as types of rocks that are formed when molten rock cools to a solid state.");
	}

	@Override
	public void example() {
		System.out.println("Igneous rock eg. - Granite");
	}
} 
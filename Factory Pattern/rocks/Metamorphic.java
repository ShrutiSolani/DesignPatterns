package rocks;

public class Metamorphic implements Rock {

	@Override
	public void define() {
		System.out.println("Metamorphic rocks arise from the transformation of existing rock types, in a process called metamorphism, which means 'change in form'.");
	}

	@Override
	public void example() {
		System.out.println("Metamorphic rock eg. - Marble");
	}
} 
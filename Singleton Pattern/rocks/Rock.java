package rocks;

public class Rock {
	public static Rock object = new Rock();

	private Rock(){

	}

	public static Rock getInstance() {
		return object;
	}

	public static void define() {
		System.out.println("Definition");
		System.out.println("A rock is a natural substance composed of solid crystals of different minerals that have been fused together into a solid lump.");
	}

	public static void example() {
		System.out.println("Example");
		System.out.println("Limestone");
	}
}
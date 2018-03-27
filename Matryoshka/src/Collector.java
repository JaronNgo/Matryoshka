
public class Collector {

	public static void main(String[] args) {
		Matryoshka innerDoll = new Matryoshka();
		Matryoshka two = new Matryoshka(innerDoll);
		Matryoshka three = new Matryoshka(two);
		
		System.out.println(three.howManyDolls());
	}
}

public class Matryoshka {

	Matryoshka innerDoll;
	String name;
	java.awt.Color hair;
	boolean Babushka;
	
	// Constructor for no innerDoll
	public Matryoshka() {
		innerDoll = null;
	}
	
	// Constructor for an innerDoll
	public Matryoshka(Matryoshka innerDoll, String name, java.awt.Color hair, boolean Babushka){
		this.innerDoll = innerDoll;
		this.name = name;
		this.hair = hair;
		this.Babushka = Babushka;
	}
	
	// Does this object have an inner doll.
	public boolean hasInnerDoll(){
		return innerDoll != null;
	} 
	
	// Determine how many dolls are in this Matryoshka
	public int howManyDolls(){
		// base case
		if (!hasInnerDoll()){
			return 1; 
		}
		// recursive case
		return 1 + innerDoll.howManyDolls();
	}
	
	public int howManyWearingBabushkas(){
		if (!Babushka){
			return 1; 
		}
			return 1 + innerDoll.howManyWearingBabushkas();
	}
	
	public int redHeadCount(){
		if (java.awt.Color.RED == hair){
			return 1; 
		}
		// recursive case
		return 1 + innerDoll.redHeadCount();
	}
	
	public void lastName(){
		if (!innerDoll.hasInnerDoll()){
			return innerDoll.lastName(name);
		}
	}
	public void lastName(String end){
		if (end.compareTo.name = 0){
			name = end;
			return innerDoll.lastName(name;
		}
	}
}

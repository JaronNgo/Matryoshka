
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
	public Matryoshka(Matryoshka innerDoll){
		this.innerDoll = innerDoll;
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
	
	public boolean Babushka() {
		return false;
	}
	
	public boolean hasBabushkas(){
		return true;
	} 
	
	public boolean howManyWearingBabushkas() {
		if (!hasBabushkas()) {
			return false;
		}
		return true;
	}

	
	public void RedHead() {
		hair = null;
	}
	
	public void hasRedHead() {
		hair = java.awt.Color.RED;
	}
	public boolean redHeadCount() {
		if (hair == java.awt.Color.RED) {
			return true;
		}
		return false;
	}
	
	public boolean lastName() {
		if (!hasInnerDoll) {
			
		}
		
	}
}

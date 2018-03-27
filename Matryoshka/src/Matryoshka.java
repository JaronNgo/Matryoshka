
public class Matryoshka {

	Matryoshka innerDoll;
	
	// Constructor for no innerDoll
	public Matryoshka(){
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

}
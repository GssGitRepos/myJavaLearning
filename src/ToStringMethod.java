

/*The toString() method in Java is a pre-existing method found in the Object class.
 *  It serves the purpose of returning a string representation of an object.
 *   By default, it produces a string comprising the object's class name, followed by an "@" symbol and hash code.
 *   The toString() method returns the String representation of the object.

If you print any object, Java compiler internally invokes the toString() method on the object. 
So overriding the toString() method, returns the desired output, it can be the state of an object etc.
 depending on your implementation.
 * 
 */

class Frogs {
	private String name;
	private int id;
	
	public Frogs(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	/*
	public String toString() {                                 can also be done in this way
		return String.format("%-2d : %s", id, name);
		
	}
	*/
	public String toString() {
		StringBuilder sp = new StringBuilder();
		sp.append(id).append(": ").append(name);
		return sp.toString();
	}
	
}


public class ToStringMethod {
	public static void main(String[] args) {
		
		Frogs frog1 = new Frogs(5, "Roger");
		Frogs frog2 = new Frogs(7, "Bull");
		System.out.println(frog1);
		System.out.println(frog2);
	}

}

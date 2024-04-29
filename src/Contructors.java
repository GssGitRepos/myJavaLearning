
/* The code below is to understand the concept of constuctor in Java. The Contructor is a method 
 * of class when a new object of the class is created, the constuctor(method) will be automatically 
 * invoked.
 */

/* The constructor name i.e the method name should be same as class name.
 * 
 */

/* Also one constructor can be called from another constructor as well.
 * To do that the contructor to be called should be mentioned in the first line of the other.
 */

class Machine{
	private String name;
	private int warranty;
	
	public Machine(){
		
		this("mach");
		System.out.println("constructor1 is running");
		
	}
	
	
	/*
	 * Constructors are primarily used to initialize object attributes.
	 *  They do not return values, and specifying a return type for them 
	 *  can lead to compiler errors.
	 */
	
	public Machine(String name) {
		System.out.println("constructor2 is running!");
		this.name = name;
	}
	public Machine(String name , int warranty) {
		System.out.println("constructor3 is running!");
		this.name = name;
		this.warranty = warranty;
	}
}

public class Contructors {
	public static void main(String[] args) {
		Machine machine1 = new Machine();      // Here when a new object is created, constructor will be automatically called.
		
		/* There can be multiple constructors in a class with the same name
		 * Java will invoke the particlular constructor based on the parameters passed.
		 */
		Machine machine2 = new Machine("printer");
		Machine machine3 = new Machine("Mobile", 3);
		
	}

}

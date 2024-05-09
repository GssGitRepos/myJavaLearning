package Inheritance;

public class Car extends Machine{
	
	
	public void start() {
		System.out.println("This method overrides the inherited method.");      // when the inherited method needs to be overridden, the name of method should be same.
	}
	
	public void carInfo() {
		System.out.println(name + " : This is a car");      //Here if the variable 'name' is private, it cannot be accessed in the child class.
	}
	
	

}

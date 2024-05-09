package Inheritance;

public class InheritanceExample {
	public static void main(String[] args) {
		
		Machine mach1 = new Machine();
		mach1.start();
		mach1.stop();
		System.out.println();
		Car car1 = new Car();
		car1.start();
		car1.carInfo();
		car1.stop();
	}

}

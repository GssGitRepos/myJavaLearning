class Robot {
	String material = "Steel";
	String joints = "hinge";
	
	String getMaterial() {
		return material;

	}

	void speak() {
		System.out.println("Hello There!");
	}

	void jump(int height) {
		System.out.println("Jumping Height is:" + height + " metres");
	}

	void info(String name, int year) {
		System.out.println("Hello World! My Name is " + name + " and I am made in the year " + year + " by Sarath");

	}

	String speed(int memory) {
		String dialogue = "Speed is " + memory + " tera hertz";
		return dialogue;
	}
}

public class MethodParameters {
	public static void main(String[] args) {
	

		Robot chitti = new Robot();
		
		chitti.material = "Iron";
		String chittiMaterial = chitti.getMaterial();
		System.out.println(chittiMaterial);
		
		
		//getting variable value of the class using method 
		
		
		chitti.speak();

		// Passing parameter into the method

		chitti.jump(10);

		// passing multiple parameters into the method

		chitti.info("chitti", 2024);

		// passing parameter and printing the returned value

		System.out.println(chitti.speed(2));

	}

}

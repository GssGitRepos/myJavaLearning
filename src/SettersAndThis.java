class frog{
	
	// To prevent access to variables of a class directly, 
	//   they can be encapsulated by using keyword private
	
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	//The values for variables can be set by passing parameters into methods(setters)
	
	public String setName(String newName) {
		name = newName;
		return name;
	}
	public int setAge(int newAge) {
		age = newAge;
		return age;
	}
	
	//If same word has to be used as a parameter and variable "this" keyword can be used
	
	public String setNames(String name) {
		this.name = name;
		// Here "name" on left side indicates the variable of class and on right side indicates the parameter
		
		return name;
	}
	public int setAges(int age) {
		this.age = age;
		return age;
	}
}



public class SettersAndThis {
	public static void main(String[] args) {
		frog frog1 = new frog();
		
//		frog1.name = "froggy";
//		frog1.age = 2;
		
		System.out.println(frog1.getName());
		
		// setting a value using method
		
		String x= frog1.setName("Bull frog");
		System.out.println(x);
		int y = frog1.setAge(4);
		System.out.println(y);
		
		//after this keyword
		
		frog frog2 = new frog();
		
		frog2.setNames("African Frog");
		System.out.println(frog2.setNames("African Frog"));
		
	}

}

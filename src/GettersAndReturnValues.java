
class Person {
	 String name;
	int age;
	int height;
	String color;
	String gender;

//	when void is used to from a method, it means that the method will not return any value

	void speak() {
		System.out.println("Hello!");
	}

//	to make a method return some thing, instead of void int or other type should be used

	String say() {
		String say = "Hello! there!";
		return say;
	}

	int yearsForRetirementCalculator() {

		int yearsForRetirement = 60 - age;

		return yearsForRetirement;
	}
//	Instead of directly accessing the variables from class, they can returned from a method and used

	int getAge() {
		return age;
	}

	String getName() {
		return name;
	}

	String getColor() {
		return color;
	}
}

public class GettersAndReturnValues {
	public static void main(String[] args) {

		Person person1 = new Person();
		Person person2 = new Person();

		person1.name = "sai";
		person1.age = 25;
		person1.color = "Brown";
		person1.gender = "Male";
		person1.height = 6;
		
		person2.name = "Sita";
		person2.age = 27;
		person2.color = "White";
		person2.gender = "Female";
		person2.height = 5;

		String speak = person1.say();
		String speak2 = person2.say();
		int age = person1.getAge();
		int age2 = person2.getAge();
		String nam = person1.getName();
		String nam2 = person2.getName();
		int ret1 = person1.yearsForRetirementCalculator();
		int ret2 = person2.yearsForRetirementCalculator();
		
		

		System.out.println(speak + "\n");
		System.out.println(speak + "How are you. I am " + nam + " I am " + age + " years old.");
		System.out.println("I have " + ret1 + " years more to get retired." + "\n");
		System.out.println(speak2 + "How are you doing? I am " + nam2 + " I am " + age2 + " years old.");
		System.out.println("I have " + ret2 + " years more to get retired.");
	}

}

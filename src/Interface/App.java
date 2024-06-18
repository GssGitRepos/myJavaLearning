package Interface;

public class App {
	
	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.speak();
		person1.showInfo();

		System.out.println();
		
		Machine mach1 = new Machine("machine1");
		mach1.running();
		mach1.showInfo();
	}

}

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a command: ");

		String value = input.nextLine();
		
		/* The following if condition also works for same purpose
		 *  but dont know when to use switch case exactly
		 *  
		 * 
		int i = 10;
		
		if(value.equals("Sai")) {
			System.out.println("Hey Sai! How are you?");
		}else if(value.equals("Sarath")){
			System.out.println("oh Sarath! Is this you?");
		}else {
			System.out.println("Hello! Who are you?");
		}
		*/

		switch (value) {
		case "Sai":
			System.out.println("Hey Sai! How are you?");
			break;
		case "Sarath":
			System.out.println("Oh Sarath! Is this you?");
			break;
		default:
		System.out.println("Hello! Who are you?");
		}

	}

}
import java.util.Scanner;                        //ctrl + shift + o  - short cut for importing 

public class Dowhile {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);            

		String Value;
		String myName = "sarath";

		do {
			System.out.println("Enter a String : ");
			Value = scanner.nextLine();

		} while (!Value.equals(myName));

		System.out.println("Hey Sarath! Finally you gave value 5");

	}

}

import java.util.Scanner;

public class Userinput {
	public static void main(String[] args) {
		
		// create Scanner object(this needs to be imported in order to use)
		Scanner input = new Scanner(System.in);
		
		//print the prompt to take input
		System.out.println("Enter the value : ");
		
		//wait for the user to give input
		String value = input.nextLine();
		
		//Tell user what is entered
		System.out.println("The input given by you is : " + value );
		
//		if(value == "sarath") {
//			System.out.println("Hey! Hi Sarath");
//		}else {
//			System.out.println("you are not sarath");
//		}
				
				
		

	}

}

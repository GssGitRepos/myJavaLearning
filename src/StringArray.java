
public class StringArray {
	public static void main(String[] args) {
		String[] words = new String[5];
		words[0] = "word1";
		words[1] = "word2";
		words[2] = "word3";
		words[3] = "word4";
		words[4] = "word5";
		
		System.out.println("The following are the values of array \"words\"");
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}
		
		
		String[] fruits = {"Mango", "Guava", "Orange","Watermelon", "DragonFruit"};
		
		System.out.println("The following are the values in the \"fruits\" array");
		
//		The following is another way of looping through an array i.e by declaring some 
//		variable inside for and then colon and array name
		
		for(String input:fruits) {
			
			System.out.println(input);
			
		}
	}

}


public class StringBuilderAndStringFormatter {
	
	public static void main(String[] args) {
		
		
		// The following is inefficient method and consumes more memory
		String info = "";                               // Here an empty string is declared and in java String is immutable
		
		info += "Hello! I am Bob.";                     // In this line, the variable is not being changes but it is forming variable again with the new value
		info += "";                                     //Here also same as above line
		info += "I am a builder";                       //Here also same as above. So this is inefficient way of doing this since it consumes more memory
		System.out.println(info);
		System.out.println();
		
		//
		
		
		// The String Builder is efficient to perform same thing as above
		
		StringBuilder example = new StringBuilder("");
		
		example.append("Hello! I am Kick Buttoski.");
		example.append("");
		example.append("I am a kid.");
		
		System.out.println(example.toString());
		System.out.println();
		
		//
		
		// This can also be done in the following  way
		
		StringBuilder octopus = new StringBuilder();
		
		octopus.append("Hi there! I am Oswald.")
		.append("")
		.append("I am an octopus.");
		
		System.out.println(octopus.toString());
		System.out.println();
		
		//
		
		// String Formatting
		
		System.out.print("This is paragraph1.\t This is line2 in paragraph\nThis is second line");    // this is done while using print instead of println
		System.out.println();
		System.out.println();
		//
		
		
		
		System.out.printf("This is the cost mentioned as an integer : %d", 10 );
		System.out.println();
		System.out.printf("This is the cost mentioned as an integer : %5d. Quantity is : %5d", 10,120);
		System.out.println();
		for(int i=0;i<20;i++) {
			
			System.out.printf("The number is: %5d\n", i);   //This is right alignment mentioned in between % and d
			
		}
        for(int i=0;i<20;i++) {
			
			System.out.printf("The number is: %-5d\n", i);  //This is left alignment mentioned in between % and d
			
		}
		System.out.printf("String can also be passes into this: %s", "this is string");
		System.out.println();
		
		
		//formatting floating point value
		
		System.out.printf("This is a float value: %.2f" , 5.2764);       //Here .2 says that it has to take two values after decimal
		System.out.println();
		System.out.printf("This is a second float value: %20.4f" , 2536.276434563);   //Here .4 says that it has to take four values after decimal and 20 says the spaces or alignment
		
	}

}

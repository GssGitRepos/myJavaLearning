
public class Forloop {

	public static void main(String[] args) {
		String str = "The value in For Loop is : ";
		for (int i = 1; i <= 15; i++) {
			if (i == 7) {
				System.out.println("The value" + " " + i + " " + "is not going to be printed");
				continue;
				
			}else {
			System.out.println(str + i);
			}

		}

	}

}

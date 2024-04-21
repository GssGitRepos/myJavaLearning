
public class MultidimensionalArray {
	public static void main(String[] args) {

		int[] nums = new int[4];
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
		nums[3] = 4;

		for (int numValue : nums) {
			System.out.print(numValue + "\t");
		}
		System.out.println();
		System.out.println();

		String[][] multiArray = { { "Hi", "Hello!", "There!" }, { "How", "are", "you" },
				{ "I", "am", "sai", "sarath" } };

		for (int row = 0; row < multiArray.length; row++) {
			for (int col = 0; col < multiArray[row].length; col++) {
				System.out.print(multiArray[row][col] + "\t");
			}
			System.out.println();
		}

	}

}

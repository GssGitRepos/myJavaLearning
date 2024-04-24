import java.util.Scanner;

public class Scan{
    public static void main(String[] args){
        Scanner valueInput = new Scanner(System.in);
        System.out.println("Enter a value as an input : ");
        int value = valueInput.nextInt();
        System.out.println("The value you entered is: " + value);
    }
}
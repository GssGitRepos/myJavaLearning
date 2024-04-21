

public class Classes{
	public static void main(String[] args) {
		
		
		Ball footBall = new Ball();
		footBall.name = "Foot Ball";
		footBall.color = "white";
		footBall.shape = "circle";
		footBall.noOfPlayers = 11;
		footBall.pattern = "embedded with polygons";

		
		System.out.printf(footBall.name + "\t");
		System.out.printf(footBall.color  +  "\t");
		System.out.printf(footBall.pattern + "\t");
		System.out.printf(footBall.shape + "\t");
		System.out.printf(footBall.noOfPlayers + "\t");
		System.out.printf(footBall.pattern + "\t");
		System.out.println();
		footBall.info();
		
		
		Ball basketBall = new Ball();
		basketBall.name = "Basket Ball";
		basketBall.color = "Orange";
		basketBall.shape = "circle";
		basketBall.noOfPlayers = 6;
		basketBall.pattern = "stripes";
		System.out.printf(basketBall.name + "\t");
		System.out.printf(basketBall.color  +  "\t");
		System.out.printf(basketBall.pattern + "\t");
		System.out.printf(basketBall.shape + "\t");
		System.out.printf(basketBall.noOfPlayers + "\t");
		System.out.printf(basketBall.pattern + "\t");
		System.out.println();
		basketBall.info();
		
		
		Ball rugbyBall = new Ball();
		rugbyBall.name = "Rugby Ball";
		rugbyBall.color = "Saffron";
		rugbyBall.shape = "oval";
		rugbyBall.noOfPlayers = 12;
		rugbyBall.pattern = "stripe";
		System.out.printf(rugbyBall.name + "\t");
		System.out.printf(rugbyBall.color + "\t");
		System.out.printf(rugbyBall.shape + "\t");
		System.out.printf(rugbyBall.noOfPlayers + "\t");
		System.out.printf(rugbyBall.pattern + "\t");
		System.out.println();
		rugbyBall.info();
	}
}

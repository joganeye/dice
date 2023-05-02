import java.util.Random;

public class RollingDice {

	public static void main(String[] args) {
		
		Random Bro = new Random();
		int x = Bro.nextInt(6) + 1;
		
		System.out.println("You rolled a: " + x);
		
	}

}

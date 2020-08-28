import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class while_loop_practice {
	
	public static void main(String[] args) {
		
		int i = 0;
		
		while (i < 10) {
			System.out.println("Test");
			System.out.println(i);
			i++;
		}
		
		forLoop();
		modulo();
	}
	
	
	
	public static void forLoop() {
		
		// for (declare the variable, write a condition, increment) {do this}
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
	}
	
	public static void diceRoll() {
		Scanner scanner = new Scanner(System.in);
		String again;
		
		
		do {
			int num = ThreadLocalRandom.current().nextInt(1, 7);
			System.out.println("You rolled a " + num + ".");
			System.out.println("Roll again? y/n: ");
			again = scanner.next();
		} while (!again.equals("y"));
		// ! is a logical compliment operator, inverts the boolean.
		
	}
	
	//modulo operator which is the % sign, it displays the 'remainder' of a division.
	public static void modulo() {
		System.out.println(9%2);
	}

}

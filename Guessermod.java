import java.util.Random;
import java.util.Scanner;

public class Guessermod {

    public static void main(String[] args) {
		// pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        Scanner in = new Scanner(System.in);
        
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");
		System.out.print("Type a number ");
		int guess = in.nextInt();
		
		
		System.out.println("Your guess is: " + guess);
		System.out.println("The number I was thinking of is: " + number);
		int diff = guess - number;
		System.out.print("You were off by : " + diff);
	}

	
	public static int check (int n , int number) {
		if (n > number) { 
			System.out.println("Guess too high!");
			System.out.print("Try Again"); }
		else if (n < number) {
			System.out.print("Guess too low!");
			System.out.print("Try Again");
		} else {
			return n ; }

}
}



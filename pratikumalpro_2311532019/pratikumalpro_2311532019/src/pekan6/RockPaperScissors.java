package pekan6;


	import java.util.Random;
	import java.util.Scanner;

	public class RockPaperScissors {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        String[] choices = {"rock", "paper", "scissors"};

	        while (true) {
	            System.out.print("Enter your choice (rock, paper, or scissors) or 'exit' to end: ");
	            String userChoice = scanner.nextLine().toLowerCase();

	            if (userChoice.equals("exit")) {
	                System.out.println("Game ended. Goodbye!");
	                break;
	            }

	            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
	                System.out.println("Invalid choice. Please enter 'rock', 'paper', or 'scissors'.");
	                continue;
	            }

	            int computerIndex = random.nextInt(3);
	            String computerChoice = choices[computerIndex];

	            System.out.println("Computer's choice: " + computerChoice);

	            if (userChoice.equals(computerChoice)) {
	                System.out.println("It's a tie!");
	            } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
	                       (userChoice.equals("paper") && computerChoice.equals("rock")) ||
	                       (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
	                System.out.println("You win!");
	            } else {
	                System.out.println("You lose!");
	            }
	        }

	        scanner.close();
	    }
	}



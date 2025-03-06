import java.util.Scanner;

public class RockPaperScissors {

    // get AI choice
    public static String getAIChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        int index = (int) (Math.random() * 3);
        return choices[index];
    }

    // determine the winner
    public static String findWinner(String userChoice, String AIChoice) {
        if (userChoice.equals(AIChoice)) {
            return "Draw";
        }
        if ((userChoice.equals("rock") && AIChoice.equals("scissors")) ||
            (userChoice.equals("paper") && AIChoice.equals("rock")) ||
            (userChoice.equals("scissors") && AIChoice.equals("paper"))) {
            return "Player";
        }
        return "AI";
    }

    // 
    public static void displayStats(int playerWins, int AIWins, int totalGames) {
        double playerWinPercent = ((double) playerWins / totalGames) * 100;
        double AIWinPercent = ((double) AIWins / totalGames) * 100;

        System.out.println("\nGame Stats:");
        System.out.println("----------------------------");
        System.out.printf("Player Wins: %d (%.2f%%)\n", playerWins, playerWinPercent);
        System.out.printf("AI Wins: %d (%.2f%%)\n", AIWins, AIWinPercent);
        System.out.printf("Draws: %d\n", totalGames - playerWins - AIWins);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of games you want to play: ");
        int numGames = sc.nextInt();
        sc.nextLine();

        int playerWins = 0, AIWins = 0;

        System.out.println("\nRock-Paper-Scissors Game");
        System.out.println("----------------------------");
        
        for (int i = 1; i <= numGames; i++) {
            System.out.print("Game " + i + " - Enter your choice (rock, paper, scissors): ");
            String userChoice = sc.nextLine().toLowerCase();

            while (!(userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors"))) {
                System.out.print("Invalid choice. Enter rock, paper, or scissors: ");
                userChoice = sc.nextLine().toLowerCase();
            }

            String AIChoice = getAIChoice();
            System.out.println("AI choice: " + AIChoice);

            String winner = findWinner(userChoice, AIChoice);
            if (winner.equals("Player")) {
                playerWins++;
            } else if (winner.equals("AI")) {
                AIWins++;
            }

            System.out.println("Result: " + (winner.equals("Draw") ? "It's a draw!" : winner + " wins!"));
            System.out.println("----------------------------");
        }

        displayStats(playerWins, AIWins, numGames);
    }
}


// Sampe cases
//Enter the number of games you want to play: 2

// Rock-Paper-Scissors Game
// ----------------------------
// Game 1 - Enter your choice (rock, paper, scissors): rock
// AI choice: rock
// Result: It's a draw!
// ----------------------------
// Game 2 - Enter your choice (rock, paper, scissors): paper
// AI choice: paper
// Result: It's a draw!
// ----------------------------

// Game Stats:
// ----------------------------
// Player Wins: 0 (0.00%)
// AI Wins: 0 (0.00%)
// Draws: 2
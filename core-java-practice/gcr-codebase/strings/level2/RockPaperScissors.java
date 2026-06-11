import java.util.Scanner;

public class RockPaperScissors {

    public static String getComputerChoice() {
        double r = Math.random();
        if (r < 0.33) {
            return "rock";
        } else if (r < 0.66) {
            return "paper";
        } else {
            return "scissors";
        }
    }

    public static String findWinner(String player, String computer) {
        if (player.equals(computer)) {
            return "Tie";
        }
        if (player.equals("rock")) {
            if (computer.equals("scissors")) return "Player";
            else return "Computer";
        }
        if (player.equals("paper")) {
            if (computer.equals("rock")) return "Player";
            else return "Computer";
        }
        if (player.equals("scissors")) {
            if (computer.equals("paper")) return "Player";
            else return "Computer";
        }
        return "Tie";
    }

    public static String[][] calculateStats(int playerWins, int computerWins, int totalGames) {
        String[][] stats = new String[3][3];
        stats[0][0] = "Player Wins";
        stats[0][1] = String.valueOf(playerWins);
        stats[0][2] = String.valueOf(Math.round((playerWins * 100.0) / totalGames)) + "%";

        stats[1][0] = "Computer Wins";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.valueOf(Math.round((computerWins * 100.0) / totalGames)) + "%";

        int ties = totalGames - playerWins - computerWins;
        stats[2][0] = "Ties";
        stats[2][1] = String.valueOf(ties);
        stats[2][2] = String.valueOf(Math.round((ties * 100.0) / totalGames)) + "%";

        return stats;
    }

    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("+--------+--------------+--------------+--------+");
        System.out.printf("| %-6s | %-12s | %-12s | %-6s |\n", "Game", "Player", "Computer", "Winner");
        System.out.println("+--------+--------------+--------------+--------+");
        for (int i = 0; i < gameResults.length; i++) {
            System.out.printf("| %-6s | %-12s | %-12s | %-6s |\n",
                    (i + 1), gameResults[i][0], gameResults[i][1], gameResults[i][2]);
        }
        System.out.println("+--------+--------------+--------------+--------+");

        System.out.println("\nFinal Statistics:");
        System.out.println("+---------------+---------------+-------+");
        System.out.printf("| %-13s | %-13s | %-5s |\n", "Category", "Count", "Percent");
        System.out.println("+---------------+---------------+-------+");
        for (String[] row : stats) {
            System.out.printf("| %-13s | %-13s | %-5s |\n", row[0], row[1], row[2]);
        }
        System.out.println("+---------------+---------------+-------+");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games to play: ");
        int games = sc.nextInt();
        sc.nextLine();

        String[][] gameResults = new String[games][3];
        int playerWins = 0, computerWins = 0;

        for (int i = 0; i < games; i++) {
            System.out.print("Game " + (i + 1) + " - Enter your move (rock/paper/scissors): ");
            String player = sc.nextLine().toLowerCase();

            while (!player.equals("rock") && !player.equals("paper") && !player.equals("scissors")) {
                System.out.print("Invalid! Enter rock, paper, or scissors: ");
                player = sc.nextLine().toLowerCase();
            }

            String computer = getComputerChoice();
            String winner = findWinner(player, computer);

            gameResults[i][0] = player;
            gameResults[i][1] = computer;
            gameResults[i][2] = winner;

            if (winner.equals("Player")) playerWins++;
            else if (winner.equals("Computer")) computerWins++;
        }

        String[][] stats = calculateStats(playerWins, computerWins, games);
        displayResults(gameResults, stats);
    }
}

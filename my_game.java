import java.util.*;

public class prac {
    public static void main(String[] args) {
        Random rm = new Random();
        Scanner sc = new Scanner(System.in);
        int num, ranum;
        int countU = 0, countC = 0, countD = 0;

        System.out.println("\nROCK, PAPER, SCISSORS GAME:\n\n1=ROCK\n2=Paper\n3=SCISSORS\n");
        System.out.print("Enter the number of rounds you want to play: ");
        int rounds = sc.nextInt();
        System.out.println("");

        // Loop starts here
        for (int i = 0; i < rounds; i++) {
            System.out.print("Enter your choice: ");
            num = sc.nextInt();
            while (num < 1 || num > 3) {
                System.out.println("Invalid input. Please enter 1, 2, or 3 only.");
                System.out.print("Enter your choice: ");
                num = sc.nextInt();
            }
            ranum = rm.nextInt(3) + 1;

            // Game logic for Rock, Paper, Scissors
            if (num == 1) {
                if (ranum == 1) {
                    System.out.println("You both chose Rock! (Draw)\n");
                    countD++;
                } else if (ranum == 2) {
                    System.out.println("You chose Rock and the Computer chose Paper! (Computer won)\n");
                    countC++;
                } else if (ranum == 3) {
                    System.out.println("You chose Rock and the Computer chose Scissors! (You won)\n");
                    countU++;
                }
            } else if (num == 2) {
                if (ranum == 1) {
                    System.out.println("You chose Paper and the Computer chose Rock! (You won)\n");
                    countU++;
                } else if (ranum == 2) {
                    System.out.println("You both chose Paper! (Draw)\n");
                    countD++;
                } else if (ranum == 3) {
                    System.out.println("You chose Paper and the Computer chose Scissors! (Computer won)\n");
                    countC++;
                }
            } else if (num == 3) {
                if (ranum == 1) {
                    System.out.println("You chose Scissors and the Computer chose Rock! (Computer won)\n");
                    countC++;
                } else if (ranum == 2) {
                    System.out.println("You chose Scissors and the Computer chose Paper! (You won)\n");
                    countU++;
                } else if (ranum == 3) {
                    System.out.println("You both chose Scissors! (Draw)\n");
                    countD++;
                }
            }
        }
        // Loop ends here

        // Tournament result
        System.out.println("\nTOURNAMENT RESULT:\n");
        if (countU == countC) {
            System.out.println("The tournament is a draw!");
        } else if (countU > countC) {
            System.out.println("You won the tournament!");
        } else {
            System.out.println("The Computer won the tournament!");
        }

        // Display the final scores
        System.out.println("Your score: " + countU);
        System.out.println("Computer's score: " + countC);
        System.out.println("Number of draws: " + countD);
        System.out.println("\n");

        sc.close();
    }
}

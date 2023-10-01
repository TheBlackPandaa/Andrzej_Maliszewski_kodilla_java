package com.kodilla.rps;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Engine {

    static String name;
    static int roundsCount;

    static int playerScore;
    static int computerScore;

    public static void introduction() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, insert your name: ");
        name = scan.nextLine();
        System.out.println("""
                Instruction:\s
                1 - rock
                2 - paper
                3 - scissors
                x - end game
                n - new game""");
    }
    public static void game(){
        playerScore = 0;
        computerScore =0;
        Scanner scan = new Scanner(System.in);
        System.out.println(name + "! how many points is needed to win the game ?");
        roundsCount = scan.nextInt();
        boolean end = false;
        System.out.println(name + " " + playerScore + " - " + computerScore + " Computer");
        while(!end) {
            int roundResult = 0;
            System.out.println("make your move");
            int move = scan.nextInt();
            if(move == 1) roundResult = Rock.rock();
            if(move == 2) roundResult = Paper.paper();
            if(move == 3) roundResult = Scissors.scissors();
            if(roundResult == 1) playerScore = playerScore + 1;
            if(roundResult == 2) computerScore = computerScore +1;
            System.out.println("Score : " +  name + " " + playerScore + " - " + computerScore + " Computer");
            if (playerScore == roundsCount || computerScore == roundsCount) {
                end = true;
            }
        }
    }
    public static void endGameDecision() {
        Scanner scan = new Scanner(System.in);

            if (playerScore > computerScore) System.out.println("You won! Do you want to play again ? : ");
            if(playerScore < computerScore) System.out.println("Computer won! Do you want to play again ? : ");
            String decision;
            decision = scan.next();
            if (Objects.equals(decision, "n")) game();
            if (Objects.equals(decision, "x")) {
                System.out.println("are you sure you want to quit ?");
                String decision2;
                decision2 = scan.next();
                if(Objects.equals(decision2, "y")) System.exit(0);
                if(Objects.equals(decision2,"n")) endGameDecision();
            }
    }
}

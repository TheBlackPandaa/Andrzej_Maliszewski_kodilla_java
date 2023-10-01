package com.kodilla.rps;

import java.util.Random;

public class Scissors {
    public static int scissors(){
        int result = 0;
        Random random = new Random();
        int rand = 0;
        while (true){
            rand = random.nextInt(4);
            if(rand !=0) break;
        }
        if(rand == 1) {
            System.out.println("Computer wins!");
            result = 2;
        }
        if(rand == 2) {
            System.out.println("You win!");
            result = 1;
        }
        if(rand == 3) System.out.println("Draw!");

        return result;
    }
}

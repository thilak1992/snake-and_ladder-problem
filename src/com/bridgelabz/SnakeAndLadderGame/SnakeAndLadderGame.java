package com.bridgelabz.SnakeAndLadderGame;

import java.util.Random;

public class SnakeAndLadderGame {

    int rollOutput,option,numberOfTimesDieRolled=0;

        public static void main(String[] args) {
            System.out.println("Welcome to Snake and Ladder Game ");
            System.out.println("Player 1 :"+player1());
            System.out.println("Player 2 :"+player2());

            if (player1()>player2()){
                System.out.println("Player1 one won !");
            }
            else {
                System.out.println("Player2 one won !");
            }
        }


    private static int player1() {
        int player1Position=0,rollOutput,numberOfTimesDieRolledbyPlayer1=0;
        Random rand=new Random();
        while (player1Position!=100){
            rollOutput = rand.nextInt(6);
            int option=rand.nextInt(3);

            switch (option) {
                case 0:
                    player1Position += 0;
                    break;
                case 1:
                    player1Position = player1Position - rollOutput + 1;
                    if (player1Position < 0) {
                        player1Position = 0;
                    }
                    break;
                case 2:
                    player1Position += rollOutput + 1;
                    break;
            }
            if (player1Position == 100){
                break;}
            numberOfTimesDieRolledbyPlayer1++;
        }
        return numberOfTimesDieRolledbyPlayer1;
    }

    private static int player2() {
        int player2Position=0,rollOutput,numberOfTimesDieRolledbyPlayer2=0;
        Random rand=new Random();
        while (player2Position!=100){
            rollOutput = rand.nextInt(6);
            int option=rand.nextInt(3);

            switch (option) {
                case 0:
                    player2Position += 0;
                    break;
                case 1:
                    player2Position = player2Position - rollOutput + 1;
                    if (player2Position < 0) {
                        player2Position = 0;
                    }
                    break;
                case 2:
                    player2Position += rollOutput + 1;
                    break;
            }
            if (player2Position == 100){
                break;}
            numberOfTimesDieRolledbyPlayer2++;
        }
        return numberOfTimesDieRolledbyPlayer2;
    }
}

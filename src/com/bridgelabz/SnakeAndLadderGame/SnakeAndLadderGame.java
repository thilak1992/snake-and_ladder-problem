package com.bridgelabz.SnakeAndLadderGame;

import java.util.Random;

public class SnakeAndLadderGame {

        public static void main(String[] args) {
            System.out.println("Welcome to Snake and Ladder Game ");
            int playerPosition=0;
            System.out.println("Starting player position is "+playerPosition+" ; Player rolls die");
            Random rand=new Random();
            int rollOutput,option,numberOfTimesDieRolled=0;


            while (playerPosition!=100){
                rollOutput = rand.nextInt(6);
                //System.out.println("Die output : " + (rollOutput+1));
                //checking option No play, Snake and Ladder
                option=rand.nextInt(3);

                switch (option) {
                    case 0:
                        //System.out.println("No Play");
                        playerPosition += 0;
                        break;
                    case 1:
                        //System.out.println("Snake");
                        playerPosition = playerPosition - rollOutput + 1;
                        if (playerPosition < 0) {
                            playerPosition = 0;
                        }
                        break;
                    case 2:
                        //System.out.println("Ladder");
                        playerPosition += rollOutput + 1;
                        break;
                }
                if (playerPosition == 100){
                    System.out.println("Player at winning position :"+playerPosition);
                    break;}
                numberOfTimesDieRolled++;
            }
            System.out.println("Number of times die Rolled to Win game : "+numberOfTimesDieRolled);
        }
}

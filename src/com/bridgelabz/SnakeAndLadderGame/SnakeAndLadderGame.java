package com.bridgelabz.SnakeAndLadderGame;

import java.util.Random;

public class SnakeAndLadderGame {

        public static void main(String[] args) {
            System.out.println("Welcome to Snake and Ladder Game ");
            int playerPosition=0;
            System.out.println("Starting player position is "+playerPosition+" ; Player rolls die");
            Random rand=new Random();
            int rollOutput;
            rollOutput= rand.nextInt(6);
            if (rollOutput ==0){
                rollOutput =1;
            }
            System.out.println("Die output : "+rollOutput);
        }
}

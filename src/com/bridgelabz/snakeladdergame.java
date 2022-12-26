package com.bridgelabz;

public class snakeladdergame {
    static final int START_POSITION = 0;
    static final int FINAL_POSITION = 100;
    static int diceRoll() {
        int x = (int) (1+ Math.random() * 6);
        return x;
    }


    public static void main(String[] args) {
        System.out.println("welcome to snake ladder game");
       diceRoll();

    }
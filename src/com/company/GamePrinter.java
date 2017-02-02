package com.company;

public class GamePrinter {

    public static void printWelcome(){
        System.out.println("Welcome!");
    }

    public static void printInstructions(){
        System.out.println("Choose a letter:");
    }

    public static void printFinalResult(GameState game){
        GamePrinter.printCurrentResult(game.getCurrentResult());
        if(game.hasWon()) {
            System.out.println("You've won!");
        }else{
            System.out.println("You've lost!");
        }


    }

    public static void printCurrentResult(String currentResult){
        System.out.println("The current word : " + currentResult);
    }
}

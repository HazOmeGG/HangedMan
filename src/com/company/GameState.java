package com.company;

import java.util.ArrayList;
import java.util.List;

public class GameState {
    private String word;
    private boolean[] success;
    private int attempts;
    private List<Character> usedLetters = new ArrayList<>();

    public GameState() {

        Dictionary dictionary = new Dictionary();

        this.word = dictionary.getRandomWord();

        this.success = new boolean[word.length()];

    }

    public void addUsedLetter(Character letter){
        if(!isUsedLetter(letter)){
            usedLetters.add(letter);
        }
    }

    public boolean isUsedLetter(Character letter){
        if(usedLetters.contains(letter)){
            return true;
        }else{
            return false;
        }
    }

    public String getCurrentResult() {

        String result = "";

        for (int i = 0; i < word.length(); i++) {
            if (success[i] == false) {
                result = result + "_ ";
            } else {
                result = result + word.charAt(i);
            }
        }

        result = result + System.lineSeparator();
        result = result + "You have " + (10 - attempts) + " attempts left.";

        dibujarPersonaje();

        return result;
    }

    private void dibujarPersonaje() {
        switch (10-attempts) {
            case 9:
                System.out.println(" ---------------------");
                break;
            case 8:
                System.out.println(" ---------------------");
                System.out.println(" |                    ");
                System.out.println(" |                    ");
                System.out.println(" |                    ");
                System.out.println(" |                    ");
                System.out.println(" |                    ");
                System.out.println(" |                    ");
                for (int j = 0; j<15; j++) {
                    System.out.println(" |");

                }break;
            case 7:
                System.out.println(" ---------------------");
                System.out.println(" |                    ");
                System.out.println(" |                    ");
                System.out.println(" |                    ");
                System.out.println(" |                    ");
                System.out.println(" |                    ");
                System.out.println(" |                    ");
                for (int j = 0; j<15; j++) {
                System.out.println(" |");

            } System.out.println("__________");
                break;

            case 6:
                System.out.println(" ---------------------");
                System.out.println(" | /                  ");
                System.out.println(" |/                   ");
                System.out.println(" |                    ");
                System.out.println(" |                    ");
                System.out.println(" |                    ");
                System.out.println(" |                    ");
                for (int j = 0; j <15; j++) {
                System.out.println(" |");

            }
            System.out.println("__________");
            break;

            case 5:
                System.out.println(" ---------------------");
                System.out.println(" | /                  |");
                System.out.println(" |/                   |");
                System.out.println(" |                 -------");
                System.out.println(" |                | -  -  |");
                System.out.println(" |                |   o   |");
                System.out.println(" |                 -------");
                for (int j = 0; j <10; j++) {
                System.out.println(" |");

            }
            System.out.println("__________");
            break;

            case 4:
                System.out.println(" ---------------------");
                System.out.println(" | /                  |");
                System.out.println(" |/                   |");
                System.out.println(" |                 -------");
                System.out.println(" |                | -  -  |");
                System.out.println(" |                |   o   |");
                System.out.println(" |                 -------");
                System.out.println(" |                    |   ");
                System.out.println(" |                    |   ");
                System.out.println(" |                    |   ");
                System.out.println(" |                    |   ");
                System.out.println(" |                    |   ");
                for (int j = 0; j< 5; j++) {
                System.out.println(" |");

            }
            System.out.println("__________");
            break;

            case 3:
                System.out.println(" ---------------------");
                System.out.println(" | /                  |");
                System.out.println(" |/                   |");
                System.out.println(" |                 -------");
                System.out.println(" |                | -  -  |");
                System.out.println(" |                |   o   |");
                System.out.println(" |                 -------");
                System.out.println(" |                    |   ");
                System.out.println(" |                  / |   ");
                System.out.println(" |                 /  |   ");
                System.out.println(" |                /   |   ");
                System.out.println(" |                    |   ");
                for (int j = 0; j < 5; j++) {
                System.out.println(" |");

            }
            System.out.println("__________");
            break;

            case 2:
                System.out.println(" ---------------------");
                System.out.println(" | /                  |");
                System.out.println(" |/                   |");
                System.out.println(" |                 -------");
                System.out.println(" |                | -  -  |");
                System.out.println(" |                |   o   |");
                System.out.println(" |                 -------");
                System.out.println(" |                    |   ");
                System.out.println(" |                  / | \\ ");
                System.out.println(" |                 /  |   \\ ");
                System.out.println(" |                /   |     \\ ");
                System.out.println(" |                    |   ");
                for (int j = 0; j < 5; j++) {
                System.out.println(" |");

            }
            System.out.println("__________");
            break;

            case 1:
                System.out.println(" ---------------------");
                System.out.println(" | /                  |");
                System.out.println(" |/                   |");
                System.out.println(" |                 -------");
                System.out.println(" |                | -  -  |");
                System.out.println(" |                |   o   |");
                System.out.println(" |                 -------");
                System.out.println(" |                    |   ");
                System.out.println(" |                  / | \\ ");
                System.out.println(" |                 /  |   \\ ");
                System.out.println(" |                /   |     \\ ");
                System.out.println(" |                    |   ");
                System.out.println(" |                   /  ");
                System.out.println(" |                  /      ");
                System.out.println(" |                 /       ");
                for (int j = 0; j <2; j++) {
                System.out.println(" |");

            }
            System.out.println("__________");
            break;

            case 0:
                System.out.println(" ---------------------");
                System.out.println(" | /                  |");
                System.out.println(" |/                   |");
                System.out.println(" |                 -------");
                System.out.println(" |                | X  X  |");
                System.out.println(" |                |   o   |");
                System.out.println(" |                 -------");
                System.out.println(" |                    |   ");
                System.out.println(" |                  / | \\ ");
                System.out.println(" |                 /  |   \\ ");
                System.out.println(" |                /   |     \\ ");
                System.out.println(" |                    |   ");
                System.out.println(" |                   / \\");
                System.out.println(" |                  /   \\  ");
                System.out.println(" |                 /     \\ ");
                for (int j = 0; j < 2; j++) {
                System.out.println(" |");

            }
            System.out.println("__________");
            System.out.println("GAME OVER");
            break;
        }
    }

    public boolean isOver(){

        boolean pendingLetter = false;

        for(int i = 0; i<success.length; i++) {
            if (success[i] == false) {
                pendingLetter = true;
                break;
            }
        }

        if((pendingLetter == true && attempts ==10) || pendingLetter == false){
            return true;
        }else {
            return false;
        }
    }

    public void checkLetter(char letter){

        if(isUsedLetter(letter)){
            attempts++;
            System.out.println("This letter is repeated.");
            return;
        }else{
            addUsedLetter(letter);
        }
        int coincidence = 0;

        for(int i = 0; i<word.length(); i++){
            if(word.charAt(i) == letter){
                success[i] = true;
                coincidence++;
            }
        }
        if(coincidence==0){
            attempts++;
            System.out.println("This letter doesn't match.");
        } else{
            System.out.println("This letter matches!");
        }
    }

    public boolean hasWon(){
        if(isOver() && attempts <10){
            return true;
        }else{
            return false;
        }
    }
}
package com.booleanuk;

import java.util.ArrayList;
import java.util.Arrays;

public class Scrabble {

    private String word;

    ArrayList<Character> scoreOne = new ArrayList<>(Arrays.asList('A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T'));
    ArrayList<Character> scoreTwo = new ArrayList<>(Arrays.asList('D', 'G'));
    ArrayList<Character> scoreThree = new ArrayList<>(Arrays.asList('B', 'C', 'M', 'P'));
    ArrayList<Character> scoreFour = new ArrayList<>(Arrays.asList('F', 'H', 'V', 'W', 'Y'));
    ArrayList<Character> scoreFive = new ArrayList<>(Arrays.asList('K'));
    ArrayList<Character> scoreEight = new ArrayList<>(Arrays.asList('J', 'X'));
    ArrayList<Character> scoreTen = new ArrayList<>(Arrays.asList('Q', 'Z'));

    public Scrabble(String word) {
        this.word = word.toUpperCase();
    }

    public int score() {
        int result = 0;
        for(int i = 0; i < word.length(); ++i){
            if(scoreOne.contains(word.charAt(i))){
                result += 1;
            }
            else if(scoreTwo.contains(word.charAt(i))){
                result += 2;
            }
            else if(scoreThree.contains(word.charAt(i))){
                result += 3;
            }
            else if(scoreFour.contains(word.charAt(i))){
                result += 4;
            }
            else if(scoreFive.contains(word.charAt(i))){
                result += 5;
            }
            else if(scoreEight.contains(word.charAt(i))){
                result += 8;
            }
            else if(scoreTen.contains(word.charAt(i))){
                result += 10;
            }
        }
        return result;
    }

}

package src;
import java.util.Random;
import java.util.Scanner;

public class WordScramble extends Game {

    //constructor
    public WordScramble(String name){
        super(name);
    }

    private String[] words = {"computer", "programming", "java", "game", "challenge"};

    //method for starting word scramble game
    public void start(){
        System.out.println("\n---" + getName() + "---");
        System.out.println("Unscramble the word!");
    }

    //method for playing word scramble game
    public void play(Scanner input){
        Random rand = new Random();
        String word = words[rand.nextInt(words.length)];
        String scrambled = scramble(word);

        System.out.println("Unscramble the word: " + scrambled);

        String guess = "";
        boolean valid = false;


        while (!valid){
            try {
                System.out.println("Your guess:");
                guess = input.nextLine().toLowerCase();
                if (guess.equalsIgnoreCase(word)){
                    System.out.println("Correct! The word was " + word);
                    valid = true;
                }
                else if (guess.equalsIgnoreCase("quit")){
                    System.out.println("Returning to Main Menu!");
                    valid = true;
                }
                else {
                    System.out.println("Incorrect! Try again or type quit to return to main menu.");
                }
            }
            catch (Exception e){
                System.out.println("Invalid input. Please enter a valid guess!");
                continue;
            }
        }
    }

    private String scramble(String word){
        char[] letters = word.toCharArray();
        Random rand = new Random();
        for (int i = 0; i < letters.length; i++){
            int j = rand.nextInt(letters.length);
            char temp = letters[i];
            letters[i] = letters[j];
            letters[j] = temp;
        }
        return new String(letters);
    }
}
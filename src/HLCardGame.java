package src;
import java.util.Random;
import java.util.Scanner;

public class HLCardGame extends Game {

    //constructor
    public HLCardGame(String name){
        super(name);
    }

    public void start(){
        System.out.println("Starting " + getName() + " Game");

    }

    public void play(Scanner input){
        Random rand = new Random();

        boolean playAgain = true;
        
        while(playAgain){
            int card1 = rand.nextInt(13) + 1;
            System.out.println("your card is: " + card1);

            String guess = "";
            boolean valid = false;
            while(!valid){
                try{
                    System.out.println("Will the next card be high, or low? (Type 'H', 'L', 'NEW' for a new card, or 'quit' to return to main menu)");
                    guess = input.nextLine().trim().toUpperCase();

                    if(!guess.equals("H") && !guess.equals("L") && !guess.equals("QUIT") && !guess.equals("NEW")){
                        throw new IllegalArgumentException();
                    }
                    int card2 = rand.nextInt(13) + 1;
                    System.out.println("the next card is: " + card2);

                    boolean isHigh = card2 > card1;

                    if ((isHigh && guess.equals("H")) || (!isHigh && guess.equals("L"))){
                        System.out.println("you guessed correctly!!");
                    }
                    else if (guess.equals("QUIT")){
                        System.out.println("Returning to Main Menu!");
                        playAgain = false;
                        break;
                    }
                    else if(guess.equals("NEW")){
                        System.out.println("giving a new origional card!");
                        card1 = rand.nextInt(13) + 1;
                        System.out.println("your new card is: " + card1);
                    }
                    else {
                        System.out.println("you guessed incorrectly. Better luck next time!");
                    }

                    

                }
                catch(Exception e){
                    System.out.println("Invalid input. Please enter 'H', 'L', 'NEW', or 'QUIT'.");
                }
            }

            
        }
    }

}

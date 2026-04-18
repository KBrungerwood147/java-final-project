package src;
import java.util.Random;
import java.util.Scanner;


public class GuessTheNumber extends Game{

    //constructor
    public GuessTheNumber(String name){
        super(name);
    }

    //overriding start method
    public void start(){
        System.out.println("\n---" + getName() + "---");
        System.out.println(" I am thinking of a number between 1 and 100.");
    }

    //overriding play method
    public void play(){
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int secret = rand.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        while(guess != secret){
            System.out.println("enter your guess:");
            guess = input.nextInt();
            attempts++;

            //if statement for guessing

            if (guess < secret){
                System.out.println("Too Low!");
            }
            else if (guess > secret){
                System.out.println("Too High!");
            }
        }
        System.out.println("Correct!!, You guessed it in: " + attempts + ", Congradulations");
        input.close();
    }

    
}

package src;

import java.util.Random;
import java.util.Scanner;


public class RPS extends Game {

    //fields
    int wins = 0;
    int ties = 0;
    int losses = 0;
    
    //constructor
    public RPS(String name){
        super(name);
    }

    //method overriding - start
    public void start(){
        System.out.println("\n---" + getName() + "---");
        System.out.println("Type Rock, Paper, or Scissors. Type quit to stop playing!");

    }

    //method overriding - play
    public void play(Scanner input){
        Random rand = new Random();

        //array of choices
        String[] choices = {"rock", "paper", "scissors"};
        String userChoice = "";

        //while loop to determine whether you guessed correctly
        while (true){
            System.out.println("your move!:");
            userChoice = input.next().toLowerCase();

            if (userChoice.equals("quit")){
                System.out.println("Going back to Main Menu!");
                System.out.println("Amount of wins: " + wins);
                System.out.println("Amount of ties: " + ties);
                System.out.println("Amount of losses: " + losses);
                break;
            }
            
            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")){
                System.out.println("Invalid choice.");
                continue;
            }

            //generating computer's choice
            String computerChoice = choices[rand.nextInt(3)];
            System.out.println("Computer chose:" + computerChoice);

            if (userChoice.equals(computerChoice)){
                System.out.println("it's a tie!");
                ties++;
            }
            else if((userChoice.equals("rock") && computerChoice.equals("scissors")) ||(userChoice.equals("paper") && computerChoice.equals("rock")) || (userChoice.equals("scissors") && computerChoice.equals("paper"))){
                System.out.println("you win!");
                wins++;
            }
            else{
                System.out.println("you lose!");
                losses++;
            }
        }
        
    }










}

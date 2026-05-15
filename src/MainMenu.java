
//main


package src;

import java.util.Scanner;

public class MainMenu{

    //fields
    private static int x = 0;



    //method for running main menu
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
            while(x == 0){
                System.out.println("""
                    Welcome to the Java Game Hub!!\n
                    -------------------------------------------------------------\n
                    Please select a game you would like to play!\n
                    1. Guess the Number\n
                    2. Rock, Paper, Scissors\n
                    3. Trivia Game\n
                    4. Word Scramble\n
                    5. High-Low Card Game\n
                    6. Quit
                """);
                    //handles error due to invalid input
                if(input.hasNextInt()){
                    //store user input for choice
                    int choice = input.nextInt();
                    input.nextLine();


                    //choice 1
                    if (choice == 1){
                        System.out.println("you have entered Guess The Number Game, Have Fun!");
                        Game guessing = new GuessTheNumber("guess the Number!");
                        
                        //call start method
                        guessing.start();
                        
                        //call play method
                        guessing.play(input);
                    }
                    
                    //choice 2
                    else if(choice == 2){
                        System.out.println("you have entered Rock, Paper, Scissors, Have Fun!!");
                        Game RPS = new RPS("Rock, Paper, Scissors!");
                        
                        //call start method
                        RPS.start();
                        
                        //call start method
                        RPS.play(input);
                    }

                    //choice 3
                    else if(choice == 3){
                        System.out.println("you have entered Trivia Game, Have Fun!!");
                        Game trivia = new TriviaGame("Trivia Game");
                        
                        //call start method
                        trivia.start();
                        
                        //call play method
                        trivia.play(input);
                    }

                    //choice 4
                    else if(choice == 4){
                        System.out.println("you have entered Word Scramble, Have fun!");
                        Game wordScramble = new WordScramble("Word Scramble");

                        //call start method
                        wordScramble.start();

                        //call play method
                        wordScramble.play(input);
                    }

                    //choice 5
                    else if(choice == 5){
                        System.out.println("you have entered High-Low Card Game, Have fun!");
                        Game highLow = new HLCardGame("High-Low Card Game");

                        //call start method
                        highLow.start();

                        //call play method
                        highLow.play(input);
                    }

                    //choice 6
                    else if(choice == 6){
                        Game exit = new Game("exiting the menu, have a good day!");
                        exit.end();
                        break;
                    }

                }

                else{
                    System.out.println("Sorry, that's not a choice!");
                    if (input.hasNext()) {
                        input.next(); // eat invalid input
                    }
                }


            }
        input.close();
    }
}

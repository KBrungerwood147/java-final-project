
package src;

import java.util.Scanner;

public class MainMenu {

    //fields
    private static int x = 0;
    
    public static void main(String[]args){
    //main menu for Final Project
    runMenu(); 

}

//method for running main menu
public static void runMenu(){
    Scanner input = new Scanner(System.in);
        while(x == 0){
            System.out.println("""
                Welcome to the Java Game Hub!!\n
                -------------------------------------------------------------\n
                Please select a game you would like to play!\n
                1. Guess the Number\n
                2. Rock, Paper, Scissors\n
                3. Quit\n
                """);

            if(input.hasNextInt()){
                //store user input for choice
                int choice = input.nextInt();

                if (choice == 1){
                    System.out.println("you have entered Guess The Number Game, Have Fun!");
                    //runGuessTheNumber();
                }

                else if(choice == 2){
                    System.out.println("you have entered Rock, Paper, Scissors, Have Fun!!");
                }

                else if(choice == 3){
                    System.out.println("you have choosen to exit, have a good day!");
                    break;
                }

            }

            else{
                System.out.println("Sorry, that's not a choice!");
                input.next(); //eats invalid input
            }


        }
    input.close();
    }
}

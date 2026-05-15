# java-final-project
Repository for Richard Bland College final project in java.


Project title: Java Game Hub

The Java game hub is a game menu with 5 different games and allows the user to choose freely between them. 
with Java as the programming language, it uses arrays, loops, try catch blocks, scanner and random class, and much more in order to create these games.
the user is greeted with a menu which has Guess the number, Rock, Paper, Scissors, trivia game, word scramble, and high low card game. in which they are able to select between 1-6, having 6 be the exit.

1. Guess the number - which is a game where the user has to use hints such as too high or too low in order to guess the number the computer randomly selected. It also tracks the amount of guess the user uses. The user has to guess using these hints, using numbers between 1-100.

2. Rock, Paper, Scissors - This is a game which randomly selects between the three, and the user picks one of three options leading to either a win, tie, or loss. it keeps track of how many times the user wins, loses or ties. it allows as many rounds as the user wants until the user quits.

3. Trivia game - This game displays 6 different questions, each with 3 different answers. it checks if the user is correct or not on each one, letting the user know as they go. This game also keeps track of the user's score.

4. Word Scramble - This game stores a list of words inside of an array and randomly selects one. the selected word is then randomly scrambled, and then shown to the user. as the user attempts guess the word, it'll tell them if they are right or wrong.

5. High Low Card Game - the computer randomly generates a card value that is in between 1 - 13. Then the user guesses whether the next card will be lower or higher. The next card is now revealed and the game checks whether they were correct or not.

Project Structure - the project has 7 different java files that work together in order to create a game hub with 5 different games.

Game.java - A super class for all of the games, it stores the game name and provides the start() and play() methods for the subclasses to override. It also has a end() method.

GuessTheNumber.java - implements the guessing logic, uses random number generation, and a hint system to make the GuessTheNumber game.

HLCardGame.java - This file generates card values and checks whether the High or Low prediction is correct or not to create the HLCard game.

MainMenu.java - this java file contains the main menu loop, which displays all of the games for the user to choose from. This file creates instances of each game and calls their start() ro play() methods

RPS.java - This file randomly generates one of three choices: rock, paper, scissors, and determines the winner each time, allowing infinite rounds to create the rock paper scissors game.

TriviaGame.java - This file uses arrays for questions, choices, and correct answers, and runs a loop that quizzes the user while keeping track of score in order to run the Trivia game.

WordScramble.java -  This file stores a list of words that is randomly picked from in order to scramble it, and lets the user pick the word and checks for if it is correct or not.

This program has all of its files in one folder
Folder Directory - C:\Users\ksb20\Documents\VS_Code\java-final-project

This can also be found on github at - https://github.com/KBrungerwood147/java-final-project
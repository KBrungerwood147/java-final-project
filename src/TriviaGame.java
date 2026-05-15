package src;

import java.util.Scanner;


//Using Arrays to make a Trivia Game


public class TriviaGame extends Game{

    static Scanner input = new Scanner(System.in);

            //questions array
        static String [] questions = {"What is the largest planet in our solar System?", "Who wrote the play'Romeo and Juliet'?", "What is the Capital of Japan?","In which year did the Titanic sink?"," What is the chemical symbol for gold?","Which animal is known as the king of the jungle?"};

        //choices array for question 1
        static String [] choices1 = {"A, Jupiter","B, Neptune","C, Mars"};

        //choices array for question 2
        static String [] choices2 = {"A, Michael Jackson", "B, William Shakespeare","C, Sir Issac Newton"};

        //choices array for question 3
        static String [] choices3 = {"A, Richmond", "B, Tokyo", "C, Utah"};

        //choices array for question 4
        static String [] choices4 = {"A, 1814", "B, 1914","C, 1912"};

        //choices array for question 5
        static String [] choices5 = {"A, Au", "B, Cu", "C, Kp"};

        //choices array for question 6
        static String [] choices6 = {"A, Tiger","B, Snake","C, Lion"};

        //Correct answers array for all the questions
        static String [] correctAnswers = {"A","B","B","C","A","C"};
    
    //method that displays questions
    public static void displayQuestions(int i){
        System.out.println((i + 1) + "-" + questions[i]);

            //using if and else statements to determine which answer choices are going to be used when looping through questions
            if (i == 0){
                for (String choice : choices1)
                System.out.println(choice);
            }
            else if (i == 1){
                for (String choice : choices2)
                System.out.println(choice);
            }
            else if (i == 2){
                for (String choice : choices3)
                System.out.println(choice);
            }
            else if (i == 3){
                for (String choice : choices4)
                System.out.println(choice);
            }
            else if (i == 4){
                for (String choice : choices5)
                System.out.println(choice);
            }
            else if (i == 5){
                for (String choice : choices6)
                System.out.println(choice);
            }
        }
        public TriviaGame(String name) {
        super(name);

        }    
    

    //method for getting user's answer
    public static String getUserAnswer(){

        String userAnswer;
        
        while(true){
            try{
                System.out.println("Please enter (A, B, or C):");
                userAnswer = input.nextLine().toUpperCase();

                if (!userAnswer.equals("A") && !userAnswer.equals("B") && !userAnswer.equals("C")){
                    throw new IllegalArgumentException();
                }
                return userAnswer;
            }
            catch (IllegalArgumentException e){
            System.out.println("invalid input. Please enter A, B, or C.");
            }
        }
        
    }

    //method for checking if answer is correct
    public static boolean checkAnswer(String userAnswer, String correctAnswer){
        return userAnswer.equals(correctAnswer);
    }


    //method for strarting the trivia game
    public void start(){
        System.out.println("Starting" + getName() + " Game");
        play(input);
    }

    //method for playing trivia game
    public void play(Scanner input){
        int correct = 0;
        int incorrect = 0;

        System.out.println("!!!!welcome to the " + getName() + " Game!!!!");
        
        for (int i = 0; i < questions.length; i++){
            displayQuestions(i);
            String userAnswer = getUserAnswer();
            if (checkAnswer(userAnswer, correctAnswers[i])){
                correct++;
                System.out.println("Correct!");
            } else {
                incorrect++;
                System.out.println("Incorrect. The correct answer is " + correctAnswers[i]);
            }
        }
        System.out.println("You got " + correct + " out of " + questions.length + " correct.");
        System.out.println("you got " + incorrect + " out of " + questions.length + " incorrect.");
    }


}

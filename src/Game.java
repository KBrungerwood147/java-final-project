//superclass


package src;

import java.util.Scanner;

public class Game {

    //fields
    private String name;

    //constructor
    public Game(String name){
        this.name = name;
    }
    
    //getters
    public String getName(){
        return name;
    }

    //method overriding
    public void start(){
        System.out.println(" Starting" + name + " Up");

    }

    public void play(Scanner input){
        System.out.println("Playing" + name + "have fun!");

    }
    public void end(){
        System.out.println("exiting game hub, have a good day!");
        System.exit(0);       
    }
}



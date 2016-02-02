package barth.nolan.AccessLab03;

import java.util.Scanner;


public class HumanPlayer {
    private static Scanner sc = new Scanner(System.in);

    public static void play(){
        System.out.println("Let's play: type 'rock', 'paper', or 'scissors'");
        String userin = sc.nextLine();
        switch (userin.toLowerCase()){
            case "rock":
                GameLogic.setHumanMove(0);
                break;
            case "paper":
                GameLogic.setHumanMove(1);
                break;
            case "scissors":
                GameLogic.setHumanMove(2);
                break;
            default:
                System.out.println("I'm sorry, I didn't understand you. Can we try this again?");
                play();
        }
    }
    public static boolean playPrompt(){
        System.out.println("Would you like to play? (Please type yes/no)");
        String wantplay = sc.nextLine();
        return ((wantplay.toLowerCase().equals("yes")) || (wantplay.toLowerCase().equals("y")));

    }
    /* Uncomment for testing only.
    //Overloaded versions for testing purposes:
    public static void play(String reply){
        System.out.println("Let's play: type 'rock', 'paper', or 'scissors'");
        String userin = reply;
        switch (userin.toLowerCase()){
            case "rock":
                GameLogic.setHumanMove(0);
                break;
            case "paper":
                GameLogic.setHumanMove(1);
                break;
            case "scissors":
                GameLogic.setHumanMove(2);
                break;
            default:
                System.out.println("I'm sorry, I didn't understand you. Can we try this again?");
                play();
        }
    }
    public static boolean playPrompt(String reply){
        System.out.println("Would you like to play? (Please type yes/no)");
        String wantplay = reply;
        return ((wantplay.toLowerCase().equals("yes")) || (wantplay.toLowerCase().equals("y")));

    } */
}

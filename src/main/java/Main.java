import java.util.Scanner;
import java.util.Random;

public class Main {

    Scanner consoleScanner = new Scanner(System.in);

    int turns = 10;
    int mysteryNumber;

    static String introductoryText = """
                **********************************************
                 *** Welcome to the Number Guessing Game! ***\s
                **********************************************
                
                Rules:
                 * You have to guess the hidden number to win the game.
                 * If you have 10 turns to guess the number.
                 * Points will be awarded to you as play the game.
                 * Type - 'docs' to find out how points will be awarded to you.
                 * Each player data will be saved in database therefore, player identity will requested.
                 * Enjoy!!!
                """;



    public static void main(String[] args) {

        System.out.println(introductoryText);

    }
}

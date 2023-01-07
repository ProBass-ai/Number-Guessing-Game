package app;

import java.util.Scanner;


public class Main {

    static Scanner consoleScanner = new Scanner(System.in);

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

    static void phaseIntro()
    {
        System.out.println(introductoryText);
    }

    static void queryPlayerTo(String query)
    {
        System.out.println(query);
    }

    static String input()
    {
        String input;

        while (true)
        {
            input = consoleScanner.nextLine();

            if (input.isEmpty() || input.isBlank())
            {
                System.out.println("Input empty, please try again!");
                input = consoleScanner.nextLine();
            } else
            {
                return input;
            }
        }


    }

    static void start()
    {
        do {
            queryPlayerTo(">>>>> Type s to start guessing <<<<<");
        } while (!consoleScanner.nextLine().equalsIgnoreCase("s"));

        queryPlayerTo("Players Name: ");

        Player player = new Player();

        player.setPlayerName(input());

        Mystery mystery = new Mystery(); mystery.generate();

        Turns turns = new Turns();

        // while turns aren't equal to zero and the number hasn't been guessed, keep asking the user to guess

        do {
            queryPlayerTo("Enter your guess:");

            String guess = input();

            if (Integer.parseInt(guess) == mystery.getMysteryNumber())
            {
                System.out.println("Correct! The number is: " + mystery.getMysteryNumber());
            } else
            {
                turns.decrease();
            }
        } while ( turns.getTurns() != 0 );

    }


    public static void main(String[] args) {

        phaseIntro();
        start();

    }


}

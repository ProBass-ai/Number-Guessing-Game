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

    static int numberInput()
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
                try {

                    return Integer.parseInt(input);

                } catch (NumberFormatException nfe) {
                    System.out.println("Please enter a valid integer...");
                }

            }
        }
    }


    static String stringInput()
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

        player.setPlayerName(stringInput());

        Mystery mystery = new Mystery(); mystery.generate();

        Turns turns = new Turns();

        // while turns aren't equal to zero and the number hasn't been guessed, keep asking the user to guess

        do {
            queryPlayerTo("Enter your guess:");

            int guess = numberInput();

            if ((guess == mystery.getMysteryNumber()))
            {
                System.out.println("Correct! The number is: " + mystery.getMysteryNumber());
                break;

            } else
            {
                System.out.println("Sorry " + player.getName() + ", please try again.");
                turns.decrease();

            }
        } while ( turns.getTurns() != 0 );

        if (turns.getTurns() == 0) System.out.println("The number is: " + mystery.getMysteryNumber());

    }


    public static void main(String[] args) {

        phaseIntro();
        start();

    }


}

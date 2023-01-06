package FunctionalTests.UserBasedTests;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static java.lang.System.in;
import static org.junit.Assert.*;


public class Tests {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();


    @Test
    public void IntroductoryTextTest() {

        String expectedText = """
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


        app.Main.main(new String[0]);

        assertTrue(systemOutRule.getLog().contains(expectedText));

    }



}

package Mental_Health_Simulation_Assistant;

import java.util.Random;

/*
 * Just to provide a Quote to user, exposes 1 API
 * 1.getRandomQuote
 */
public class QuoteProvider {
    private static String quotes[] = {"you are stronger than you think.",
        "Take it one step at a time.",
        "This too shall pass.",
        "Breathe. You're doing okay.",
        "It's okay to ask for help.",
        "You matter. Your feelings are valid.",
        "Progress, not perfection."};

    public String getRandomQuote(){
        Random rand = new Random();
        return quotes[rand.nextInt(quotes.length)];
    }
    
}

package Mental_Health_Simulation_Assistant;

import java.util.Scanner;

/*
 * Just to give the options of mood and take the input, Exposes 1 API
 * 1. askMood
 */
public class MoodTracker {
    public String askMood(Scanner sc, user user){
        System.out.println("Hi "+user.getName()+", how are you feeling today ?");
        System.out.println("Options: Happy, Sad, Anxious, Angry, Tired, Excited, Okay");
        System.out.println("You mood :");
        String mood = sc.nextLine();
        return mood;
    }
}

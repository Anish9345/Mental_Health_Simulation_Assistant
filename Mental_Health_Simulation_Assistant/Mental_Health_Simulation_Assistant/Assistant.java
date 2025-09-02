package Mental_Health_Simulation_Assistant;

import java.util.Scanner;

/*
 * Class that will be exposing the API's to use
 * 1.startSession
 * 2.showMoodHistory
 */
public class Assistant {
    private user user;
    private CalmActivity ca;
    private QuoteProvider qp;
    private MoodTracker mt;

    Assistant(user user){
        this.user = user;
        ca = new CalmActivity();
        qp = new QuoteProvider();
        mt = new MoodTracker();
    }

    public void startSession(Scanner sc){
        String mood = mt.askMood(sc,user);
        System.out.println("Logging the mood history");
        user.addMoodHistory(mood);

        String randomQuote = qp.getRandomQuote();
        System.out.println("Here's a quote for you: " + randomQuote);

        System.out.println("Would you like to do some Exercise?(yes/no):");
        String ans = sc.nextLine().trim().toLowerCase();

        if(ans.equals("yes")){
            ca.breathingExercise();
        }
            System.out.println("Thank you for initating this session!");
    }

    public void showMoodHistory(){
        for(String mood : user.getMoodHistory()){
            System.out.print(mood+",");
        }
        System.out.println();
    }

}


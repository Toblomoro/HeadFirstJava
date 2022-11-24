package Chap6_get_to_know_JavaAPI;

import java.util.ArrayList;

public class StartupBust {
private GameHelper helper = new GameHelper();
private ArrayList<Startup> startups = new ArrayList<>();
private int numOfGuesses = 0;

private void setUpGame(){
    //make startups and give locations
    Startup one = new Startup();
    one.setName("Facebook");
    Startup two = new Startup();
    two.setName("Instagram");
    Startup three = new Startup();
    three.setName("Twitter");
    startups.add(one);
    startups.add(two);
    startups.add(three);

    System.out.println("Your goal is to sink 3 fledgling tech start ups before they become too big to control");
    System.out.println("Facebook, Instagram, and Twitter");
    System.out.println("Do it in as few guesses as possible. Vertical placement A - G, Horizontal Placement 0 - 6");


    for (Startup startup : startups){
        ArrayList<String> newLocation = helper.placeStartup(3);
        startup.setLocationCells(newLocation);
    }
}//close setUpGame method

private void startPlaying(){
    while (!startups.isEmpty()){
        String userGuess = helper.getUserInput("Enter a guess  ");
        checkUserGuess(userGuess);


    }

}

    private void checkUserGuess(String userGuess) {
    numOfGuesses ++;
    String result = "miss";

    for (Startup startupToTest : startups){
        result = startupToTest.checkYourself(userGuess);
        if (result.equals("hit")){
            break;
        }
        if (result.equals("kill")){
            startups.remove(startupToTest);
            break;
            }
         }// close for
        System.out.println(result);
    }//close method
private void finishGame(){
    System.out.println("All startups are dead! You have saved the world from the great brain deadening of social media!");
    if (numOfGuesses <= 18){
        System.out.println("It only took you "+ numOfGuesses + " guesses!");
        System.out.println("You destroyed them in the nick of time!");
    } else {
        System.out.println("Took you long enough. " + numOfGuesses + " guesses....");
        System.out.println("Looks like quite a few people got the social media infection...");
    }
}//close method

    public static void main(String[] args) {
        StartupBust game = new StartupBust();
        game.setUpGame();
        game.startPlaying();
        game.finishGame();
    }
}

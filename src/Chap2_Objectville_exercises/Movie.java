package Chap2_Objectville_exercises;

public class Movie {
    String title;
    String genre;
    int rating;

    void playIt(){
        System.out.println("Playing the movie." + " \nTitle: " + title + " \nGenre: "+ genre + " \nRating: " +rating);
    }
}

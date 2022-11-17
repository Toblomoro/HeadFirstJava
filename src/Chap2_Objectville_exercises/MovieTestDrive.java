package Chap2_Objectville_exercises;

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie movieOne = new Movie();
        movieOne.title = "Star Wars";
        movieOne.genre = "Space Opera";
        movieOne.rating = 4;
        Movie movieTwo = new Movie();
        movieTwo.title = "The Thing";
        movieTwo.genre = "Horror";
        movieTwo.rating = 5;
        movieTwo.playIt();
        Movie movieThree = new Movie();
        movieThree.title = "Aliens";
        movieThree.genre = "Sci-Fi action";
        movieThree.rating = 4;

    }
}

package Chap1_Phrase_O_Matic;


import java.util.Random;

public class PhraseOMatic {
    public static void main(String[] args) {
            String[] wordListOne = {"strong", "fast", "agnostic", "opinionated", "voice activated", "crusty", "goverment controlled", "robotic", "masochistic"};
            String[] wordListTwo = {"tricky", "probable", "plastic", "absorbing", "tough", "protective","chief","slow", "adjoining", "frequent"};
            String[] wordListThree = {"chapter", "user", "session", "aspect", "response", "city", "science", "warning", "union", "physics" };
            int oneLength = wordListOne.length;
            int twoLength = wordListTwo.length;
            int threeLength = wordListThree.length;

      Random randomGenerator = new java.util.Random();

        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("What we need here is a "+ phrase+".");


    }
}

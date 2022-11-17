package Chap2_Objectville_exercises;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.size = 50;
        d.name = "Emmett";
        d.breed = "Jack Russel Mix";
        System.out.println(d.name + " is a " + d.breed
         + " and weighs " + d.size + " lbs.");

        d.bark();


    }
}

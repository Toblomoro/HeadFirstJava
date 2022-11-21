package Chap4_Methods_Instance_Var;

public class GoodDogTestDrive {
    public static void main(String[] args) {

        GoodDog one = new GoodDog();
        one.setSize(70);
        one.setName("Killer");
        GoodDog two = new GoodDog();
        two.setSize(30);
        two.setName("Emmett");
        GoodDog three = new GoodDog();
        three.setSize(10);
        three.setName("Fido");

        System.out.println("Dog one: " + one.getName() + " weighs " + one.getSize() + " lbs.");
        System.out.println("Dog two: " + two.getName() + " weighs " + two.getSize() + " lbs.");
        System.out.println("Dog three: " + three.getName() + " weighs " + three.getSize() + " lbs.");
        one.bark();
        two.bark();
        three.bark();
    }
}

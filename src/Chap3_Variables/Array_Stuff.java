package Chap3_Variables;

import Chap2_Objectville_exercises.Dog;

import java.util.Arrays;

public class Array_Stuff {
    public static void main(String[] args) {
        int[] nums;
        nums = new int[7];
        nums[0] = 6;
        nums[1] = 19;
        nums[2] = 44;
        nums[3] = 42;
        nums[4] = 10;
        nums[5] = 20;
        nums[6] = 1;
        System.out.print(Arrays.toString(nums) + "\n");

        Dog[] pets;
        pets = new Dog[3];
        pets[0] = new Dog();
        pets[1] = new Dog();
        pets[2]= pets[1];

        pets[0].name = "Fido";
        pets[1].name = "Emmett";

        System.out.println("Last dog's name is " + pets[2].name);
//Iterate through array to take action on items
int x= 0;
while (x < pets.length){
    pets[x].bark();;
    x = x+1;
}
    }

    }







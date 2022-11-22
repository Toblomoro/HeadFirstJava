package Chap4_Methods_Instance_Var;



public class GoodDogArray {
    public static void main(String[] args) {


 GoodDog[] pets;
 pets = new GoodDog[4];

 pets[0] = new GoodDog();
 pets[1] = new GoodDog();
 pets[2] = new GoodDog();
 pets[3] = new GoodDog();


 pets[0].setSize(30);
 pets[0].setName("Emmett");

 pets[1].setSize(70);
 pets[1].setName("Killer");

 pets[2].setSize(10);
 pets[2].setName("Fido");

     pets[3].setSize(100);
     pets[3].setName("Dune");
//Loop through array
     int x= 0;
     while (x < pets.length){
      pets[x].bark();;
      x = x+1;
     }
    }
};

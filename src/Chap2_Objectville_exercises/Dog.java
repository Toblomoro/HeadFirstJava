package Chap2_Objectville_exercises;

public class Dog {
    public int size;
    public String breed;
    public String name;

  public void bark(){
      if (size > 60 ) {
        System.out.println(name + " says Ruff-Ruff!");
    } else if (size < 60 ) {
          System.out.println(name + " says Yip Yip!");
      }

      }
  }

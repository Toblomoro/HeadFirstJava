package Chap4_Methods_Instance_Var;

public class GoodDog {
    private int size;
    public int getSize(){
        return size;
    }

    public void setSize(int s) {
        size = s;
    }

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void bark() {
       if (size > 60) {
           System.out.println(name + " says Woof-Woof!");
       } else if (size > 14) {
           System.out.println(name + " says Ruff-Ruff!");
       } else if (size < 14) {
           System.out.println(name + " says Yip Yip!");
       }
   }
   };




        //Getters and Setters







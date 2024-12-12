class Mammal{
     String name;
     int age;
     public Mammal(String name, int age){
            this.name = name;
            this.age = age;
     }

}

class Dog extends Mammal{
      String breed;
      
    void show(){

        System.out.println(name);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.show();
        //System.out.println(myDog.age);
    }
}

abstract class Animal{
     abstract void sound();
     void sleep(){
         System.out.println("Sleeping!");
     }
}

class Dog extends Animal{

    void sound(){
        System.out.println("Barks!");
    }
}

class Cat extends Animal{

    void sound(){
        System.out.println("meows!");
    }
}
public class AbstractionExample {
    public static void main(String[] args) {
      Dog dog = new Dog();
      Cat cat = new Cat();
      
      dog.sound();
      dog.sleep();

      cat.sound();
      cat.sleep();
    }
}

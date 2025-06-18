
class Animall {
    String name;

    Animall(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}


class Dog extends Animall {
    Dog(String name) {
        super(name);
    }

    void bark() {
        System.out.println(name + " is barking.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Rex");

        myDog.eat();  
        myDog.sleep(); 
        myDog.bark();  
    }
}

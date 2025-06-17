package InheritanceDemo;

// Base class
class Animal1 {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Derived class from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }

}

// Derived class from Dog
class BabyDog extends Dog {
    void weep() {
        System.out.println("BabyDog is weeping");
    }
}

// Main class to test the hierarchy
public class InheritanceTest {
    public static void main(String[] args) {

        // Animal object
        Animal1 a = new Animal1();
        a.eat();

        // Dog object
        Dog d = new Dog();
        d.bark();
        d.eat();

        // BabyDog object
        BabyDog bd = new BabyDog();
        bd.weep();
        bd.bark();
        bd.eat();
    }
}

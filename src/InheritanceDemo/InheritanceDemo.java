package InheritanceDemo;

// Base class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Single Inheritance: Reptile inherits Animal
class Reptile extends Animal {
    void crawl() {
        System.out.println("Reptile is crawling");
    }
}

// Hierarchical Inheritance: Mamal also inherits Animal
class Mamal extends Animal {
    void walk() {
        System.out.println("Mamal is walking");
    }
}

// Multilevel Inheritance: Tiger inherits Mamal
class Tiger extends Mamal {
    void roar() {
        System.out.println("Tiger is roaring");
    }
}

// Main class to demonstrate inheritance types
public class InheritanceDemo {
    public static void main(String[] args) {

        // Single Inheritance
        Reptile reptile = new Reptile();
        reptile.eat();
        reptile.crawl();

        // Hierarchical Inheritance
        Mamal mamal = new Mamal();
        mamal.eat();
        mamal.walk();

        // Multilevel Inheritance
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.walk();
        tiger.roar();
    }
}

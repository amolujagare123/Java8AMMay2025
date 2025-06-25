package InheritanceDemo.Polymorphism;

// Base class
class Showroom {
     void channels() {
        System.out.println("Displaying channels feature.");
    }

    void volumecontrol() {
        System.out.println("Controlling volume.");
    }

    void settings() {
        System.out.println("Opening settings menu.");
    }
}

// Onida class extending Showroom
class Onida extends Showroom {

    public void channels() {
        System.out.println("Onida: Displaying channels.");
    }


    void volumecontrol() {
        System.out.println("Onida: Volume control.");
    }


    void settings() {
        System.out.println("Onida: Settings screen.");
    }
}

// Samsung class extending Showroom
class Samsung extends Showroom {

    void channels() {
        System.out.println("Samsung: Displaying channels.");
    }


    void volumecontrol() {
        System.out.println("Samsung: Volume control.");
    }


    void settings() {
        System.out.println("Samsung: Settings screen.");
    }
}

// LG class extending Showroom
class LG extends Showroom {

    void channels() {
        System.out.println("LG: Displaying channels.");
    }


    void volumecontrol() {
        System.out.println("LG: Volume control.");
    }


    void settings() {
        System.out.println("LG: Settings screen.");
    }
}

// Main class to test
public class ShowroomTest {
    public static void main(String[] args) {
        Showroom s = new LG(); // up casting
        s.channels();
        s.volumecontrol();
        s.settings();
    }
}

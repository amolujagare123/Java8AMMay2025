package AbstactionDemo;

public abstract class AbstractDemo {

    abstract void start();
    abstract void run();

    void display()
    {
        System.out.println("display");
    }

  /*  public static void main(String[] args) {
        AbstactionDemo.AbstractDemo ob = new AbstactionDemo.AbstractDemo();
    }*/
}

class Child extends AbstractDemo
{
    void start()
    {
        System.out.println("start");
    }

    void run()
    {
        System.out.println("run");
    }


    public static void main(String[] args) {

        AbstractDemo ob = new Child();

        ob.display();
        ob.run();
        ob.start();

    }

}

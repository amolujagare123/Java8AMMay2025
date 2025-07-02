package AbstactionDemo;

public interface InterfaceDemo2 {
    void start();
    void run();
    void display();


    private void display2()
    {
        System.out.println("display2");
    }

    static void display3()
    {
        System.out.println("display3");
    }
}

interface  AnotherInterface
{
    void speed();
    void display();
}

class DemoClass
{

}

class ChildInterface2 extends DemoClass implements InterfaceDemo2,AnotherInterface
{
    public void start()
    {
        System.out.println("start");
    }

    public void run()
    {
        System.out.println("run");
    }


    @Override
    public void speed() {
        System.out.println("speed");
    }

    public void display() {
        System.out.println("display");
    }

    public static void main(String[] args) {

        InterfaceDemo2 ob1 = new ChildInterface2();
        ob1.display();
    }
}

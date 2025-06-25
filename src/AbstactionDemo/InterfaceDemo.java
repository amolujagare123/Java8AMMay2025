package AbstactionDemo;

public interface InterfaceDemo {

     void start();
     void run();

    default void display1()
    {
        System.out.println("display1");
    }

    private void display2()
    {
        System.out.println("display2");
    }

    static void display3()
    {
        System.out.println("display3");
    }
}

class ChildInterface implements InterfaceDemo
{
    public void start()
    {
        System.out.println("start");
    }

    public void run()
    {
        System.out.println("run");
    }

    public static void main(String[] args) {

        InterfaceDemo ob = new ChildInterface();
        ob.run();
        ob.start();
        ob.display1();
       // ob.display2();
        InterfaceDemo.display3();
    }
}

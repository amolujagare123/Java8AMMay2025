package staticNFinal;

public /*final*/ class Employee {

    int salary = 35000;
    void empWork()
    {
        System.out.println("empWork");
    }

    /*final*/ void myMethod()
    {
        int salary = 300 ;
        System.out.println("Employee method");
    }



}

class Programmer extends  Employee
{
    int bonus = 15000;
    int salary = 60000;


    void myMethod()
    {
        System.out.println("Programmer method");
    }

    void programmerWork()
    {
        System.out.println("programmerWork");
    }

    void display()
    {
        System.out.println("bonus="+bonus);
        System.out.println("salary="+salary);
        System.out.println("salary="+super.salary);
         super.salary = 100;
        myMethod();
        super.myMethod();
    }

    public static void main(String[] args) {

        Programmer p = new Programmer();
        p.display();
    }

}

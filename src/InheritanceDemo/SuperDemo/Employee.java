package InheritanceDemo.SuperDemo;

public class Employee {

    int salary = 35000;
    void empWork()
    {
        System.out.println("empWork");
    }

    void myMethod()
    {
        System.out.println("Employee method");
    }

    Employee()
    {
        System.out.println("Employee Constructor");
    }

    Employee(int empId)
    {
        System.out.println("Employee id="+empId);

    }

    Employee(int empId,String empName)
    {
        System.out.println("Employee id="+empId);
        System.out.println("Employee name="+empName);
    }

}

class Programmer extends  Employee
{
    int bonus = 15000;
    int salary = 60000;

    Programmer()
    {
        super(23,"Vishal");
        System.out.println("Programmer Constructor");
    }

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
        myMethod();
        super.myMethod();
    }

    public static void main(String[] args) {

        Programmer p = new Programmer();
       // p.display();
    }

}

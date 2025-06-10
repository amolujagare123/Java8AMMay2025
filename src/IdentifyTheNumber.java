import java.util.Scanner;

public class IdentifyTheNumber {
    public static void main(String[] args) {
        double a;
        String choice;

        Scanner sc;
        do {
            sc = new Scanner(System.in);
            System.out.println("Enter a Number ");

            if (sc.hasNextDouble()) {
                a = sc.nextDouble();
                if (a >= 0)
                    System.out.println("You entered a positive number");
                else if (a < 0)
                    System.out.println("you entered a negative number");  //On providing -0 it gives positive number
            }
                else
                    System.out.println("It is not a number"); //program exit

            System.out.println("Do you want to verify another number(Y/N)");
            choice = sc.next();
        }
        while (choice.equalsIgnoreCase("y"));

    }



}

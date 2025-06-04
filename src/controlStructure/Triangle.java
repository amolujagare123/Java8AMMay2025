package controlStructure;

public class Triangle {

    public static void main(String[] args) {

       int a= -90 ;
       int b= 90 ;
       int c= 180;

       if(a+b+c==180 && a>0 && b>0 && c>0) {
           if (a == b && b == c)
               System.out.println("Equilateral controlStructure.Triangle");

           if (a != b && b != c && c != a)
               System.out.println("Scalene controlStructure.Triangle");

           if (a == 90 || b == 90 || c == 90)
               System.out.println("Right angled controlStructure.Triangle");

           if ((a == b && b != c) || (a == c && c != b) || (b == c && c != a))
               System.out.println("Isosceles controlStructure.Triangle");

       }
       else
           System.out.println("this is not a triangle");

    }
}

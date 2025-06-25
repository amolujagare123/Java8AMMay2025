package staticNFinal;

/*import static staticNFinal.Student2.staticMethod1;
import static staticNFinal.Student2.staticMethod2;
import static staticNFinal.Student2.college;*/

import static staticNFinal.Student2.*;

public class StaticDmo1 {

    public static void main(String[] args) {
        /*Student2 ob = new Student2();
        ob.display();*/

        college = "College name";
        staticMethod1();
        staticMethod2();

    }
}

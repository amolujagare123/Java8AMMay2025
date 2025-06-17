package DateDemos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo1 {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        String dateStr = sd.format(date);
        System.out.println("dateStr="+dateStr);

      //  → dd-MMMM-yyyy
        SimpleDateFormat sd1 = new SimpleDateFormat("dd-MMMM-yyyy");
        String dateStr1 = sd1.format(date);
        System.out.println("dateStr1="+dateStr1);


        //→ dd | MMMM yy hh:mm
        SimpleDateFormat sd2 = new SimpleDateFormat("dd | MMMM yy hh:mm");
        String dateStr2 = sd2.format(date);
        System.out.println("dateStr2="+dateStr2);


    }
}

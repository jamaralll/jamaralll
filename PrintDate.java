import java.util.*;
import java.text.SimpleDateFormat;
public class PrintDate {
    public static void main(String []args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date myDate = new Date();
        /*DateFormat df = DateFormat.getDateInstance();
        for (int i = 0; i < myDate.length; ++i) {
            output.println(df.format(myDate[i]) + "; ");
        }
        */
        System.out.println(dateFormat.format(myDate));

        // creating a calendar
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        month = month + 1;

        System.out.println("The date is " + month + "/" + day + "/" + year);
    }
};

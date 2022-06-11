import java.time.LocalDate;
import java.util.Scanner;

public class Date_and_Time {

    public String findDay (int month, int day, int year){

        int mm = Integer.valueOf(month);
        int dd = Integer.valueOf(day);
        int yyyy= Integer.valueOf(year);

        LocalDate localDate = LocalDate.of(yyyy,mm,dd);

        return localDate.getDateOfWeek.toString;






    }
}

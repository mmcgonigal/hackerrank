import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Currency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat o_us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat o_india = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        NumberFormat o_china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat o_france = NumberFormat.getCurrencyInstance(Locale.FRANCE);


        String us=o_us.format(payment);
        String india=o_india.format(payment);
        String china=o_china.format(payment) ;
        String france=o_france.format(payment);


        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

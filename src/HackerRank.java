import java.util.Scanner;

public class HackerRank {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
//        int i = scan.nextInt();
//        double d= scan.nextDouble();
//        scan.nextLine();
//        String s = scan.nextLine();
//
//        System.out.println("String:" + s);
//        System.out.println("Double:" + d);
//        System.out.println("Int:" + i);

        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=scan.next();
            int x=scan.nextInt();
            if( 10<x && x < 100){
                String num = '0' +Integer.toString(x) ;
                System.out.printf(s1+"%15s%n",num);
            } else if ( x <10){
                String num = "00" + Integer.toString(x);
                System.out.printf(s1+"%15s%n",num);
            } else if (100 < x){
                System.out.printf(s1+ "%15s%n", x);
            }

            //Complete this line
        }
        System.out.println("================================");

    }
}

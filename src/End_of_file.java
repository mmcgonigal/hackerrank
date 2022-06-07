import java.util.Scanner;

public class End_of_file {
    public static void main (String[] str){

        Scanner scanner = new Scanner(System.in);
        int i = 1;
        String  a;
        while(scanner.hasNext()){
            a = scanner.nextLine();
            System.out.println( i +" "+ a );
            i++;
        }



    }
}

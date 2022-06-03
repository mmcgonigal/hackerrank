import java.util.Scanner;

public class Datatypes_solution {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

       int t = scanner.nextInt();
       for (int i=0; i<t; i++){
           try
           {
               long x=scanner.nextLong();
               System.out.println(x+" can be fitted in:");
               if(x>=-128 && x<=127)System.out.println("* byte");
               //Complete the code
               if(-32768<=x && x<=32767) System.out.println("* short");
               if(-2147483648 <=x && x<=2147483647) System.out.println("* int");
               if(-9223372036854775808L <=x && x<=9223372036854775807L) {
;                   System.out.println("* long");
               }
           }
           catch(Exception e)
           {
               System.out.println(scanner.next()+" can't be fitted anywhere.");
           }
       }
        

    }
}

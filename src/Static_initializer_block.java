import java.util.Scanner;

public class Static_initializer_block {
        static Scanner scanner = new Scanner(System.in);
        static int x=scanner.nextInt();
        static int y= scanner.nextInt();
        static boolean flag =  true;
       static {
           try {
               if (x <= 0 || y <= 0) {
                   flag = false;
                   throw new Exception("Breadth and height must be positive");
               }
           } catch (Exception e) {
               System.out.println(e);
           }
       }
    public static void main(String[] args) {
        if(flag){
            int area=x*y;
            System.out.print(area);
        }

    }
}

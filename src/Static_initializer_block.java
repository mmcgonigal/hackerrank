import java.util.Scanner;

public class Static_initializer_block {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x=scanner.nextInt();
        int y= scanner.nextInt();
        try{
            if(x <= 0 || y<= 0){
                throw new Exception("Breadth and height must be positive");
        }}catch(Exception e){
            System.out.println(e);
        }

    }
}

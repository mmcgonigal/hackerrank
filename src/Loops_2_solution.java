import java.util.Scanner;

public class Loops_2_solution {
    public static void main(String [] args){

//        sum1 = a + 2^n*b


        Scanner scanner = new Scanner(System.in);
        int t= scanner.nextInt();
        for(int i=0; i<t; i++){
            int a = scanner.nextInt();
            int b= scanner.nextInt();
            int n = scanner.nextInt();

            int total= a;

            for(int j =0; j<n; j++ ){
                int sum1 =  (int)Math.pow(2,j)*b;
                total = total + sum1;
                System.out.printf("%s ", total);
            }
            if(i < t-1){
                System.out.println("%n");
            }


        }

    }
}

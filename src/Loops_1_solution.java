import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Loops_1_solution {
    public static void main(String[] args)  {



        Scanner scanner = new Scanner(System.in);


            int N = scanner.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(N + " x " + i + " = " + N * i);
            }

        }

    }


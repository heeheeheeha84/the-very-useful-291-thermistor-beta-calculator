import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter R1: ");
            double r1 = input.nextDouble();
            System.out.print("Enter R2: ");
            double r2 = input.nextDouble();
            System.out.print("Enter T1: ");
            double t1 = input.nextDouble();
            System.out.print("Enter T2: ");
            double t2 = input.nextDouble();

            double beta = Math.log(r1/r2) / (1/t1 - 1/t2);
            System.out.println(beta);
        }
    }
}
import java.util.Scanner;

public class PowerFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real power P (W): ");
        double p = sc.nextDouble();

        System.out.print("Enter apparent power S (VA): ");
        double s = sc.nextDouble();

        double pf = p / s;

        System.out.println("Power Factor = " + pf);
    }
}
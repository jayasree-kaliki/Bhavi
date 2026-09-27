import java.util.Scanner;

public class TransformerEfficiency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter output power (W): ");
        double output = sc.nextDouble();

        System.out.print("Enter losses (W): ");
        double losses = sc.nextDouble();

        double input = output + losses;
        double efficiency = (output / input) * 100;

        System.out.println("Transformer Efficiency = " + efficiency + "%");
    }
}
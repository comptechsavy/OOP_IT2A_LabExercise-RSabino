import java.util.Scanner;

public class Exer1_Imperative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        int temp = scanner.nextInt();

        if (temp >= 30) {
            System.out.println("It is Hot.");
        } else {
            System.out.println("It is Cold.");
        }

        scanner.close();
    }
}

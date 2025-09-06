import java.util.Scanner;
import java.util.function.Function;

public class Exer1_Functional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        int temp = scanner.nextInt();

        Function<Integer, String> checkTemp = t -> (t >= 30) ? "Hot" : "Cold";

        System.out.println("It is " + checkTemp.apply(temp) + ".");

        scanner.close();
    }
}

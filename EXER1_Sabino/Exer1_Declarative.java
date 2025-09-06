import java.util.Scanner;

public class Declarative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        int temp = scanner.nextInt();

        String result = (temp >= 30) ? "Taas kag Kalintura" : "ok ra kaayo ka";

        System.out.println("It is " + result + ".");

        scanner.close();
    }
}

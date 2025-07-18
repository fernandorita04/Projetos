import java.util.Scanner;

public class OrderProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double itemsValue = scanner.nextDouble();
        double shipping = scanner.nextDouble();
        boolean firstPurchase = scanner.nextBoolean();

        if (itemsValue >= 200.0) {
            shipping = 0.0;
        }

        double discount = 0.0;
        if (firstPurchase) {
            discount = itemsValue * 0.05;
        }

        double finalValue = (itemsValue - discount) + shipping;

        System.out.printf("%.2f%n", finalValue);

        scanner.close();
    }
}

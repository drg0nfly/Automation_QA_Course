package ConditionalStatements;

import java.util.Scanner;

public class RevenueCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter unit price: ");
        double unitPrice = scanner.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        double discount = 0.0;
        double discountPercent = 0.0;

        if (quantity >= 100 && quantity <= 120) {
            discount = (unitPrice * quantity) * 0.15;
            discountPercent = 15.0;
        } else if (quantity > 120) {
            discount = (unitPrice * quantity) * 0.2;
            discountPercent = 20.0;
        }

        double revenue = (unitPrice * quantity) - discount;

        System.out.printf("The revenue from sale: %.2f$%n", revenue);
        System.out.printf("Discount: %.2f$", discount);
        System.out.print("("+discountPercent+"%)");
    }
}

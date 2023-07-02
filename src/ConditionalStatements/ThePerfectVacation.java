package ConditionalStatements;

import java.util.Scanner;

public class ThePerfectVacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's the type of the vacation you want?: ");
        String vacationType = scanner.nextLine();
        System.out.print("What's your daily budget?: ");
        double dailyBudget = scanner.nextDouble();

        switch (vacationType) {
            case "Mountain":
                if (dailyBudget < 30) {
                    System.out.println("Your budget is suitable for vacation in Bulgaria!");
                } else {
                    System.out.println("Your budget is suitable for vacation outside Bulgaria!");
                }
                break;
            case "Beach":
                if (dailyBudget < 50) {
                    System.out.println("Your budget is suitable for vacation in Bulgaria!");
                } else {
                    System.out.println("Your budget is suitable for vacation outside Bulgaria!");
                }
                break;
            default:
                System.out.println("There is no information about this type of vacation.");
                break;
        }
    }
}

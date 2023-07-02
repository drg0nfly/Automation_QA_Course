package ConditionalStatements;

import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String[] args) {
       Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        switch (number) {
            case 1 -> System.out.println("The 1st day of the week is Monday");
            case 2 -> System.out.println("The 2nd day of the week is Tuesday");
            case 3 -> System.out.println("The 3rd day of the week is  Wednesday");
            case 4 -> System.out.println("The 4th day of the week is Thursday");
            case 5 -> System.out.println("The 5th day of the week is Friday");
            case 6 -> System.out.println("The 6th day of the week is Saturday");
            case 7 -> System.out.println("The 7th day of the week is Sunday");
            default -> System.out.printf("There is no %d day of the week. Please, enter number between 1-7!", number);
        }
    }



}

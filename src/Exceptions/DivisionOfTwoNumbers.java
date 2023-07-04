package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionOfTwoNumbers {
    public static void main(String[] args) {
        divideTwoNumbers();
    }

    static void divideTwoNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter two integers: ");
        int num1 = 0;
        int num2 = 0;
        try {
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
        } catch (InputMismatchException | NumberFormatException ex) {
            System.out.println("Invalid input. Please, try again!");
        }
        try {
            int result = num1 / num2;
        }catch (ArithmeticException ae){
            System.out.println("There is an arithmetic exception. Please, try after entering new integers.");
        }

    }


}
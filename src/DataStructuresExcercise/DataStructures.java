package DataStructuresExcercise;

import java.sql.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class DataStructures {
    public static void main(String[] args) {
        Palindrome();
    }

    public static void SumOfArrayElements() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numbers you'd like to sum: ");
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;

        for (int j : numbers) {
            sum += j;
        }

        System.out.println("The result is: " + sum);
    }


    public static void PrintMatrix1() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }

    }

    public static void PrintMatrix2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.println("Enter number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Enter value of index: " + (i) + (j));
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The following matrix was collected: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }

        }
    }

    public static void FindBiggestElement() {
        int[] numbers = {15, -35, 21, 44, 12, -8, 65, 34};

        int biggestNum = Integer.MIN_VALUE;

        for (int j : numbers) {
            if (j > biggestNum) {
                biggestNum = j;
            }
        }

        System.out.println(biggestNum);
    }

    public static void ReverseElements() {
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        System.out.println("The following linked list will be reverted: " + numbers);

        LinkedList<Integer> reversedNumbers = new LinkedList<Integer>();

        for (int i = numbers.size() - 1; i >= 0; i--) {
            reversedNumbers.add(numbers.get(i));
        }

        System.out.println("Reversed linked list: " + reversedNumbers);
    }

    public static void SumOfMatrixDiagonal() {
        int[][] matrix = {
                {3, 5, 7, 8},
                {6, 8, 4, 9},
                {1, 0, 9, 8},
                {7, 3, 6, 11}
        };

        int leftDiagonal = 0;
        int rightDiagonal = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    leftDiagonal += matrix[i][j];
                }
                if ((i + j) == (matrix.length - 1)) {
                    rightDiagonal += matrix[i][j];
                }
            }
        }

        System.out.println("The sum of the matrix left diagonal is: " + leftDiagonal);
        System.out.println("The sum of the matrix right diagonal is: " + rightDiagonal);
    }

    public static void Palindrome() {
        String palindrome = "madam";

        String reversedPalindrome = "";

        for (int i = palindrome.length() - 1; i >= 0; i--) {
            reversedPalindrome = reversedPalindrome + palindrome.charAt(i);
        }

        if (palindrome.equals(reversedPalindrome)) {
            System.out.println("The word " + palindrome + " is a palindrome!");
        } else {
            System.out.println("The word " + palindrome + " isn't a palindrome!");
        }
    }
}



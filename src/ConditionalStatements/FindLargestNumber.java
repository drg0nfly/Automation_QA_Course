package ConditionalStatements;

import java.util.Arrays;
import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your numbers here: ");

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int max = Integer.MIN_VALUE;

        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }

        System.out.printf("The largest number in your array is: %d", max);

    }
}

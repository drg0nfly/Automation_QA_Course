package ConditionalStatements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your numbers here: ");

        int[] numbers = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        // Or if we want a specific list:
        // List<Integer> numbers = new ArrayList<>();
        // Collections.addAll(numbers, 12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200);

        List<Integer> divisibleByFive = new ArrayList<>();

        for (int j : numbers) {
            if (j > 150) break;

            if (j % 5 == 0) {
                divisibleByFive.add(j);
            }
        }

        System.out.println("The numbers divisible by 5 are: " + divisibleByFive);

    }
}
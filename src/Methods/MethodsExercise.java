package Methods;

import java.util.Scanner;

public class MethodsExercise {
    public static void main(String[] args) {
        System.out.println(isPalindrome());
    }

    public static int getSmallestNum(int num1, int num2, int num3) {
        int smallestNum = Integer.MIN_VALUE;
        if (num1 < num2 && num1 < num3) {
            smallestNum = num1;
        } else if (num2 < num1 && num2 < num3) {
            smallestNum = num2;
        } else {
            smallestNum = num3;
        }
        return smallestNum;
    }

    public static int getAverage(int num1, int num2, int num3) {
        int average = (num1 + num2 + num3) / 3;
        return average;
    }


    public static String getMiddleLetter(String word) {
        int wordLength = word.length();
        String middleLetters = "";

        if (wordLength % 2 != 0) {
            middleLetters = middleLetters + word.charAt(wordLength / 2);
        } else {
            middleLetters = middleLetters + word.charAt((wordLength / 2) - 1) + word.charAt(wordLength / 2);
        }

        return middleLetters;
    }

    public static int getNumWords(String sequence) {
        String[] words = sequence.split("\\s+");
        return words.length;
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPalindrome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();

        String num = String.valueOf(number);
        String reversedNum = "";

        for (int i = num.length() - 1; i >= 0; i--) {
            reversedNum = reversedNum + num.charAt(i);
        }

        if (reversedNum.equals(num)) {
            return true;
        } else {
            return false;
        }
    }
}

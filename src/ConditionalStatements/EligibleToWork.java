package ConditionalStatements;

import java.util.Scanner;

public class EligibleToWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter you age here: ");
        int age =scanner.nextInt();

        if(age>=16){
            System.out.println("You are eligible to work.");
        }else{
            System.out.println("You are not eligible to work.");
        }
    }
}

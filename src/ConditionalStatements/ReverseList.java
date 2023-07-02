package ConditionalStatements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 10, 20, 30, 40, 50);

        List<Integer> numbersReversed = new ArrayList<>();
        for (int i = numbers.size() - 1; i >= 0; i--) {
            numbersReversed.add(numbers.get(i));
        }

        System.out.println("The reversed list is: " + numbersReversed);

    }
}

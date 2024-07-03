package chapter_05.exercise_12;

/*
 * Find the smallest n such that n^3 > 12,000.
 * Use a while loop.
 */

public class FindSmallestNumber {
    public static void main(String[] args) {
        int number = 0;

        while (!(Math.pow(number, 3) >= 12000)) {
            number ++;
        }
        // Print results.
        System.out.println("The smallest integer: " + number);
    }
}

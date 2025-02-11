package chapter_06.exercise_08;

/*
 * Write a class that contains the following methods two methods:
 *
 * public static double mileToKilometer(double mile)
 * public static double kilometerToMile(double kilometer)
 *
 * The formula for the conversion is 1 mile = 1.6 kilometers.
 *
 * Write a test program that invokes these methods to display two tables.
 */

public class ConversionBetweenMileKilometer {
    public static void main(String[] args) {
        // Print header.
        System.out.println("Miles    Kilometers  |    Kilometers    Miles");
        System.out.println("-----------------------------------------------");

        // A for loop to print from miles to kilometers and from kilometers to miles. i = miles and j = kilometers.
        for (int i = 1, j = 20; i <= 10 && j <= 65; i++, j += 5) {
            System.out.printf("%-7d%8.3f      |    %-14d%6.3f \n", i, mileToKilometer(i), j, kilometerToMile(j));
        }
    }

    // Create a method that converts miles to kilometers.
    public static double mileToKilometer(double mile) {

        return mile * 1.6;

    }
    // Create a method that converts kilometers to miles.
    public static double kilometerToMile(double kilometer) {

        return kilometer / 1.6;

    }
}
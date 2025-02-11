package chapter_01.exercise_05;

/*
 * Write a program that reads the subtotal and
 * the gratuity and then computes the gratuity and total.
 */

import java.util.Scanner;

public class CalculateTip {
    public static void main(String[] args) {
        // Create a Scanner.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter subtotal and gratuity rate.
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();

        // Calculate tip.
        double tip = subtotal * (gratuityRate /100);

        // Calculate subtotal.
        double total = subtotal + tip;

        // Display results.
        System.out.println("The gratuity is $" + tip + " and total is $ " + total);
    }
}

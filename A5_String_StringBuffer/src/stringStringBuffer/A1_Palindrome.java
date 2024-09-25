package stringStringBuffer;

// Question 1: Write a Program to check whether a given String is Palindrome or not.
import java.util.Scanner;

public class A1_Palindrome{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();
        String reversed = new StringBuilder(input).reverse().toString();
        
        if (input.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        
        scanner.close();
    }
}

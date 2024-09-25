package stringStringBuffer;

// Question 3: Given a string, return a new string made of 'n' copies of the first 2 chars 
// of the original string where 'n' is the length of the string.

import java.util.Scanner;

public class A3_FirstTwoChars{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String result;

        if (input.length() < 2) {
            result = input;
        } else {
            String firstTwoChars = input.substring(0, 2).toLowerCase();
            int n = input.length();
            StringBuilder resultBuilder = new StringBuilder();
            for (int i = 0; i < n; i++) {
                resultBuilder.append(firstTwoChars);
            }
            result = resultBuilder.toString();
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}

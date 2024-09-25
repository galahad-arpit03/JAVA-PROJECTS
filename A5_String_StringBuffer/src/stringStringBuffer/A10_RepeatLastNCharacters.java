package stringStringBuffer;

// Question: Given a string and an integer n, print a new string made of n repetitions 
// of the last n characters of the string. You may assume that n is between 0 and the 
// length of the string, inclusive.

import java.util.Scanner;

public class A10_RepeatLastNCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        System.out.print("Enter an integer n: ");
        int n = scanner.nextInt();

        String lastNCharacters = input.substring(input.length() - n);
        
        String result = lastNCharacters.repeat(n);

        System.out.println("Result: " + result);
        scanner.close();
    }
}

package stringStringBuffer;

// Question 4: Write a Java program that accepts a string and returns a new string 
// in which the characters that are to the left and right of a given character are removed.

import java.util.Scanner;

public class A8_RemoveLeftRightCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Enter a character to remove around: ");
        char ch = scanner.next().charAt(0);

        int index = input.indexOf(ch);
        String result = (index == -1 || index == 0 || index == input.length() - 1) 
                ? input 
                : input.substring(0, index) + input.substring(index + 1);

        System.out.println("Result: " + result);
        scanner.close();
    }
}

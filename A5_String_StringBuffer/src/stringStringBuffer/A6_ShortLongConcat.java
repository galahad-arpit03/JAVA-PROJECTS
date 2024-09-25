package stringStringBuffer;

// Question 2: Given 2 strings, a and b, return a new string of the form 
// short+long+short, with the shorter string on the outside and the longer string on the inside.

import java.util.Scanner;

public class A6_ShortLongConcat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String a = scanner.nextLine();
        System.out.print("Enter second string: ");
        String b = scanner.nextLine();

        String result = (a.length() < b.length()) ? a + b + a : b + a + b;
        System.out.println("Result: " + result);
        scanner.close();
    }
}

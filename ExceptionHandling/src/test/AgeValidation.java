package test;

public class AgeValidation {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide name and age as arguments.");
            return;
        }

        String name = args[0];
        int age;

        try {
            age = Integer.parseInt(args[1]);
            if (age < 18 || age >= 60) {
                throw new InvalidAgeException("Age must be >= 18 and < 60");
            }
            System.out.println("User " + name + " registered successfully with age: " + age);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer for age.");
        } catch (InvalidAgeException e) {
            System.out.println("InvalidAgeException: " + e.getMessage());
        }
    }
}

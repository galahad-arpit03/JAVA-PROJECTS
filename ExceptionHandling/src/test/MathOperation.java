package test;


public class MathOperation {
    public static void main(String[] args) {
        if (args.length < 5) {
            System.out.println("Please provide exactly 5 integer values.");
            return;
        }

        try {
            int[] numbers = new int[5];
            for (int i = 0; i < 5; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }

            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }

            double average = sum / 5.0;

            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
        } catch (NumberFormatException e) {
            System.out.println("java.lang.NumberFormatException: Please enter valid integers");
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: Error in calculating average");
        }
    }
}

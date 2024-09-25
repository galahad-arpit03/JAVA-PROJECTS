package colorExample;

import java.util.Random;

class ColorDisplay implements Runnable {
    private String[] colors;
    private Random random;

    public ColorDisplay(String[] colors) {
        this.colors = colors;
        this.random = new Random();
    }

    @Override
    public void run() {
        while (true) {
            int index = random.nextInt(colors.length); // Generate random index
            String color = colors[index]; // Get the color at the random index
            System.out.println(color); // Display the color

            if (color.equals("red")) { // Check if the color is red
                break; // Exit the loop if the color is red
            }
        }
    }
}

public class ColorExample {
    public static void main(String[] args) {
        String[] colors = {"white", "blue", "black", "green", "red", "yellow"};
        ColorDisplay colorDisplay = new ColorDisplay(colors);

        // Create and start the thread
        Thread thread = new Thread(colorDisplay);
        thread.start();
    }
}

package RaceSimulation;

public class RaceSimulation {

    // Shared variable to stop the second thread when the race finishes
    private static volatile boolean raceOver = false;

    // Race class implementing Runnable to create threads
    static class Race implements Runnable {
        private String name;

        public Race(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 100; i++) {
                // Check if the race is already won by another thread
                if (raceOver) {
                    System.out.println(name + " stops running as race is already over.");
                    break;
                }

                // Simulate the Hare's sleep after 60 meters
                if (name.equals("Hare") && i == 60) {
                    try {
                        System.out.println("Hare is sleeping at 60 meters...");
                        Thread.sleep(1000);  // Hare sleeps for 1000 ms after 60 meters
                    } catch (InterruptedException e) {
                        System.out.println(name + " got interrupted.");
                    }
                }

                // Print the progress of the current thread
                System.out.println(name + " has run " + i + " meters");

                // Check if the current thread wins
                if (i == 100) {
                    System.out.println(name + " wins the race!");
                    raceOver = true;  // Mark the race as over
                    break;
                }

                // Simulate a small delay for each meter covered
                try {
                    Thread.sleep(100);  // Small delay to visualize the race better
                } catch (InterruptedException e) {
                    System.out.println(name + " got interrupted.");
                }
            }
        }
    }

    // Main method: Entry point of the program
    public static void main(String[] args) {
        // Creating threads for Hare and Tortoise
        Race hareRace = new Race("Hare");
        Race tortoiseRace = new Race("Tortoise");

        Thread hare = new Thread(hareRace, "Hare");
        Thread tortoise = new Thread(tortoiseRace, "Tortoise");

        // Setting priorities (Hare is faster, so higher priority)
        hare.setPriority(Thread.MAX_PRIORITY);
        tortoise.setPriority(Thread.MIN_PRIORITY);

        // Starting the race
        hare.start();
        tortoise.start();
    }
}

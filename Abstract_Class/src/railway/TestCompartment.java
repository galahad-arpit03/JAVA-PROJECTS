package railway;

import java.util.Random;

public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];
        Random random = new Random();

        for (int i = 0; i < compartments.length; i++) {
            int randNum = random.nextInt(4) + 1; 
            
            switch (randNum) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
            }

            // Print the notice for the randomly assigned compartment
            System.out.println("Compartment " + (i + 1) + ": " + compartments[i].notice());
        }
    }
}

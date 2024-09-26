package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {
        // Create instances of Veena and Saxophone
        Veena veena = new Veena();
        Saxophone saxophone = new Saxophone();

        // Call play() method directly
        veena.play();
        saxophone.play();

        // Place instances in a variable of type Playable
        Playable playable1 = veena;
        Playable playable2 = saxophone;

        // Call play() method using Playable reference
        playable1.play();
        playable2.play();
    }
}

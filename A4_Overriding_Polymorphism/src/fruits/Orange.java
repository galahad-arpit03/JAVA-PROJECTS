package fruits;

public class Orange extends Fruit {

    public Orange(String name, String taste, int size) {
        super(name, taste, size);
    }

    @Override
    public void eat() {
        System.out.println("Orange: " + name + ", Taste: " + taste);
    }
}

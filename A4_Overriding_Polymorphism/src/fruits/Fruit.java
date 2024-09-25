package fruits;

public class Fruit {
    String name;
    String taste;
    int size;

    public Fruit(String name, String taste, int size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    public void eat() {
        System.out.println("Fruit: " + name + ", Taste: " + taste);
    }
}

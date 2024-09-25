package fruits;

public class Apple extends Fruit {

    public Apple(String name, String taste, int size) {
        super(name, taste, size);
    }

    @Override
    public void eat() {
        System.out.println("Apple: " + name + ", Taste: " + taste);
    }
}

package animal;

public class Bird extends Animal {
    @Override
    public void eat() {
        System.out.println("Bird is pecking at its food");
    }

    @Override
    public void sleep() {
        System.out.println("Bird is sleeping in its nest");
    }

    public void fly() {
        System.out.println("Bird is flying");
    }
}

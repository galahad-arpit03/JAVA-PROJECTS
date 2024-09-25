package fruits;

public class TestFruits {
    public static void main(String[] args) {
        Fruit apple = new Apple("Apple", "Sweet", 5);
        apple.eat();

        Fruit orange = new Orange("Orange", "Sour", 4);
        orange.eat();
    }
}

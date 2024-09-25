package animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();

        System.out.println(); 

        Bird bird = new Bird();
    
        bird.eat();   
        bird.sleep();
        bird.fly();   
    }
}

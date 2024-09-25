package scoobyShaggy;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name); // Set the thread name
    }

    @Override
    public void run() {
        // Display the thread name
        System.out.println("Thread name: " + getName());
    }
}

public class ScoobyShaggy {
    public static void main(String[] args) {
        // Create two threads
        MyThread thread1 = new MyThread("Scooby");
        MyThread thread2 = new MyThread("Shaggy");

        // Start the threads
        thread1.start();
        thread2.start();
    }
}

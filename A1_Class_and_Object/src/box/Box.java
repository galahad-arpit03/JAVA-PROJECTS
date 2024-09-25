package box;

public class Box {
    private double width;
    private double height;
    private double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getVolume() {
        return width * height * depth;
    }

    public void displayDimensions() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Depth: " + depth);
    }

    public static void main(String[] args) {
      
        Box myBox = new Box(5.0, 3.0, 2.0);

        myBox.displayDimensions();

   
        System.out.println("Volume of the box: " + myBox.getVolume());
    }
}

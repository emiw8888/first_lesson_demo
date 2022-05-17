package figure;

public class Circle implements Figure {
    public static final double pi = Math.PI;
    private int radius;
    {
        System.out.println("Circle: ");
    }
    @Override
    public int area() {
        return (int) (pi*radius*radius);
    }

    @Override
    public int perimeter() {
        return (int) (2*pi*radius);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

package figure;

public class Rectangle implements Figure{
    int height;
    int width;
    {
        System.out.println("Rectangle: ");
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public int area() {
        return height*width;
    }

    @Override
    public int perimeter() {
        return (width+height)*2;
    }
}

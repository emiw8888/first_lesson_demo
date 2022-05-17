package figure;

public class Polygonal implements Figure,Test {
    int n;
    int side;

    {
        System.out.println("Polygon: ");
    }

    public Polygonal(int n, int side) {
        this.n = n;
        this.side = side;
    }

    @Override
    public int area() {
        return 0;
    }



    @Override
    public int perimeter() {
        return n*side;
    }
}

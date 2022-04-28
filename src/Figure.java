class Rectangle {
    int a;
    int b;
    Rectangle(int width ,int length){
        a = width;
        b = length;
    }
    public int findArea(){
        return a*b;
    }
    public void findPerimeter(){
        System.out.println((a+b)*2);
    }
}
public class Figure{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,4);
        System.out.println(rectangle.findArea());
        rectangle.findPerimeter();
    }
}
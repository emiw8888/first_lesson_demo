package minmaxmultiply;

public class Lesson9 {
    public static void main(String[] args) {
        Multiply multiply = new Multiply();
        multiply.multiplyMaxMin(3.5f,2.4f,5.6f);
    }
}

class Multiply {
    public void multiplyMaxMin(int a, int b, int c) {
        int max = ((a > b) && (a > c)) ? a : ((b > c) ? b : c);
        int min = ((a < b) && (a < c)) ? a : ((b < c) ? b : c);
        System.out.println(min * max);
    }
    public void multiplyMaxMin(short a, short b, short c) {
        short max = ((a > b) && (a > c)) ? a : ((b > c) ? b : c);
        short min = ((a < b) && (a < c)) ? a : ((b < c) ? b : c);
        System.out.println(min * max);
    }
    public void multiplyMaxMin(float a, float b, float c) {
        float max = ((a > b) && (a > c)) ? a : ((b > c) ? b : c);
        float min = ((a < b) && (a < c)) ? a : ((b < c) ? b : c);
        System.out.println(min * max);
    }
}
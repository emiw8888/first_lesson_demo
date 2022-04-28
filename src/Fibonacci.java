import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input range: ");
        int range = sc.nextInt();
        int b = 0;
        int c = 1;
        int result;
        if (range < 0){
            System.out.println("your input are not in range. " +
                    "if u want take positive of it then input true if not input false");
            System.out.println("true/false");
            boolean check = sc.nextBoolean();
            range = check ? range+range*-2 : 0;
        }

        while (0 < range){
            System.out.print(b +" ");
            result = b + c;
            b = c;
            c = result;
            range--;
        }
    }
}

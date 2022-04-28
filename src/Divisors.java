import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input first num: ");
        int a = sc.nextInt();
        System.out.println("input second num: ");
        int b = sc.nextInt();
        System.out.println("input range: ");
        int n = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= (n<0?n*-1:n); i++) {
            if(i%a ==0 && i%b==0) result *= i;
        }
        System.out.println(result);
    }
}

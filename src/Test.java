import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < (n < 0 ? n * -1 : n); i++) {
            int a = sc.nextInt();
            if (a % 2 == 1 && a % 7 == 0) {
                System.out.print(result == 0 ? a : "*" + a);
                result = result == 0 ? a : result * a;
            }

        }
        System.out.println(result == 0 ? result : " = " + result);
    }
}


import java.util.Scanner;

public class PrimeInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check;
        int result = 0;
        System.out.println("how many numbers u will add?");
        int  size = sc.nextInt();
        int[] arrInt = new int[size < 0 ? -1 * size : size];
        for (int i = 0; i < arrInt.length; i++) {
            System.out.println(i+1 + " number: ");
            arrInt[i] = sc.nextInt();
        }
        for (int i : arrInt) {
            check = false;
            for (int j = i < 0 ? i+1 : 2; j <= -2 || j <= i/2 ; j++) {
                if(j == 0) continue;
                if (i % j == 0) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                result+=i;
            }
        }
        System.out.println(result);
    }
}

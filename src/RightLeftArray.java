import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class RightLeftArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int n = sc.nextInt();
        int[] arr = new int[n < 0 ? n * -1 : n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(20);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("how much index");
        int k = sc.nextInt();
        k = k < 0 ? k * -1 : k;
        System.out.println("choose side");
        String s = sc.next();
        int a;
        switch (s.toLowerCase()) {
            case "left":
                // 1 2 3 4 5
                for (int j = 0; j < arr.length; j++)
                    arr[(j - k) < 0 ? (j - k) + n : j - k] = arr[j];
                break;
            case "right":
                for (int j = 0; j < arr.length; j++)
                    arr[(j + k) > n - 1 ? (j + k) - n : j + k] = arr[j];
                break;
            default:
                System.out.println("wrong insert");
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

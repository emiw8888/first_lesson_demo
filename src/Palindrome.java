import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int example = 0;
        int result = 0;
        boolean check = false;
        while (num > 0) {
            result += num % 10;
            example = example * 10 + num % 10;
            if (num == example) {
                check = true;
                break;
            }
            num = num / 10;
            if (num == example) {
                check = true;
                break;
            }
        }
        if (check) System.out.println(result*2);
        else System.out.println("Number is not palindrome");
    }
}

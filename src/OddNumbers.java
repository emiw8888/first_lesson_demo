import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many numbers u will add?");
        int  size = sc.nextInt();
        short[] arr = new short[size < 0 ? -1 * size : size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+1 + " number: ");
            arr[i] = sc.nextShort();
        }

        for (int i:arr){
            if(i%2!=0) System.out.print(i + " ");
        }
    }
}

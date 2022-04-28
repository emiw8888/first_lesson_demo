import java.util.Scanner;

public class MinAndMAx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input row: ");
        int row = sc.nextInt();
        System.out.println("input column: ");
        int column = sc.nextInt();
        int[][] arr = new int[row < 0 ? -1 * row : row][column < 0 ? -1 * column : column];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(i + 1 + " row " + (j + 1) + " column: ");
                arr[i][j] = sc.nextInt();
            }
        }
        int min = arr[0][0];
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                min = arr[i][j] < min ? arr[i][j] : min;
                max = arr[i][j] > max ? arr[i][j] : max;
            }
        }
        System.out.println(min + "; " + max);
    }
}

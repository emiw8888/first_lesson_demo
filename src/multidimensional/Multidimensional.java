package multidimensional;

import java.util.Scanner;

public class Multidimensional {
    int rowSize;
    int columnSize;
    int[][] arr;

    public Multidimensional(int rowSize, int columnSize) {
        this.rowSize = rowSize;
        this.columnSize = columnSize;
        arr = new int[rowSize][columnSize];
    }

    public void enterValuesFromConsole(Scanner sc) {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                System.out.println("enter " + (i + 1) + " row " + (j + 1) + " column: ");
                arr[i][j] = sc.nextInt();
            }
        }
    }

//    public String findFirstDiagonalElements() {
//        String result = "";
//        for (int i = 0; i < columnSize; i++) {
//            result = result == "" ? result + arr[i][i] : result + ", " + arr[i][i];
//        }
//        return result;
//    }
    public int[] findFirstDiagonalElements() {
        int[] result = new int[columnSize];
        for (int i = 0; i < columnSize; i++) {
            result[i] = arr[i][i];
        }
        return result;
    }

//    public String findSecondDiagonalElemenets() {
//        String result = "";
//        for (int i = columnSize-1, j = 0; i >= 0 && j < columnSize; i--, j++) {
//            result = result == "" ? result + arr[j][i] : result + ", " + arr[j][i];
//        }
//        return result;
//    }
    public int[] findSecondDiagonalElemenets() {
        int[] result = new int[columnSize];
        for (int i = columnSize-1, j = 0; i >= 0 && j < columnSize; i--, j++) {
            result[j] = arr[j][i];
        }
        return result;
    }
    public void printArrayElementsinMatrixFormat() {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


}

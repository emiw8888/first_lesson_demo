import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyException {
    public static void main(String[] args) {
        //checked
        String fileName = "file does not exist";
        File file = new File(fileName);
        try {
            FileInputStream stream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //unchecked
        Scanner sc = new Scanner(System.in);


        try{
            int[] arr = new int[5];
            myException(arr,6);
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("sifira bolme");
        }catch (InputMismatchException e){
            System.out.println("integer daxil et");
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
    static int myException(int[] arr,int index) throws IndexOutOfBoundsException{
        if(arr.length <= index || index < 0){
            throw new IndexOutOfBoundsException("out of the array");
        }
        return arr[index];
    }
}



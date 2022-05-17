import java.util.Scanner;

public class CountOfWordsInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String word = "";
        int count = 0;
        for (char a : sentence.trim().toCharArray()) {
            if(a >= 65 && a <= 90 || a >= 97 && a<=122){
                word = word +  a;
            }
            else if(!word.equals("")){
                count++;
                word = "";
            }
        }count++;
        System.out.println(count);
    }
}

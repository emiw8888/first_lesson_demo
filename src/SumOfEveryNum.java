public class SumOfEveryNum {
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5,6));
    }
    static int sum(int ... a){
        int sum = 0;
        for (int i : a) {
            sum+=i;
        }
        return sum;
    }
}

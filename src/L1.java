import java.util.Scanner;

public class L1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int n = (int) (1 + Math.random() * 11);
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (-10 + Math.random() * 20);
        }
        test(str,arr,n);


    }

    public static void test(String str, int[] arr, int n) {
        int x = Integer.parseInt(str);
        for (int s : arr) {
            if (x / s == 0) {
                throw new MyArithmeticException("Delenie na 0");
            }
        }
    }
}

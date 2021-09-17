import java.util.Scanner;


public class Hello {
    public static void main(String[] args) {
        // задание 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 -e число");

        int a = scanner.nextInt();

        System.out.println("Введите 2 -e число");

        int b = scanner.nextInt();
        System.out.println("ghjghj");
        // while (a< b){
        //   System.out.println(a);
        //  a++;
        // }
        // for (; a<b; a++) {
        // System.out.println(a);

        //}

        //for (; a < b; a++) {
        //  if (a % 2 == 0) {
        //     System.out.println(a);
        // }
        // }

        // if (a > b) {
        //  int c = a;
        //  a = b;
        // b = c;
        // }

        // for (; a < b; a++) {
        //  if (a % 2 != 0) {
        //    System.out.println(a);
        // }

        // }

       // int summ = 0;
        //for (; a <= b; a++ ) {

           // summ = summ + a;}

           // System.out.println(summ);
           // System.out.println(summ / 2);

            int x = 1;
            for (;a>1; a--){
                x = x*a;
                System.out.println(x);
            }



    }
}











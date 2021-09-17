import java.io.*;
import java.util.Scanner;

public class L3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String str = scanner.nextLine();
        try {
            InputStream in = new FileInputStream(str);
            byte[] b = new byte[in.available()];
            in.read(b);
            System.out.println(new String(b));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

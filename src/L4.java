import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class L4 {
    public static void main(String[] args) {

        try {
            FileReader fr = null;
            try {
                fr = new FileReader("D:/Staselko/File1.txt");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            BufferedReader br = new BufferedReader(fr);
            String str = null;
            int z = 0;
            str = br.readLine();
            String s = "";
            while (str != null) {

                try {
                    str = br.readLine();
                    System.out.println(str);
                    s = s + str;

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(s);
            String[] ar = s.split(" ");
            for (String string : ar){
                if (string == "aaa"){
                    z++;
                }
            }
             System.out.println(z);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


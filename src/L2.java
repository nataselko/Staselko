import java.util.ArrayList;
import java.util.List;

public class L2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(5);
        list.add("fghf");
        list.add("fglf");
        list.add("fgf");
        list.add(0, "Hello");

        System.out.println(list.get(2));
        System.out.println(list.get(0));
        System.out.println(list.equals("A"));
        System.out.println(list.set(1, "World"));
        System.out.println(list);
        list.clear();
        System.out.println(list);



    }
}

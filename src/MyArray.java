import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите чмсло");
        //String ss = scanner.next();
        List<Integer> l = new ArrayList<Integer>();
        l.add(Integer.parseInt(scanner.next()));
        int i = 0;
        String str = "100";


        while (Integer.parseInt(str) != 6) {
            System.out.println("1. Добавить элемент всписок");
            System.out.println("2. удалить элемент");
            System.out.println("3. Показать список");
            System.out.println("4. Проверить, есть ли элемент");
            System.out.println("5. Заменить элемент");
            System.out.println("6. Выход");
            str = scanner.next();

            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.println(" ошибка");
            }

            switch (i) {
                case (1):
                    System.out.println("Введите элемент");
                    l.add(Integer.parseInt(scanner.next()));
                    break;
                case (2):
                    System.out.println("Введите элемент");
                    l.remove(Integer.parseInt(scanner.next()));
                    break;
                case (3):
                    System.out.println(l.toString());
                    break;
                case (4):
                    System.out.println("Введите элемент");
                    System.out.println(l.contains(Integer.parseInt(scanner.next())));
                    break;
                case (5):
                    l.add(l.get(Integer.parseInt(scanner.next())),10);
            }
        }
    }
}

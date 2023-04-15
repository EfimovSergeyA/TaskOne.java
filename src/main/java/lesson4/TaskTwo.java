//Реализовать консольное приложение, которое:
//Принимает от пользователя строку вида text~num
//Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.

package lesson4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
public class TaskTwo {
    private static void getUserStringAndRemove() {
        int size = 10;
        Scanner in = new Scanner(System.in);
        LinkedList<String> ll = new LinkedList<>();
        while (true) {
            System.out.printf("Введите текст-позицию: ");
            String text = in.nextLine();
            String[] array = text.split("\\~");
            System.out.println(Arrays.toString(array));
            int index = Integer.parseInt(array[1]);
            String value = array[0];
            if (value.equals("print")) {
                System.out.println(ll.get(index));
                ll.remove(index);
            } else {
                if (index < ll.size()) {
                    ll.set(index, value);
                } else {
                    ll.add(value);
                }
            }
            System.out.println(ll);
        }
    }
}

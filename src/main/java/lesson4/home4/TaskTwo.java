//1. Реализовать консольное приложение, которое:
//Принимает от пользователя и “запоминает” строки.
//Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//Если введено revert, удаляет предыдущую введенную строку из памяти.
package lesson4.home4;

import java.util.LinkedList;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        LinkedList<String> inputLinkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String srtFromCons;
        System.out.println("Введите значение для строки.\nДля выхода используйте 'print'");

        while (!(srtFromCons = scanner.nextLine()).equals("print"))
            inputLinkedList.addFirst(srtFromCons);
        scanner.close();
        System.out.println("Получился перевёрнутый LinkedList: " + inputLinkedList.toString());
    }
}

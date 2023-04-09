//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

package lesson5.home5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TaskOne {
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }
    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Baranov", 1234, bookPhone);
        addNumber("Baranov", 987, bookPhone);
        addNumber("Grishin", 765, bookPhone);
        addNumber("Baranov", 543, bookPhone);
        addNumber("Grishin", 321, bookPhone);
        addNumber("Evseev", 55555, bookPhone);
        printBook(bookPhone);
    }
}

//Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом
// (возвращает boolean значение).
package lesson2.homework2;
import java.util.Scanner;
public class TaskOne {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s=scan.next();
        isPalindrome(s);
    }
    public static String reverseString(String s){
        String r = "";
        for (int i = s.length() - 1; i >= 0; --i)
            r += s.charAt(i);
        return r;

    }
    public static Boolean isPalindrome(String s) {
        if(s.equals(reverseString(s))){
            System.out.println("Полиндром");
        }else{
            System.out.println("Не полиндром");
        }
        return s.equals(reverseString(s));

    }
}


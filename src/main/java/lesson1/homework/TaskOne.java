package lesson1.homework;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class TaskOne {
    public static void main(String[] args) {
        Integer[] A = { 45, 444, 458, 48, 541, 459 };

        List<Integer> ints = Arrays.asList(A);

        System.out.println("Min =  " + Collections.min(ints));
        System.out.println("Max =  " + Collections.max(ints));
    }
}
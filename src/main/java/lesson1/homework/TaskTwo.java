package lesson1.homework;

public class TaskTwo {
    public static void main(String[] args) {
        int k = 4;
        int[] b = {1, 4, 3, 4, 3, 6, 11, 8};
        int[] a = b;

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        numtoend(a, b, k);
    }

    public static void numtoend(int[] a, int[] b, int k) {
        int j = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] != k) {
                a[j] = b[i];
                j++;
            }
        }
        for (int i = j; i < a.length; i++) {
            a[i] = k;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
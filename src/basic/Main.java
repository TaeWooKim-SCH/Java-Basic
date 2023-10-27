package basic;

public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[100];

        array1[0] = 50;
        array1[50] = 100;

        int[] array2 = {1, 2, 3, 4};

        int[] array3 = new int[] {1, 2, 3, 4};

        System.out.println(array2[0]);
        System.out.println(array3[0]);
        System.out.println(array1[50]);
    }
}
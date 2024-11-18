import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println();
        int[] arr1 = new int[]{1, 2, 3,};
        float[] arr2 = {1.57F, 7.654F, 9.986F};
        char[] arr3 = {'a', 'b', 'c'};
        System.out.println();

        //Task2
        System.out.println("Задача 2");
        System.out.println();
        int i;
        for (i = 0; i < arr1.length - 1; ++i) {
            System.out.print(arr1[i] + ", ");
        }
        System.out.println(arr1[i]);
        System.out.println();
        for (i = 0; i < arr2.length - 1; ++i) {
            System.out.print(arr2[i] + ", ");
        }
        System.out.println(arr2[i]);
        System.out.println();
        for (i = 0; i < arr3.length - 1; ++i) {
            System.out.print(arr3[i] + ", ");
        }
        System.out.println(arr3[i]);
        System.out.println();

        //Task3
        System.out.println("Задача 3");
        System.out.println();
        for (i = arr1.length - 1; i > 0; --i) {
            System.out.print(arr1[i] + ", ");
        }
        System.out.println(arr1[i]);
        System.out.println();

        for (i = arr2.length - 1; i > 0; --i) {
            System.out.print(arr2[i] + ", ");
        }
        System.out.println(arr2[i]);
        System.out.println();

        for (i = arr3.length - 1; i > 0; --i) {
            System.out.print(arr3[i] + ", ");
        }
        System.out.println(arr3[i]);
        System.out.println();

        //Task4
        System.out.println("Задача 4");
        System.out.println();
        for (i = 0; i < arr1.length;i++) {
            if (arr1[i] % 2 != 0) {
                System.out.print(arr1[i]+" - нечетное число.");
                arr1[i] += 1;
                System.out.print(" Оно преобразованно в - "+arr1[i]+".");
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("Теперь масив выглядит так:");
            System.out.print(Arrays.toString(arr1));
    }
}

/*
1. Задать целочисленный массив, состоящий из элементов 0 и 1.
Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
С помощью цикла и условия заменить 0 на 1, 1 на 0;
 */

package lesson_2;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 0, 1, 1, 0, 0, 0, 1};
        invertArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
    }

}

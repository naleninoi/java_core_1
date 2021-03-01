/*
2. Задать пустой целочисленный массив размером 8.
С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
 */

package lesson_2;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
        int[] arr = new int[8];
        fillArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void fillArray(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = counter;
            counter += 3;
        }
    }

}

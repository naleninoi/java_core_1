/*
5. ** Задать одномерный массив и найти в нем
минимальный и максимальный элементы (без помощи интернета);
 */

package lesson_2;

import java.util.Arrays;

public class Task5 {

    public static void main(String[] args) {
        int[] arr = {-12, 54, 87, -25, 1, 94, 47, -2, 69, 0};
        int[] extremesOfArray = findExtremes(arr);
        System.out.println("Минимальное и максимальное значания массива:" + Arrays.toString(extremesOfArray));
    }

    public static int[] findExtremes(int[] arr) {
        int min, max;
        min = max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return new int[] {min, max};
    }

}

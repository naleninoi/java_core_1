/*
6. ** Написать метод, в который передается не пустой
одномерный целочисленный массив,
метод должен вернуть true, если в массиве есть место,
в котором сумма левой и правой части массива равны.
Примеры:
checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) →true,
checkBalance([1, 1, 1, || 2, 1]) → true,
граница показана символами ||, эти символы в массив не входят.
 */

package lesson_2;

public class Task6 {

    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(checkBalance(arr));
    }

    public static boolean checkBalance(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int sumLeft = 0;
            int sumRight = 0;
            for (int l = 0; l <= i; l++) {
                sumLeft += arr[l];
            }
            for (int r = i + 1; r < arr.length; r++) {
                sumRight += arr[r];
            }
            if (sumLeft == sumRight) {
                return true;
            }
            i++;
        }
        return false;
    }

}

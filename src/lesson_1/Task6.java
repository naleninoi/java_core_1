/*
 6. Написать метод, которому в качестве параметра
 передается целое число. Метод должен вернуть true,
 если число отрицательное, и вернуть false если положительное.
 */

package lesson_1;

public class Task6 {

    public static void main(String[] args) {
        System.out.println(isNegative(-14));
    }

    public static boolean isNegative(int i) {
        return i < 0;
    }
}

/*
 4. Написать метод, принимающий на вход два целых числа
 и проверяющий, что их сумма лежит в пределах
 от 10 до 20 (включительно), если да – вернуть true,
 в противном случае – false.
 */

package lesson_1;

public class Task4 {

    public static void main(String[] args) {
        System.out.println(testCompare(-5, 18));
    }

    public static boolean testCompare(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }
}

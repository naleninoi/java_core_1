/*
  3. Написать метод, вычисляющий выражение a * (b + (c / d))
  и возвращающий результат,
  где a, b, c, d – аргументы этого метода, имеющие тип float.
 */

package lesson_1;

public class Task3 {
    public static void main(String[] args) {
        float a, b, c, d;
        a = 10.15f;
        b = 34.16f;
        c = 5463.354f;
        d = 984.1303f;
        System.out.println(testCount(a, b, c, d));
    }

    public static float testCount(float a, float b, float c, float d) {
        return a * (b + c / d);
    }
}

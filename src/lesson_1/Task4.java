package lesson_1;

public class Task4 {

    public static void main(String[] args) {
        System.out.println(testCompare(-5, 18));
    }

    public static boolean testCompare(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }
}

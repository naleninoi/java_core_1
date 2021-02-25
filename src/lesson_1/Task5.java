package lesson_1;

public class Task5 {
    public static void main(String[] args) {
        isPositive(25);
    }

    public static void isPositive(int i) {
        if(i >=0) {
            System.out.println("Число " + i + " положительное (или ноль).");
        } else {
            System.out.println("Число " + i + " отрицательное.");
        }
    }
}

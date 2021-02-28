/*
 8. * Написать метод, который определяет,
 является ли год високосным, и выводит сообщение в консоль.
 Каждый 4-й год является високосным,
 кроме каждого 100-го, при этом каждый 400-й – високосный.
 */

package lesson_1;

public class Task8 {

    public static void main(String[] args) {
        int year = 2100;
        isBissextile(year);
    }

    public static void isBissextile(int year) {
        if(year % 400 == 0) {
            System.out.println("Год " + year + " - високосный.");
        } else {
            if(year % 4 == 0 && year % 100 != 0) {
                System.out.println("Год " + year + " - високосный.");
            } else {
                System.out.println("Год " + year + " - невисокосный.");
            }
        }
    }

}

/*
 7. Написать метод, которому в качестве параметра
 передается строка, обозначающая имя.
 Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
 */


package lesson_1;

public class Task7 {

    public static void main(String[] args) {
        String name = "Иван Бабушкин";
        hello(name);
    }

    public static void hello(String name) {
        System.out.println("Привет, " + name + "!");
    }
}

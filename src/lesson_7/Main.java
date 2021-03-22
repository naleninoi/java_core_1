/**
 * 1.	Расширить задачу про котов и тарелки с едой.
 * 2.	Сделать так, чтобы в тарелке с едой не могло получиться
 * отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
 * 3.	Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
 * Если коту удалось покушать (хватило еды), сытость = true.
 * 4.	Считаем, что если коту мало еды в тарелке, то он её просто не трогает,
 * то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
 * 5.	Создать массив котов и тарелку с едой, попросить всех котов
 * покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
 * 6.	Добавить в тарелку метод, с помощью которого можно было
 * бы добавлять еду в тарелку.
 */

package lesson_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CatsGenerator catsGenerator = new CatsGenerator();
        Cat[] cats = catsGenerator.generateCats(10);
        Plate plate = new Plate(25);

        feedCats(cats, plate);
    }

    static void feedCats(Cat[] cats, Plate plate) {
        Scanner scanner = new Scanner(System.in);
        int totalCats = cats.length;
        int hungryCats;
        int fedCats = 0;

        do {
            for (Cat cat : cats) {
                if (!cat.isFed()) {
                    cat.eat(plate);
                    System.out.println(cat);
                    if (cat.isFed()) fedCats++;
                }
            }
            hungryCats = totalCats - fedCats;
            System.out.printf("Total cats: %d, cats fed: %d, cats still hungry: %d%n",
                    totalCats, fedCats, hungryCats);

            if (hungryCats > 0) {
                System.out.print("Cats are still hungry! You've got to add some food.\n" +
                        "How much food? > ");
                plate.addFood(scanner.nextInt());
            }

        } while (hungryCats > 0);
    }

}

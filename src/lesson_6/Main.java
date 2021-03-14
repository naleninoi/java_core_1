/**
 * 1. Создать классы Собака и Кот с наследованием от класса Животное.
 * 2. Все животные могут бежать и плыть.
 * В качестве параметра каждому методу передается длина препятствия.
 * Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
 * 3. У каждого животного есть ограничения на действия (бег: кот 200 м.,
 * собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
 * 4. * Добавить подсчет созданных котов, собак и животных.
 */

package lesson_6;

public class Main {
    public static void main(String[] args) {
        Dog dogSnoopy = new Dog("Snoopy", "terrier");
        System.out.println(dogSnoopy);
        dogSnoopy.run(1800);
        dogSnoopy.swim(15);

        Cat catTom = new Cat("Tom", "black");
        System.out.println(catTom);
        catTom.run(300);
        catTom.swim(30);

        System.out.printf("Total number of animals: %d.%n", Animal.getAnimalsCounter());
        System.out.printf("Total number of dogs: %d.%n", Dog.getDogsCounter());
        System.out.printf("Total number of cats: %d.%n", Cat.getCatsCounter());
    }
}

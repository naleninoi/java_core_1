package lesson_7;

import java.util.Random;

public class CatsGenerator {

    private final String[] names = {"Murzik", "Barsik", "Keks", "Mars", "Persik", "Markiz"};
    private final Random rand = new Random();

    public Cat[] generateCats(int n) {
        Cat[] cats = new Cat[n];
        final int maxCatAppetite = 10;
        final int minCatAppetite = 1;

        int[] numbers = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            numbers[i] = 1;
        }

        for (int i = 0; i < n; i++) {
            int catNum = rand.nextInt(names.length);
            String name = names[catNum] + "-" + String.valueOf(numbers[catNum]);
            numbers[catNum]++;
            cats[i] = new Cat(name, generateCatAppetite(minCatAppetite, maxCatAppetite));
        }
        return cats;
    }

    private int generateCatAppetite(int min, int max) {
        int diff = max - min;
        int appetite = rand.nextInt(diff + 1);
        return appetite += min;
    }

}

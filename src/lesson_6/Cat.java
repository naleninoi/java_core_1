package lesson_6;

public class Cat extends Animal {

    private String color;

    private static int catsCounter;

    public Cat(String name, String color) {
        setName(name);
        this.color = color;
        catsCounter += 1;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static int getCatsCounter() {
        return catsCounter;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + getName() + "';" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public void run(int range) {
        range = range < 0 ? 0 : range;
        range = range > 200 ? 200 : range;
        System.out.printf("%s the cat has run %d metres.%n", getName(), range);
    }

    @Override
    public void swim(int range) {
        System.out.printf("%s the cat can't swim at all!%n", getName());
    }
}

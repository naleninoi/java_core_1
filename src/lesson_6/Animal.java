package lesson_6;

public abstract class Animal {

    private String name;

    private static int animalsCounter;

    public Animal() {
        animalsCounter +=1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getAnimalsCounter() {
        return animalsCounter;
    }

    public abstract void run(int range);

    public abstract void swim(int range);

}

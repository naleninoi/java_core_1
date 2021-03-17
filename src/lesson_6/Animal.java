package lesson_6;

public abstract class Animal {

    private String name;
    private int maxRunRange;
    private int maxSwimRange;

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

    public int getMaxRunRange() {
        return maxRunRange;
    }
    public void setMaxRunRange(int maxRunRange) {
        this.maxRunRange = maxRunRange;
    }

    public int getMaxSwimRange() {
        return maxSwimRange;
    }
    public void setMaxSwimRange(int maxSwimRange) {
        this.maxSwimRange = maxSwimRange;
    }

    public static int getAnimalsCounter() {
        return animalsCounter;
    }

    public abstract void run(int range);

    public abstract void swim(int range);

}

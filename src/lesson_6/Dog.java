package lesson_6;

public class Dog extends Animal {

    private String breed;
    private static int dogsCounter;

    public Dog(String name, String breed) {
        setName(name);
        this.breed = breed;
        setMaxRunRange(500);
        setMaxSwimRange(10);
        dogsCounter += 1;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public static int getDogsCounter() {
        return dogsCounter;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + getName() + "';" +
                "breed='" + breed + '\'' +
                '}';
    }

    @Override
    public void run(int range) {
        range = range < 0 ? 0 : range;
        range = range > getMaxRunRange() ? getMaxRunRange() : range;
        System.out.printf("%s the dog has run %d metres.%n", getName(), range);
    }

    @Override
    public void swim(int range) {
        range = range < 0 ? 0 : range;
        range = range > getMaxSwimRange() ? getMaxSwimRange() : range;
        System.out.printf("%s the dog has swum %d metres.%n", getName(), range);
    }
}

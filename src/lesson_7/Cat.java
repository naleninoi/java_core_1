package lesson_7;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFed;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFed = false;
    }

    public boolean isFed() {
        return isFed;
    }

    public void eat (Plate p) {
        if (p.getFood() >= appetite) {
            p.decreaseFood(appetite);
            isFed = true;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", isFed=" + isFed +
                '}';
    }
}

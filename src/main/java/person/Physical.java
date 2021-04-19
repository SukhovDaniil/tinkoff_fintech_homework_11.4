package person;

public class Physical {

    private int age;
    private int weight;
    private double height;

    /**
     * @return Возраст.
     */
    public int getAge() {
        return age;
    }

    /**
     * @return Вес.
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @return Рост.
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param age Возраст.
     */
    public void setAge(final int age) {
        this.age = age;
    }

    /**
     * @param weight Вес.
     */
    public void setWeight(final int weight) {
        this.weight = weight;
    }

    /**
     * @param height Рост.
     */
    public void setHeight(final double height) {
        this.height = height;
    }

    @Override
    public final String toString() {
        return String.format("Возраст:\t%1$s%nВес:\t\t%2$s кг%nРост:\t\t%3$s м", age, weight, height);
    }
}

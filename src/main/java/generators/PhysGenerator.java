package generators;

import person.Physical;

public class PhysGenerator extends Generator<Physical> {
    /**
     * Физические параметры генерируются по второй цифре кода:
     * Возраст: 10..100
     * Вес: 30..120 кг
     * Рост: 1..1,9 м.
     */
    @Override
    public final void generateParams(final int code) {
        result = new Physical();
        final int i = code % 1000 / 100;
        result.setAge((i + 1) * 10);
        result.setWeight(30 + i * 10);
        result.setHeight((100 + i * 10) / 100.00);
    }
}

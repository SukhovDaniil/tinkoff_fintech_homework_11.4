package generators;

import person.appearance.Appearance;
import person.appearance.EyesColor;
import person.appearance.hair.LongHair;
import person.appearance.hair.NoHair;
import person.appearance.hair.ShortHair;

import java.util.HashMap;

public class AppearanceGenerator extends Generator<Appearance> {


    private final HashMap<Integer, String> hairColorMap = new HashMap<>() {{
        put(1, "чёрные");
        put(2, "каштановые");
        put(3, "рыжие");
        put(4, "светлые");
        put(5, "седые");
        put(6, "розовые");
        put(7, "зелёные");
        put(8, "фиолетовые");
        put(9, "синие");
    }};

    /**
     * Внешность генерируется по третьей цифре кода (i):
     * Глаза: по индексу i/2 (=0..4)
     * Длина волос: i
     * Цвет волос: из enum по индексу i-1 при i>0 (=0..8).
     */
    @Override
    public final void generateParams(final int code) {
        result = new Appearance();
        final int i = code % 100 / 10;
        switch (i / 2) {
            case 0:
                result.setEyes(EyesColor.BLUE);
                break;
            case 1:
                result.setEyes(EyesColor.GREEN);
                break;
            case 2:
                result.setEyes(EyesColor.BROWN);
                break;
            case 3:
                result.setEyes(EyesColor.GRAY);
                break;
            case 4:
                result.setEyes(EyesColor.DIFF);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + i / 2);
        }

        if (i > 0) {
            String hairColor = hairColorMap.get(i);
            result.setHair((i > 4) ? new LongHair(hairColor) : new ShortHair(hairColor));
        } else {
            result.setHair(new NoHair());
        }
    }

}


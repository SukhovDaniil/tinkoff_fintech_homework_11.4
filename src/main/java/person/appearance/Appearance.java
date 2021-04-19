package person.appearance;

import person.appearance.hair.Hair;

public class Appearance {

    private EyesColor eyes;
    private Hair hair;

    /**
     * @return Объект типа Hair.
     */
    public Hair getHair() {
        return hair;
    }

    /**
     * @return Объект типа EyesColor.
     */
    public EyesColor getEyes() {
        return eyes;
    }

    /**
     * @param eyes Цвет глаз персоны.
     */
    public void setEyes(final EyesColor eyes) {
        this.eyes = eyes;
    }

    /**
     * @param hair Волосы (цвет и тип)
     */
    public void setHair(final Hair hair) {
        this.hair = hair;
    }

    @Override
    public final String toString() {
        return String.format("Глаза:\t\t%1$s%nВолосы:\t\t%2$s", eyes, hair.toString());
    }
}

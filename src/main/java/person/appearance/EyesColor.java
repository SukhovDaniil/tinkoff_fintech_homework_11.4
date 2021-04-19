package person.appearance;

public enum EyesColor {

    BLUE("голубые"),
    GREEN("зелёные"),
    BROWN("карие"),
    GRAY("серые"),
    DIFF("разные");

    private final String ruColor;

    EyesColor(final String ruColor) {
        this.ruColor = ruColor;
    }

    @Override
    public String toString() {
        return this.ruColor;
    }
}

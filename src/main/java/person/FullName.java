package person;

public class FullName {
    private String lastName;
    private String firstName;
    private String middleName;

    /**
     * @param lastName Отчество.
     */
    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    /**
     * @param firstName Имя.
     */
    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    /**
     * @param middleName Фамилия.
     */
    public void setMiddleName(final String middleName) {
        this.middleName = middleName;
    }

    /**
     * @return Строку с отчеством.
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * @return Строку с именем.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return Строку с фамилией.
     */
    public String getMiddleName() {
        return middleName;
    }

    @Override
    public final String toString() {
        return String.format("%1$s %2$s %3$s", this.lastName, this.firstName, this.middleName);
    }
}

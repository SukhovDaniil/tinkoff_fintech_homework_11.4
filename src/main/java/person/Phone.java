package person;

public class Phone {

    private String number;

    /**
     * @return Телефонный номер.
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number Телефонный номер.
     */
    public void setNumber(final String number) {
        this.number = number;
    }

    @Override
    public final String toString() {
        return "Телефон:\t" + number;
    }
}

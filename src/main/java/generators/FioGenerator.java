package generators;

import person.FullName;

import static utils.FileReader.getLinesFromFile;
import static utils.MyMath.getDigitsSum;

public class FioGenerator extends Generator<FullName> {
    /**
     * ФИО берутся из соответствующих файлов по индексу в листе:
     * Фамилия - сумма цифр в коде
     * Имя - сумма первых двух цифр
     * Отчество - сумма последних двух цифр.
     *
     * @param code код для генерации
     */
    @Override
    protected void generateParams(final int code) {
        result = new FullName();
        final int lastNameIndex = getDigitsSum(code);
        final String sex = (lastNameIndex % 2 == 0) ? "f" : "m";
        setLastNameFromFile(lastNameIndex, sex);
        setFirstNameFromFile(getDigitsSum(code / 100), sex);
        setMiddleNameFromFile(getDigitsSum(code % 100), sex);
    }


    private void setLastNameFromFile(final int i, final String sex) {
        result.setLastName(getLinesFromFile("lastNames_" + sex).get(i));
    }

    private void setFirstNameFromFile(final int i, final String sex) {
        result.setFirstName(getLinesFromFile("names_" + sex).get(i));
    }

    private void setMiddleNameFromFile(final int i, final String sex) {
        result.setMiddleName(getLinesFromFile("middleNames_" + sex).get(i));
    }
}


import generators.AppearanceGenerator;
import generators.FioGenerator;
import generators.PhoneGenerator;
import generators.PhysGenerator;
import person.FullName;
import person.Person;
import person.Phone;
import person.Physical;
import person.appearance.Appearance;

public class InputProcessor {

    public final String processInput(final String input) {
        String result;

        if (input.trim().matches("\\d{4}")) {
            // Создаём Person
            final int intCode = Integer.parseInt(input);

            final FioGenerator fioGenerator = new FioGenerator();
            final FullName fullName = fioGenerator.buildResponse(intCode);

            final PhysGenerator physGenerator = new PhysGenerator();
            final Physical physical = physGenerator.buildResponse(intCode);

            final AppearanceGenerator appearanceGenerator = new AppearanceGenerator();
            final Appearance appearance = appearanceGenerator.buildResponse(intCode);

            Phone phone = null;
            // добавляем телефон, только если введённый код не палиндром
            if (!input.equals(new StringBuilder(input).reverse().toString())) {
                final PhoneGenerator phoneGenerator = new PhoneGenerator();
                phone = phoneGenerator.buildResponse(intCode);
            }

            result = new Person.Builder(input)
                    .setFullName(fullName)
                    .setPhysical(physical)
                    .setAppearance(appearance)
                    .setPhone(phone)
                    .build()
                    .toString();
        } else {
            result = "Неверный ввод.";
        }
        return result;
    }
}

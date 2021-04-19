package person;

import person.appearance.Appearance;

public class Person {

    private String id;
    private FullName fullName;
    private Physical phys;
    private Appearance appearance;
    private Phone phone;

    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder()
                .append(id).append("\n")
                .append(this.fullName).append("\n")
                .append(phys).append("\n")
                .append(appearance).append("\n");
        if (phone != null) {
            sb.append(phone);
        } else {
            sb.append("Телефона нет");
        }
        return sb.toString();
    }

    public static class Builder {
        private String id;
        private FullName fullName;
        private Physical phys;
        private Appearance appearance;
        private Phone phone;

        /*
         * Идентификатор является обязательным, т.к. может существовать человек без инициалов, физических данных
         * и пр. (например при регистрации новорожденного перечисленные параметры могут быть ещё в процессе уточнения,
         * но запись необходимо создать и задать ей уникальный идентификатор)
         */
        public Builder(final String id) {
            this.id = id;
        }

        /**
         * @param fullname ФИО.
         * @return Объект билдера.
         */
        public Builder setFullName(final FullName fullname) {
            this.fullName = fullname;
            return this;
        }

        /**
         * @param physical Физические данные: возраст, вес, рост.
         * @return Объект билдера.
         */
        public Builder setPhysical(final Physical physical) {
            this.phys = physical;
            return this;
        }

        /**
         * @param appearanceData Внешность: цвет глаз, длину и цвет волос (если есть).
         * @return Объект билдера.
         */
        public Builder setAppearance(final Appearance appearanceData) {
            this.appearance = appearanceData;
            return this;
        }

        /**
         * @param phoneNumber Номер телефона.
         * @return Объект билдера.
         */
        public Builder setPhone(final Phone phoneNumber) {
            this.phone = phoneNumber;
            return this;
        }

        /**
         * Завершает сборку объекта персоны.
         *
         * @return Объект типа Person.
         */
        public Person build() {
            final Person person = new Person();
            person.id = this.id;
            person.fullName = this.fullName;
            person.phys = this.phys;
            person.appearance = this.appearance;
            person.phone = this.phone;
            return person;
        }
    }
}
package secondModule.tasks;

public class Second {
    public enum Day {
        MONDAY("Понедельник"),
        TUESDAY("Вторник"),
        WEDNESDAY("Среда"),
        THURSDAY("Четверг"),
        FRIDAY("Пятница"),
        SATURDAY("Суббота"),
        SUNDAY("Воскресенье");
        private final String rusNames;
        Day(String rusNames) {
            this.rusNames = rusNames;
        }
        public boolean isWeekend() {
            return this == SATURDAY || this == SUNDAY;
        }

        public String getRusName() {
            return this.rusNames;
        }
    }
}

package LmsTask;

public enum Days {
    MONDAY("Дуйшөмбү куну жава окуйм"),
    TUESDAY("Шейшемби күнү англис тили сабагын окуйм"),
    WEDNESDAY("Жекшемби куну talking club болот"),
    THURSDAY("Бейшемби куну seccion отом"),
    FRIDAY("Жума куну технический сабак болот"),
    SATURDAY("Оз алдынча иштейм "),
    SUNDAY("Уйдон оз алдынча иштейм ");
    private String dayName;
    Days(String dayName) {
        this.dayName = dayName;
    }
    public String getDayName() {
        return dayName;
    }
}


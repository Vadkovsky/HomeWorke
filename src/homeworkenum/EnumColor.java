package homeworkenum;

public enum EnumColor {
    /**
     * Фиолетовый.
     */
    ANSI_PURPLE("\u001B[35m"),
    /**
     * Желтый.
     */
    ANSI_YELLOW("\u001B[33m"),
    /**
     * Сброс цвета.
     */
    ANSI_RESET("\u001B[0m"),
    /**
     * Чёрный.
     */
    ANSI_BLACK("\u001B[30m"),
    /**
     * Красный.
     */
    ANSI_RED("\u001B[31m"),
    /**
     * Зеленый.
     */
    ANSI_GREEN("\u001B[32m"),
    /**
     * Синий.
     */
    ANSI_BLUE("\u001B[34m"),
    /**
     * Бирюзовый.
     */
    ANSI_CYAN("\u001B[36m"),
    /**
     * Белый.
     */
    ANSI_WHITE("\u001B[37m");
    /**
     * Переменная хранящая цвет.
     */
    private String color;

    EnumColor(final String getColor) {
        this.color = getColor;
    }

    /**
     * Возвращаем цвет.
     *
     * @return color.
     */
    public String getColor() {
        return color;
    }

    /**
     * Возвращаем случайный цвет.
     *
     * @return color.
     */
    public static EnumColor getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}
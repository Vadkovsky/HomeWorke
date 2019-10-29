package homeworkenum;

import homeworkgenerics.Box;

public class Utils {
    /**
     * Гланвный метод.
     * @param args .
     */
    public static void main(final String[] args) {
        String biba = "test text for color";
        print(biba);
        print(biba, EnumColor.ANSI_GREEN);
        print(biba, EnumColor.getRandom());
        magicMethod("one", "two", "tree");
    }

    /**
     * Вывод текст в консоль.
     * @param text .
     */
    private static void print(final String text) {
        System.out.println(text);
    }

    /**
     * Выводим текст в консоль,
     * окрашенный в выбранный цвет.
     * @param text .
     * @param color .
     */
    private static void print(final String text, final EnumColor color) {
        System.out.println(color.getColor() + text);
    }

    /**
     * Метод, который принимает любой объект
     * и возвращает коробку с этим объектом.
     * @param obj1 .
     * @param obj2 .
     * @return Box.
     */
    public static Box magicBox(final Object obj1, final Object obj2) {
        return new Box<>(obj1, obj2);
    }

    /**
     * Метод, который принимает три любых объекта
     * и возвращает один (случайный) из переданных.
     * @param ob1 .
     * @param ob2 .
     * @param ob3 .
     * @return Object.
     */
    private static Object magicMethod(final Object ob1,
                                      final Object ob2,
                                      final Object ob3) {
        final int index = 3;
        Object[] arr = new Object[index];
        arr[0] = ob1;
        arr[1] = ob2;
        arr[2] = ob3;
        return arr[(int) (Math.random() * arr.length)];
    }
}
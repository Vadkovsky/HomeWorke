package homeworkgenerics;

public class Box<T1, T2> {
    /**
     * Объект Т1 типа.
     */
    private T1 object1;

    /**
     * Объект Т2 типа.
     */
    private T2 object2;
    /**
     * Сообщение об ошибке.
     */
    private static final String ERROR_1 = "Ошибка!"
            + " Такой обект уже есть!";
    /**
     * Сообщение об ошибке.
     */
    private static final String ERROR_2 = "Ошибка!"
            + " Объект пустой!";

    /**
     * Конструктор класса Box.
     * @param object3 .
     * @param object4 .
     */
    public Box(final T1 object3, final T2 object4) {
        object1 = object3;
        object2 = object4;
    }

    /**
     * Получаем объект типа T1.
     *
     * @return T1.
     */
    public T1 getObject1() {
        T1 objectTemp = null;
        if (object1 == null) {
            System.out.println(ERROR_2);
        } else {
            objectTemp = object1;
        }
        return objectTemp;
    }

    /**
     * Получаем объект типа T2.
     *
     * @return T2.
     */
    public T2 getObject2() {
        T2 objectTemp = null;
        if (object2 == null) {
            System.out.println(ERROR_2);
        } else {
            objectTemp = object2;
        }
        return objectTemp;
    }

    /**
     * Устанавливаем значение.
     *
     * @param obj - T1.
     */
    public void setObject1(final T1 obj) {
        if (object1.equals(obj)) {
            System.out.println(ERROR_1);
        } else {
            this.object1 = obj;
        }
    }

    /**
     * Устанавливаем значение.
     *
     * @param obj - T2.
     */
    public void setObject2(final T2 obj) {
        if (object2.equals(obj)) {
            System.out.println(ERROR_1);
        } else {
            this.object2 = obj;
        }
    }

    /**
     * Удаляем значение объекта.
     */
    public void deleteText() {
        if (object1 == null) {
            System.out.println(ERROR_2);
        } else {
            object1 = null;
        }
    }

    /**
     * Удаляем значение объекта.
     */
    public void deleteNumber() {
        if (object2 == null) {
            System.out.println(ERROR_2);
        } else {
            object2 = null;
        }
    }
}
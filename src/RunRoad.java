import java.util.Scanner;

public class RunRoad {
    private static int counter = 1;
    private static boolean trigger = true;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        do {
            System.out.println("Выберите режим работы:");
            System.out.println("1. Время +1 мин.");
            System.out.println("2. Режим Бег/Ходьба \n3. Выключить");
            int number = sc.nextInt();
            if (number == 1) {
                plusMin();
            } else if (number == 2) {
                menu2();
            } else if (number == 3) {
                stop();
            } else {
                System.out.println("Извините, но такой кнопки нет! \n");
            }
        } while (trigger);
    }

    private static void plusMin() {
        counter = counter + 1;
        System.out.println("Выбранное время = " + counter + " мин.");
        System.out.println();
    }

    private static void stop() {
        System.out.println("До свидания!");
        trigger = false;
    }

    private static void menu2() {
        System.out.println("Выберите скорость: \n0. Шаг \n1. Первая скорость \n2. Вторая скорость \n3. Третья скорость \n4. Назад \n");
        int number = sc.nextInt();

        if (number == 0) {
            walking();
        } else if (number == 1) {
            toRun1();
        } else if (number == 2) {
            toRun2();
        } else if (number == 3) {
            toRun3();
        } else if (number == 4) {
            back();
        } else {
            System.out.println("Извините, но такой скорости нет! \n");
        }
    }

    private static void walking() {
        System.out.println("Включен режим ходьбы. 60 шаг/мин \nИдите! \nРежим можно переключить через 1 минуту \n");
        timerRun();
    }

    private static void toRun1() {
        System.out.println("Включен 1 режим бега. 120 шаг/мин \nБегите! \nРежим можно переключить через 1 минуту \n");
        timerRun();
    }

    private static void toRun2() {
        System.out.println("Включен 2 режим бега. 180 шаг/мин \nБегите! \nРежим можно переключить через 1 минуту \n");
        timerRun();
    }

    private static void toRun3() {
        System.out.println("Включен 3 режим бега. 240 шаг/мин \nБегите! \nРежим можно переключить через 1 минуту \n");
        timerRun();
    }

    private static void back() {
        menu();
    }

    public static void timerRun() {
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

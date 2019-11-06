package Lambdas;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class CheckNumber {
    private static Scanner sc = new Scanner(System.in);
    private static int number;
    private static boolean b;
    private static CheckNumber one = new CheckNumber();

    public static void main(String[] args) {
        System.out.println("Первый пункт");
        System.out.println("Введите число: ");
        number = sc.nextInt();

        //свитч с вариантами ответа (какой метод выбрать)
        //в каждом варианте ты приравниваешь нужный метод к b
        System.out.println("Выберите номер метода (1, 2, 3)");
        switch (sc.nextInt()) {
            case 1:
                b = one.definitions((num) -> {
                    if (num % 15 == 0) {
                        return true;
                    } else return false;
                });
                break;
            case 2:
                //вторая реализация
                break;
            case 3:
                //третья реализация
                break;
            default:
                System.out.println("Хуйню пишешь");
        }

        if (b) {
            System.out.println("Делится без остатка");
        } else System.out.println("Не делится без остатка");

    }


    boolean definitions(MathProgram mathProgram) {
        return mathProgram.definition(number);
        //System.out.println(number);
    }
}

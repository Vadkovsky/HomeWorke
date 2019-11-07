package Lambdas;

import java.util.Scanner;

public class CheckNumber {
    private static Scanner sc = new Scanner(System.in);
    private static int number;
    private static boolean b;
    private static CheckNumber one = new CheckNumber();

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        System.out.println("Введите число: ");
        number = sc.nextInt();
        System.out.println("Выберите номер метода (1, 2, 3)");
        int i = sc.nextInt();
        switch (i) {
            case 1:
                b = division();
                if (b) {
                    System.out.println("Число делится без остатка на 15");
                } else System.out.println("Число не делится без остатка на 15");
                break;
            case 2:
                b = positiveNumber();
                if (b) {
                    System.out.println("Число положительное");
                } else System.out.println("Число не положительное");
                break;
            case 3:
                b = numberFibonacci();
                if (b) {
                    System.out.println("Число принадлежит к числам Фибоначчи");
                } else System.out.println("Число не принадлежит к числам Фибоначчи");
                break;
            default:
                System.out.println("Херню пишешь");
        }
    }

    private static boolean division() {
        return one.definitions((num) -> {
            if (num % 15 == 0) {
                return true;
            } else return false;
        });
    }

    private static boolean positiveNumber() {
        return one.definitions((num) -> {
            if (num > 0) {
                return true;
            } else return false;
        });
    }

    private static boolean numberFibonacci() {
        return one.definitions((num) -> {
            int count = 0;
            int countNext = 1;
            while (countNext < num) {
                int t;
                t = countNext;
                countNext = count + countNext;
                count = t;
            }
            if (num == countNext) {
                return true;
            } else return false;
        });
    }

    boolean definitions(MathProgram mathProgram) {
        return mathProgram.definition(number);
    }
}

package HomeWorkJavaCoreMain;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    private static List<Kittens> kittensArrayList = new ArrayList<>();

    public static void main(String[] args) {

        boolean test = true;
        kittensArrayList = getBuilders();
        System.out.println();
        do {
            System.out.println("Enter -help to see a list of available commands. \n" +
                    "Enter -exit to exit this program.");
            Scanner scanner = new Scanner(System.in);
            String command1 = scanner.nextLine();
            String textMessage = "List of available commands: \n" +
                    "-addKits - Add kittens \n" +
                    "-edit - To edit the parameters of kittens \n" +
                    "-listKits - List of kittens \n" +
                    "-addKitsInSale - Add kittens for sale \n" +
                    "-listSale - List of kittens for sale \n" +
                    "-sale - Sale of kittens \n" +
                    "-exit - Exit this program";

            switch (command1) {
                case "-help":
                    System.out.println(textMessage);
                    do {
                        String command2 = scanner.next();
                        switch (command2) {
                            case "-addKits":
                                try {
                                    addKits();
                                } catch (DuplicatesException e) {
                                    System.out.println(e.getMessage());
                                }
                                System.out.println(textMessage);
                                break;
                            case "-edit":
                                edit();
                                System.out.println("\n" + textMessage);
                                break;
                            case "-listKits":
                                listKits();
                                System.out.println("\n" + textMessage);
                                break;
                            case "-addKitsInSale":
                                try {
                                    addKitsInSale();
                                } catch (AgeException e) {
                                    System.out.println(e.getMessage());
                                }
                                System.out.println("\n" + textMessage);
                                break;
                            case "-listSale":
                                listSale();
                                System.out.println("\n" + textMessage);
                                break;
                            case "-sale":
                                sale();
                                System.out.println("\n" + textMessage);
                                break;
                            case "-exit":
                                test = false;
                                break;
                            default:
                                System.out.println("Not found this command. \n" + textMessage);
                                break;
                        }

                    } while (test);
                case "-exit":
                    test = false;
                    break;
                default:
                    System.out.println("Not found this command.");
            }
        } while (test);
        System.out.println("Good bye!");
    }

    //МЕТОДЫ

    //Метод считывания объектов из файла
    private static List<Kittens> getBuilders() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Kittens.txt"));
            kittensArrayList = (ArrayList<Kittens>) ois.readObject();
        } catch (Exception e) {
            System.out.println("The Kittens.txt file does not exist or is empty.");
        }
        return kittensArrayList;
    }

    //Метод добавления котенка
    private static void addKits() throws DuplicatesException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nickname of the kitten: ");//кличка
        String nickname = sc.next();
        System.out.println("Enter the age of the kitten: ");//возраст в днях
        int age = sc.nextInt();
        System.out.println("Enter the growth of the kitten: ");//рост в сантиметрах
        int growth = sc.nextInt();
        System.out.println("Enter the weight of the kitten: ");//масса в граммах
        int weight = sc.nextInt();
        System.out.println("Enter the color of the kitten: ");//цвет
        String color = (sc.next());
        boolean sale = false;
        boolean param = true;
        for (Kittens kittens : kittensArrayList) {
            if (nickname.equals(kittens.getNickname()) & (age == kittens.getAge())) {
                param = false;
            }
        }
        if (param) {
            kittensArrayList.add(new Kittens.Builder()
                    .nickname(nickname)
                    .age(age)
                    .growth(growth)
                    .weight(weight)
                    .color(color)
                    .sale(sale)
                    .build());
            writeFile();
        } else {
            throw new DuplicatesException("This kitten is already on the list!\n");
        }
    }


    //Метод, возвращающий список котят
    private static void listKits() {
        System.out.println("| ID | Nickname | Age | Growth | Weight | Color| Sale | \nList of kittens: \n");
        int i = 0;
        for (Kittens k : kittensArrayList) {
            i++;
            if (k.getSale()) {
                System.out.println(i + ". Nickname: " + k.getNickname() + "; Age: " + k.getAge() + "; Growth: " +
                        k.getGrowth() + "; Weight: " + k.getWeight() + "; Color: " + k.getColor() +
                        "; Sale: Yes");

            } else {
                System.out.println(i + ". Nickname: " + k.getNickname() + "; Age: " + k.getAge() + "; Growth: " +
                        k.getGrowth() + "; Weight: " + k.getWeight() + "; Color: " + k.getColor() +
                        "; Sale: No");
            }
        }
    }


    private static void writeFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Kittens.txt"))) {
            oos.writeObject(kittensArrayList);
            System.out.println("Success \n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
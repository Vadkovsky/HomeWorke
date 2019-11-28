package Collections.Map;

import java.util.HashMap;
import java.util.Scanner;

public class SaitMap {
    private static HashMap<String, String> mapVault = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int count;
        System.out.println("Введите количество пользователей:");
        count = scanner.nextInt();
        setMapVault(count);
        getPassword();
    }

    private static void setMapVault(int count) {
        for (int i = 0; i < count; i++) {
            int numUser = i + 1;
            String login;
            String password;
            System.out.println("Введите логин пользователю " + numUser);
            login = scanner.next();
            System.out.println("Введите пароль пользователю " + numUser);
            password = scanner.next();
            mapVault.put(login, password);
        }
    }

    private static void getPassword() {
        boolean trigger = true;
        do {
            String key;
            System.out.println("\nВведите логин пользователя чтобы получить пароль. \nДля выхода введите: exit");
            key = scanner.next();
            if ("exit".equals(key)) {
                trigger = false;
            } else if (mapVault.get(key) !=null){
                System.out.println("Пароль: " + mapVault.get(key));
            } else {
                System.out.println("Ошибка! Неверно введен логин/такой пользователь не существует!");
            }
        }
        while (trigger);
    }
}

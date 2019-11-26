package Collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SaitMap {
    private static int count; //кол-во людей
    private static Map<String, String> map = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

    }
    public static void setMap(){
        System.out.println("Введите количество пользователей");
        String command1 = scanner.next();
        count = Integer.parseInt(command1);
        for (int i=0; i<count; i++){

        }
    }
}

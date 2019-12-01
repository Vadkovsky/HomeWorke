package Stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DigitGeneration {
    public static void main(String[] args) {
        String symbols = "0123456789";
        StringBuilder randString = new StringBuilder();
        int count = 60 + (int) (Math.random() * 42);
        for (int i = 0; i < count; i++)
            randString.append(symbols.charAt((int) (Math.random() * symbols.length())));

        System.out.println(randString);

        List<Character> characters = randString.chars().mapToObj(m -> (char) m).collect(Collectors.toList());
        Map<Character, Integer> counts = characters.stream().collect(HashMap::new, (m, c) -> {
            if (m.containsKey(c))
                m.put(c, m.get(c) + 1);
            else m.put(c, 1);
        }, HashMap::putAll);
        System.out.println("Колличество чисел: " + characters.size());

        for (Map.Entry<Character, Integer> i : counts.entrySet()) {
            System.out.println("Число: " + i.getKey() + ", Количество: " + i.getValue() + ", В процентах: " +
                    calculationOfPercent(i.getValue().doubleValue(), Double.parseDouble(String.valueOf(characters.size()))));
        }
    }

    private static double calculationOfPercent(Double value, Double size) {
        return value * 100 / size;
    }
}


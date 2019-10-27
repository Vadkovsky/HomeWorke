package HomeworkEnum;

public class Utils {
    public static void main(String[] args) {
        String biba = "test text for color";
        print(biba);
        print(biba, EnumColor.ANSI_GREEN);
    }

    public static void print(String text) {
        System.out.println(text);
    }

    public static void print(String text, EnumColor color) {
        System.out.println(text + color.getColor()); //красит со второй итерации?
        System.out.println(text + color.getColor());
    }
}
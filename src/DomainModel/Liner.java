package DomainModel;

public class Liner extends Ships {
    @Override
    public void move() {
        System.out.println("Плыть");
    }

    @Override
    public void backing() {
        System.out.println("Запрака в порту");
    }

    @Override
    public void control() {
        System.out.println("Управление штурвалом с панелью упраления");
    }

    @Override
    public void location() {
        System.out.println("Включение спутниковой локации");
    }

    @Override
    public void distressСall() {
        System.out.println("Сигнал SOS по спутниковой связи и на радио частотах");
    }

    public void powerOn() {
        System.out.println("Включение запастного генератора энергии");
    }

    public void engineStart() {
        System.out.println("Включение запасного двигателя");
    }
}

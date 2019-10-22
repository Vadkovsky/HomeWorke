package DomainModel;

public class Barge extends Ships {
    @Override
    public void move() {
        System.out.println("Плыть в разных климатических словиях");
    }

    @Override
    public void backing() {
        System.out.println("Заправка в заправочной док станции");
    }

    @Override
    public void control() {
        System.out.println("Управление штурвалом с панелью приоров управления");
    }

    @Override
    public void location() {
        System.out.println("Включение спутниковой локации и эхолокации");
    }

    @Override
    public void distressСall() {
        System.out.println("Сигнал SOS по спутниковой связи");
    }

    public void hackIce() {
        System.out.println("Включаются пилы для рубки льда");
    }

    public void warm() {
        System.out.println("Включение системы отопления");
    }
}

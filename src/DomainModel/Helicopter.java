package DomainModel;

public class Helicopter extends Aircrafts {
    @Override
    public void move() {
        System.out.println("Лететь высоко!");
    }

    @Override
    public void backing() {
        System.out.println("Запркавка бензином СБ-78");
    }

    @Override
    public void control() {
        System.out.println("Лётчик управляет штурвалом");
    }

    @Override
    public void speedGainingHeight() {
        System.out.println("Быстро взмывает в небо");
    }

    @Override
    public void autopilot() {
        System.out.println("Автопилот держит высоту и уровень полёта");
    }

    public void attack() {
        System.out.println("Вертолёт сбрасывает касетные бомбы");
    }

    public void trapRelease() {
        System.out.println("Вертолёт выпускает тепловую ловушку");
    }
}

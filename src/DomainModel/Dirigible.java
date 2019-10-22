package DomainModel;

import javax.crypto.spec.PSource;

public class Dirigible extends Aircrafts {
    @Override
    public void move() {
        System.out.println("Полёт на короткие дистанции");
    }

    @Override
    public void backing() {
        System.out.println("Заправка газом");
    }

    @Override
    public void control() {
        System.out.println("Пилот управляет панелью управления");
    }

    @Override
    public void speedGainingHeight() {
        System.out.println("Медленное поднятие вверх");
    }

    @Override
    public void autopilot() {
        System.out.println("Фиксация установленных параметров высоты");
    }

    public void signalLights() {
        System.out.println("Включение сигнальных огней");
    }

    public void emergencyMode() {
        System.out.println("Включение экстренной посадки");
    }
}

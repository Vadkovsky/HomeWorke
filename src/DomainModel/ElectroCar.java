package DomainModel;

public class ElectroCar extends Cars {
    @Override
    public void move() {
        System.out.println("Жечь электричество и крутить 4 колеса");
    }

    @Override
    public void backing() {
        System.out.println("Заряжаться от розетки");
    }

    @Override
    public void control() {
        System.out.println("Управляется ИИ");
    }

    @Override
    public void speedGain() {
        System.out.println("Набирает 100км за 7 сек.");
    }

    @Override
    public void makingNoise() {
        System.out.println("Музыка, вместо шума двигателя");
    }

    public void automaticallyDoor() {
        System.out.println("Двери открываются при подходе водителя");
    }

    public void voiceAssistant() {
        System.out.println("Привет! Я голосовой помощник. Чем могу помочь?");
    }
}

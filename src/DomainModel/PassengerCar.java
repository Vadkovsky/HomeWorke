package DomainModel;

public class PassengerCar extends Cars {
    @Override
    public void move() {
        System.out.println("Жечь бензин и крутить 4 колеса");
    }

    @Override
    public void backing() {
        System.out.println("Заливать в себя много бензина");
    }

    @Override
    public void control() {
        System.out.println("Водитель управляет 2 колёсами");
    }

    @Override
    public void speedGain() {
        System.out.println("Набирает 100км за 17 сек.");
    }

    @Override
    public void makingNoise() {
        System.out.println("Звук в 60 децибел");
    }

    public void boils() { //машина закипает
        System.out.println("Машина закипела и сломалась");

    }

    public void makingBass() {
        System.out.println("Наваливает басс пацанам");
    }
}

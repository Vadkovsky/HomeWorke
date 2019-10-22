package DomainModel;

public class Motorcycle extends Cars {
    @Override
    public void move() {
        System.out.println("Жечь бензин и крутить 2 колеса");
    }

    @Override
    public void backing() {
        System.out.println("Заливать в себя немного бензина");
    }

    @Override
    public void control() {
        System.out.println("Водитель управляет 1 колёсом");
    }

    @Override
    public void speedGain() {
        System.out.println("Набирает 100км за 30 сек., если толчка");
    }

    @Override
    public void makingNoise() {
        System.out.println("Врум-врум, мазафака");
    }

    public void headlight() {
        System.out.println("Светит фарой");
    }

    public void stuffed() {
        System.out.println("Превращается в фарш");
    }

}

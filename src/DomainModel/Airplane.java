package DomainModel;

public class Airplane extends Aircrafts {
    @Override
    public void move() {
        System.out.println("Лететь далеко!");
    }

    @Override
    public void backing() {
        System.out.println("Лейте больше киросина!");
    }

    @Override
    public void control() {
        System.out.println("Два лётчика управляют двумя штурвалом и панелью управления");
    }

    @Override
    public void speedGainingHeight() {
        System.out.println("Постепенно набирает высоту");
    }

    @Override
    public void autopilot() {
        System.out.println("Придерживается правильного курса при оптимальных условиях");
    }
    public void voiceConnection(){
        System.out.println("Объявление сообщений по громкой связи");
    }
    public void rescueMask(){
        System.out.println("В салоне из ясщиков выпадают кислородные маски");
    }
}

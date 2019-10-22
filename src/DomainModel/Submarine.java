package DomainModel;

public class Submarine extends Ships {

    public static void main(String[] args) {
        ClassCastDeath classCastDeath = new ClassCastDeath();
        classCastDeath.getDeath();
    }

    @Override

    public void move() {
        System.out.println("Плыть под водой");
    }

    @Override
    public void backing() {
        System.out.println("Заправка из резервных баков с топливым");
    }

    @Override
    public void control() {
        System.out.println("Сложная панель управления для трёх человек");
    }

    @Override
    public void location() {
        System.out.println("Включение эхолокации");
    }

    @Override
    public void distressСall() {
        System.out.println("Сигнал SOS военной базе");
    }

    public void depthMeasurement() {
        System.out.println("Измерение глубины и внешнего давления");
    }

    public void weaponLaunch() {
        System.out.println("Запуск ядерного оружия");
    }

    static class ClassCastDeath {
        private void getDeath() {
            String death = "Включен режим самоуничтожения";
            System.out.println(death);
        }
    }
}

package DomainModel;

public abstract class Cars implements Transports {
    @Override
    public void move() {
        System.out.println("Я не понимаю что делаю. И походу не понимаю полиморфизм. " +
                "Смысл описывать методы в абстрактном классе," +
                " если при наследовании в обычные классы из абстрактного методы просто вызываются?" +
                "Из-за этого у меня разные машины ни чем не отличаются(((");
    }

    @Override
    public void backing() {
        System.out.println("Я не понимаю зачем нужен this и super");
    }

    @Override
    public void control() {
        System.out.println("Я могу понять что написать в главном методе и наследуются ли вложенные классы в абстранктных классах");
    }
}
class passengerCar extends Cars{
    @Override
    public void move() {
        super.move();
    }
}
class motorcycle extends Cars{
    @Override
    public void backing() {
        super.backing();
    }
}
class electroCar extends Cars{
    @Override
    public void control() {
        super.control();
    }
}
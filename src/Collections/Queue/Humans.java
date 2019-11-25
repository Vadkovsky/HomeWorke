package Collections.Queue;

public class Humans implements Comparable {
    private String name;
    private int age;

    Humans(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        if( this.getAge() > 62 ){
            return -1;
        } if( this.getAge() < 62 ){
            return 1;
        }
        return 0;
    }
}

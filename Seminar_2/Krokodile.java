package Seminar_2;

public class Krokodile extends Animal implements Runable, Swimable {
    
    public Krokodile(String name, int box) {
        super(name, box);
    }

    @Override
    public String say() {
        return "Грррр";
    }

    @Override
    public int speedOfRun() {
        return 10;
    }

    @Override
    public int speedOfSwim() {
        return 40;
    }
}

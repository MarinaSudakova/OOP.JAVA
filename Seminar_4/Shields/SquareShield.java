package Seminar_4.Shields;

import java.util.Random;

public class SquareShield extends Shield {

    public SquareShield(int countUpForHealth) {
        super(countUpForHealth);
    }

    @Override
    public int safeHero() {
        return new Random().nextInt(0, countUpForHealth);
    }

    public int getCountUpForHealth() {
        return countUpForHealth;
    }
    @Override
    public String toString() {
        return String.format("Square Shield : count for up health %d", countUpForHealth);
    }

    
    
}

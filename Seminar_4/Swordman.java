package Seminar_4;
import Seminar_4.Weapons.Sword;
// меченосец

public class Swordman extends Warrior {

    public Swordman(String name, int healthPoint, Sword sword) {
        super(name, healthPoint, sword);
    }

    @Override
    public String toString() {
        return "Swordman " + super.toString();
    }
    
}

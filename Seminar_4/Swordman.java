package Seminar_4;
import Seminar_4.Shields.RoundShield;
import Seminar_4.Weapons.Sword;
// меченосец

public class Swordman extends Warrior {

    public Swordman(String name, int healthPoint, Sword sword, RoundShield shield) {
        super(name, healthPoint, sword, shield);
    }

    @Override
    public String toString() {
        return "Swordman " + super.toString();
    }

    public int getCountUpForHealth(){
        return ((RoundShield) getShield()).getCountUpForHealth();
    }
    
}

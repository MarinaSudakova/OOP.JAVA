package Seminar_4;
import Seminar_4.Shields.SquareShield;
import Seminar_4.Weapons.Bow;

// лучник
public class Archer extends Warrior{

    /**
     * @param name
     * @param healthPoint
     * @param bow
     */
    public Archer(String name, int healthPoint, Bow bow, SquareShield shield) {
        super(name, healthPoint, bow, shield);
    }

    @Override
    public String toString() {
        return "Archer, " + super.toString();
    }

    public int shotRange(){
        return ((Bow) getWeapon()).getRange();
    }
    
    public int getCountUpForHealth(){
        return ((SquareShield) getShield()).getCountUpForHealth();
    }
}

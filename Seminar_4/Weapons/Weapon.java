package Seminar_4.Weapons;

import Seminar_4.Weaponable;

public abstract class Weapon implements Weaponable{
    protected int pointOfDamage;

    public Weapon(int pointOfDamage) {
        this.pointOfDamage = pointOfDamage;
    }

    
}

package Seminar_4.Shields;

import Seminar_4.Shieldable;

public abstract class Shield implements Shieldable{
    protected int countUpForHealth;

    public Shield(int countUpForHealth){
        this.countUpForHealth = countUpForHealth;
    }
    
}

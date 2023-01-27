package Seminar_4;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<E extends Warrior> implements Iterable<E> {
    private List<E> team = new ArrayList<>();

    public Team<E> addWarrior(E person) {
        team.add(person);
        return this;
    }

    @Override
    public Iterator<E> iterator() {
        return team.iterator();
    }

    public int maxTeamRange() {
        int maxRange = 0;
        for (E item : team) {
            if (item instanceof Archer) {
                if (((Archer)item).shotRange() > maxRange) {
                    maxRange = ((Archer)item).shotRange();
                }
            }
        };
        System.out.println("Max team range is : ");
        return maxRange;
    }
    
    public int maxTeamSafe() {
        int maxSave = 0;
        for (E item : team) {
            if (item instanceof Archer) {
                if (((Archer)item).getCountUpForHealth() > maxSave) {
                    maxSave = ((Archer)item).getCountUpForHealth();
                }
            }
            else if (item instanceof Swordman){
                if (((Swordman)item).getCountUpForHealth() > maxSave) {
                    maxSave = ((Swordman)item).getCountUpForHealth();
                }
            }
        };
        System.out.println("Max team range is : ");
        return maxSave;
    }
}

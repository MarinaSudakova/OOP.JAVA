package Seminar_2;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private ArrayList<Animal> animals;

    private Radio radio = new Radio();

    public Zoo() {
        animals = new ArrayList<Animal>();
    }

    public Zoo addAnimal (Animal a) {
        animals.add(a);
        return this;
    }
    public List<Speakable> getSpeakables () {
        List<Speakable> answer = new ArrayList<Speakable>();
        for (Animal an : animals) {
            answer.add(an);
        }
        answer.add(radio);
        return answer;
    }

    public List<Runable> getRunner () {
        List<Runable> result = new ArrayList<Runable>();
        for (Animal an : animals) {
            if (an instanceof Runable) {
                result.add((Runable)an);
            }
        }
        return result;

    }

    public int getChampionOfRunners () {
        int max = 0;
        for (Runable runner : getRunner()) {
            if (max < runner.speedOfRun()) {
                max = runner.speedOfRun();
            }
        }

        return max;
    }

    public List<Flyable> getFlyers () {
        List<Flyable> result = new ArrayList<Flyable>();
        for (Animal an : animals) {
            if (an instanceof Flyable) {
                result.add((Flyable)an);
            }
        }
        return result;
    }
    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public List<Swimable> getSwimer () {
        List<Swimable> result = new ArrayList<Swimable>();
        for (Animal an : animals) {
            if (an instanceof Swimable) {
                result.add((Swimable)an);
            }
        }
        return result;

    }

    public int getChampionOfSwimers () {
        int max = 0;
        // Animal winner;
        for (Swimable swimer : getSwimer()) {
            if (max < swimer.speedOfSwim()) {
                max = swimer.speedOfSwim();
                // winner = (Animal)swimer;
            }
        }
        // System.out.println((Animal)winner);
        return max;
    }
}

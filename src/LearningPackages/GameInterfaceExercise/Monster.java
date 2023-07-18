package LearningPackages.GameInterfaceExercise;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{

    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        List<String> list = new ArrayList<>();
        list.add(name);
        list.add(Integer.toString(hitPoints));
        list.add(Integer.toString(strength));
        return list;
    }

    @Override
    public void read(List<String> list) {
        if(list == null || list.size() == 0)
            return;
        name = list.get(0);
        hitPoints = Integer.valueOf(list.get(1));
        strength = Integer.valueOf(list.get(2));
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }
}

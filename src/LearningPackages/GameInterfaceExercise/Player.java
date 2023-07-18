package LearningPackages.GameInterfaceExercise;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private String weapon;

    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    @Override
    public List<String> write() {
        List<String> list = new ArrayList<>();
        list.add(name);
        list.add(Integer.toString(hitPoints));
        list.add(Integer.toString(strength));
        list.add(weapon);
        return list;
    }

    @Override
    public void read(List<String> list) {
        if(list == null || list.size() == 0)
            return;
        name = list.get(0);
        hitPoints = Integer.valueOf(list.get(1));
        strength = Integer.valueOf(list.get(2));
        weapon = list.get(3);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    //          getters
    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    //          setters

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }


}

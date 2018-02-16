package com.example.bins.rookieagent;

public class Personnage {
    private int experience, level, gunControl, stressControl, moral, logic, health;
    private String name, surname;

    public Personnage(int experience, int level, int gunControl, int stressControl, int health, int moral, int logic, String name, String surname) {
        this.experience = experience;
        this.level = level;
        this.gunControl = gunControl;
        this.stressControl = stressControl;
        this.moral = moral;
        this.logic = logic;
        this.name = name;
        this.surname = surname;
        this.health = health;
    }

    // region Getter and Setter
    public int getExperience() {
        return experience;
    }

    public void addExperience(int experience) {
        this.experience = this.experience + experience;
    }

    public int getLevel() {
        return level;
    }

    public void addLevel(int level) {
        this.level = this.level + level;
    }

    public int getGunControl() {
        return gunControl;
    }

    public void addGunControl(int gunControl) {
        this.gunControl = this.gunControl + gunControl;
    }

    public int getStressControl() {
        return stressControl;
    }

    public void addStressControl(int stressControl) {this.stressControl = this.stressControl + stressControl;}

    public int getMoral() {
        return moral;
    }

    public void addMoral(int moral) {
        this.moral = this.moral + moral;
    }

    public int getLogic() {
        return logic;
    }

    public void addLogic(int logic) {
        this.logic = this.logic + logic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    //endregion
}
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
        if (this.experience < 1500) {
            this.experience += experience;
        }
    }

    public int getLevel() {
        return this.level = (experience / 100) + 1;
    }

    public void addLevel() {
        if (this.level <= 15) {
            this.level += 1;
        }
    }

    public int getGunControl() {
        return gunControl;
    }

    public void addGunControl(int gunControl) {
        if (this.stressControl <= 15) {
            this.gunControl += gunControl;
        }
    }

    public int getStressControl() {
        return stressControl;
    }

    public void addStressControl(int stressControl) {
        if (this.stressControl <= 15) {
            this.stressControl += stressControl;
        }
    }

    public int getMoral() {
        return moral;
    }

    public void addMoral(int moral) {
        if (this.moral <= 5) {
            this.moral += moral;
        }
    }

    public int getLogic() {
        return logic;
    }

    public void addLogic(int logic) {
        if (this.logic <= 5) {
            this.logic += logic;
        }
    }

    public void addHealth(int health) {
        if (this.health <= 100) {
            this.health += health;
        }
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

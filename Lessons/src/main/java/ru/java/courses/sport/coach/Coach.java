package ru.java.courses.sport.coach;

public class Coach {

    public String name;
    public int experience;

    public Coach(String name){
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("");
        }
        this.name = name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }
}

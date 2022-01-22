package ru.java.courses.sport;

public class Athlete  {

    public String name;

    public boolean active;

    public Athlete(String name) {
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("");
        }
        this.name = name;
        this.active = true;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

}

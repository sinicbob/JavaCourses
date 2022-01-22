package ru.java.courses.sport;

public enum PlayerRole {
    GOALKEEPER("Вратарь"),
    DEFENDER("Защитник"),
    WINGER("Нападающий");

    private String name;

    PlayerRole(String name) {
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("");
        }else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

}
